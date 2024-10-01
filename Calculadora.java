public class Calculadora {

    //soma dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    //soma três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    //soma double
    public double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int somaDoisInteiros = calc.somar(5, 10);          
        int somaTresInteiros = calc.somar(3, 4, 3);          
        double somaDouble = calc.somar(5.5, 5.5);         
        
        System.out.println("Soma de dois inteiros: " + somaDoisInteiros);
        System.out.println("Soma de três inteiros: " + somaTresInteiros);
        System.out.println("Soma de dois doubles: " + somaDouble);
    }
}

/*
Pergunta:
Descreva o mecanismo de sobrecarga de métodos e como ele difere da sobrescrita em termos de polimorfismo.

Respota:
A sobrecarga de métodos permite criar várias versões de um método com o 
mesmo nome, mas parametros diferentes.
*/
