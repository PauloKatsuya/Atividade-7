class Pagamento {
    public void processarPagamento() {
        System.out.println("Processando pagamento genérico");
    }
}

class PagamentoCartao extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via cartão de crédito");
    }
}

class PagamentoBoleto extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via boleto bancário");
    }
}

public class realizarPagamento {
    public static void main(String[] args) {
        
        Pagamento pagamentoCartao = new PagamentoCartao();
        Pagamento pagamentoBoleto = new PagamentoBoleto();

        pagamentoCartao.processarPagamento();
        pagamentoBoleto.processarPagamento(); 
    }
}

/*
Pergunta:
Como o polimorfismo por sobrescrita facilita a 
implementação de diferentes formas de pagamento dentro de um sistema sem alterar o código da classe base?

Resposta:
Isso permite que subclasses implementem o mesmo método de maneiras diferentes, 
como processarPagamento(). Isso facilita a adição de novos tipos de pagamento sem modificar a classe base, 
tornando o sistema mais fácil de manter e expandir.
*/
