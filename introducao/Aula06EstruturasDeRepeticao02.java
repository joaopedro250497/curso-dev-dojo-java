package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int contador = 2;
        while (contador <= 1000000) {
            if (contador % 2 ==0) {
                System.out.println(contador);
                contador++;
            } else {
                contador++;
            }
        }
    }
}
