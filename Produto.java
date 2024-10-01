public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;


    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.qtdEstoque = 0;
    }


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = 0;
    }

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }
    
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + qtdEstoque);
        System.out.println();
    }

    public static void main(String[] args) {

        Produto produto1 = new Produto("Caderno");
        Produto produto2 = new Produto("Caneta", 2.50);
        Produto produto3 = new Produto("Laptop", 2500.00, 10);

        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();
    }
}

/*
Pergunta:
Discuta como a sobrecarga de construtores facilita a criação de objetos com 
diferentes conjuntos de informações, permitindo flexibilidade na instânciação de objetos.

Respota:
A sobrecarga de construtores permite criar objetos com diferentes conjuntos de informações,
deixando mais facil instanciar.
*/
