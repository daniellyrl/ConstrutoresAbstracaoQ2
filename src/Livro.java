public class Livro extends Produtos implements PreçoFixo {
    public Livro(String nome, double preço){
        super(nome, preço);
    }
    @Override
    public double PreçoFixo(){
        return this.preço;
    }
}
