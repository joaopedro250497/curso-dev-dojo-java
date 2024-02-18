package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if (c = false) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
        int idadeExemplo = 21;
        if (idadeExemplo >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
