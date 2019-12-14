package br.com.Estoque;

public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private int anoDeLancamento;
    private int codISBN;
    private int quantEstoque;
    private float preco;

    public Livro (int codigo, String titulo, String autor, int anoDeLancamento, int codISBN, int quantEstoque, float preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
        this.codISBN = codISBN;
        this.quantEstoque = quantEstoque;
        this.preco = preco;
    }

    //Métodos públicos
    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public int getCodISBN() {
        return codISBN;
    }
    public void setCodISBN(int codISBN) {
        this.codISBN = codISBN;
    }
    public int getQuantEstoque() {
        return quantEstoque;
    }
    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

//    @Override
//    public void cadastrarLivro(int codigo, String titulo, String autor, int anoDeLancamento, int codISBN, int quantEstoque, float preco) {
//        Object livro = new ;
//        livro.codigo = codigo;
//        livro.titulo = titulo;
//        livro.autor = autor;
//        livro.anoDeLancamento = anoDeLancamento;
//        livro.codISBN = codISBN;
//        livro.quantEstoque = quantEstoque;
//        livro.preco = preco;
//    }
//
//    @Override
//    public void cadastrarLivro() {
//
//    }
//
//    @Override
//    public void consultarLivro() {
//
//    }
//
//    @Override
//    public void vender() {
//
//    }
}