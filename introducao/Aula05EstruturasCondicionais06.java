package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 1;
        switch (dia) {
            case (1):
                System.out.println("Hoje é final de semana");
                break;
            case (2):
                System.out.println("Hoje é dia útil");
                break;
            case (3):
                System.out.println("Hoje é dia útil");
                break;
            case (4):
                System.out.println("Hoje é dia útil");
                break;
            case (5):
                System.out.println("Hoje é dia útil");
                break;
            case (6):
                System.out.println("Hoje é dia útil");
                break;
            case (7):
                System.out.println("Hoje é final de semana");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
