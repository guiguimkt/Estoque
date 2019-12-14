package br.com.Estoque;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Livro> listLivro = new ArrayList<>();
    public static void main(String[] args) {
        ///List<Livro> listLivro = new ArrayList<>();

        Livro TM = new Livro(1, "Turma da Mônica", "Ziraldo", 1990, 123, 12, 10);
        Livro VG = new Livro(2, "Vingadores", "Stan Lee", 1978, 321, 0, 40);

        listLivro.add(TM);
        listLivro.add(VG);

        Hello();
    }

    public static void Hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nOlá, escolha uma das opções: \nA) Cadastrar Livro\nB)Consultar livro por código\nC) Efetuar venda\n");
        String opcao = scanner.next();

        if (opcao.equals("A") || opcao.equals("a")) { Cadastrar(); }
        else if (opcao.equals("B") || opcao.equals("b")){ Consultar(); }
        else if (opcao.equals("C") || opcao.equals("c")){ Vender(); }
        else {
            System.out.println("Selecione uma opção válida!\n");
        }

    }

    public static void Cadastrar() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o codigo do livro\n");
        int cod = scanner.nextInt();

        if (cod == 0) { System.out.println("Informe um valor!"); }

        System.out.print("Informe o titulo do livro\n");
        String titulo = scanner.next();

        if (titulo == "") { System.out.println("Informe um valor!"); }

        System.out.print("Informe o autor do livro\n");
        String autor = scanner.next();

        if (autor == "") { System.out.println("Informe um valor!"); }

        System.out.print("Informe o ano de lancamento do livro\n");
        int anoDeLancamento = scanner.nextInt();

        if (anoDeLancamento == 0) { System.out.println("Informe um valor!"); }

        System.out.print("Informe o codigo ISBN do livro\n");
        int codISBN = scanner.nextInt();

        if (codISBN == 0) { System.out.println("Informe um valor!"); }

        System.out.print("Informe a quantidade do livro\n");
        int qtd = scanner.nextInt();

        if (qtd == 0) { System.out.println("Informe um valor!"); }

        System.out.print("Informe o preco do livro\n");
        int preco = scanner.nextInt();

        if (preco == 0) { System.out.println("Informe um valor!"); }

        Livro livro = new Livro(cod, titulo, autor, anoDeLancamento, codISBN, qtd, preco);
        listLivro.add(livro);
        System.out.println("Livro cadastrado com sucesso!");

        Hello();
    }

    public static void Consultar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o codigo do livro\n");
        int cod = scanner.nextInt();

        if (cod == 0) { System.out.println("Informe um valor!\n"); }

        boolean tem = false;
        for (int i = 0; i < listLivro.size(); i++) {
            int codLivro = listLivro.get(i).getCodigo();
            if (codLivro == cod) {
                System.out.println("\n" + "Cod " + listLivro.get(i).getCodigo());
                System.out.println("Titulo " + listLivro.get(i).getTitulo());
                System.out.println("Autor " + listLivro.get(i).getAutor());
                System.out.println("Ano lancamento " + listLivro.get(i).getAnoDeLancamento());
                System.out.println("Cod ISBN " + listLivro.get(i).getCodISBN());
                System.out.println("Quantidade estoque" + listLivro.get(i).getQuantEstoque());
                System.out.println("Preco " + listLivro.get(i).getPreco());
                tem = true;
            }
        }

        if (tem == false) {
            System.out.println("Livro não encontrado!");
        }

        Hello();
    }

    public static void Vender() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o codigo do livro\n");
        int cod = scanner.nextInt();

        if (cod == 0) { System.out.println("Informe um valor!\n"); }

        for (int i = 0; i < listLivro.size(); i++) {
            int codLivro = listLivro.get(i).getCodigo();
            int qtd = listLivro.get(i).getQuantEstoque();
            String nome = listLivro.get(i).getTitulo();
            if (codLivro == cod) {
                if (qtd > 0) {
                    listLivro.get(i).setQuantEstoque(qtd-1);
                    System.out.println("Livro " + nome + " vendido");
                }
                else {
                    System.out.println("Livro fora de estoque");
                }
            }
        }
        Hello();
    }
}