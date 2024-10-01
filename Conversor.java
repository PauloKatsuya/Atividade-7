public class Conversor {

    public double converter(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double converter(double quilometros, boolean isKilometers) {
        return quilometros * 0.621371;
    }


    public String converter(String texto) {
        return texto.toUpperCase();
    }

    public static void main(String[] args) {
        Conversor conversor = new Conversor();


        double temperaturaF = conversor.converter(25); 
        System.out.println("25 °C em fahrenheit: " + temperaturaF);

        double milhas = conversor.converter(13, true); 
        System.out.println("10 km em milhas: " + milhas);

        String textoMaiusculo = conversor.converter("bom dia boa tarde e boa noite");
        System.out.println("Texto em maiúsculas: " + textoMaiusculo);
    }
}

/*
Pergunta:
Explique como a sobrecarga de métodos permite implementar várias versões do 
método converter(), mesmo com diferentes tipos de dados e funcionalidades.

REsposta:

A sobrecarga de métodos permite ter várias versões do mesmo método, como converter(), 
com diferentes tipos de parâmetros. Isso ajuda a implementar funcionalidades diferentes, 
como converter temperaturas, distâncias e strings, mantendo o código mais organizado e fácil de entender.
*/
