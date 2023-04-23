public class Roupa extends Produtos {
    public Roupa(String nome, double preço){
        super(nome, preço);
    }
    @Override
    public double desconto(){
        return this.preço * 0.9;
    }
}
