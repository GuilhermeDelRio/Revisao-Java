public class Jogo {
    private String Titulo;
    private int ClassificacaoEtaria;
    private double preco;

    @Override
    public String toString() {
        return "Jogo{" +
                "Titulo='" + Titulo + '\'' +
                ", ClassificacaoEtaria=" + ClassificacaoEtaria +
                ", preco=" + preco +
                '}';
    }

    public Jogo() {}

    public Jogo(String titulo, int classificacaoEtaria, double preco) {
        Titulo = titulo;
        ClassificacaoEtaria = classificacaoEtaria;
        this.preco = preco;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getClassificacaoEtaria() {
        return ClassificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        ClassificacaoEtaria = classificacaoEtaria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(int percentualDesconto) {
        var valorAtual = this.getPreco();
        var valorDesconto = valorAtual - (valorAtual / percentualDesconto) * 100;
        setPreco(valorDesconto);
    }

    public void aumentarPreco(int percentualAumento) {
        var valorAtual = getPreco();
        var valorAumento = valorAtual + (valorAtual / percentualAumento) * 100;
        setPreco(valorAumento);
    }

    public void atualizarClassificacao(int novaClassificacao) {
        setClassificacaoEtaria(novaClassificacao);
    }
}
