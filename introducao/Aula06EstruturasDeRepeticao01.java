package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int contador = 12;
        while (contador <= 10) {
            System.out.println(++contador);
        }

        contador = 0;
        do {
            System.out.println("Dentro do Do-While" + ++contador);
        }while (contador <= 10);

        contador = 0;
        for (contador = 0 ; contador <= 10 ; contador++) {
            System.out.println("For " + contador);
        }
    }
}
