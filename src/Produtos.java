public class Produtos {
    protected String nome;
    protected double preço;

    public Produtos(String nome, double preço){
        this.nome = nome;
        this.preço = preço;
    }

    public double desconto(){
        System.out.println("Este produto recebe desconto");
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
