public class Eletronico extends Produtos {
    public Eletronico(String nome, double preço){
        super(nome, preço);
    }
    @Override
    public double desconto(){
        return this.preço * 0.95;
    }
}
