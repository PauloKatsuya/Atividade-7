class Veiculo {
    public void mover() {
        System.out.println("O veículo está se movendo");
    }
}

class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está dirigindo");
    }
}

class Bicicleta extends Veiculo {
    @Override
    public void mover() {
        System.out.println("A bicicleta está pedalando");
    }
}

public class Main {
    public static void main(String[] args) {

        Veiculo Carrao = new Carro();
        Veiculo Bike = new Bicicleta();

        Carrao.mover();       
        Bike.mover();  
    }
}

/*
Pergunta:
Explique como a sobrescrita de métodos permite comportamentos diferentes para objetos da mesma hierarquia.

Respota:
A sobrescrita de métodos permite que subclasses alterem o comportamento de 
métodos herdados da classe base. Isso possibilita que objetos da mesma hierarquia 
executem ações específicas.
*/
