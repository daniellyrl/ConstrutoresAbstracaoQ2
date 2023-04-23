public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Tudo é rio",30);
        Eletronico e1 = new Eletronico("Smartphone",3000);
        Roupa r1 = new Roupa("Calça",300);

        System.out.println("Informações do Livro: \n" +
                        "Nome: " + l1.getNome() + "\n" +
                        "Preço: " + l1.PreçoFixo() + "\n");

        System.out.println("Informações do Eletrónico: \n" +
                "Nome: " + e1.getNome() + "\n" +
                "O preço do eletrónico inicialmente é: " + e1.getPreço() + "\n" +
                "O preço do eletrónico após o desconto é: " + e1.desconto() + "\n");

        System.out.println("Informações da Roupa: \n" +
                "Nome: " + r1.getNome() + "\n" +
                "O preço da roupa inicialmente é: " + e1.desconto() + "\n" +
                "O preço da roupa após o desconto é: " + e1.desconto());
    }
}