package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double taxaDeImposto;
        double salario = 100000;
        if (salario <= 34712) {
            taxaDeImposto = 9.70 / 100;
        } else if (salario > 34712 && salario <= 68507) {
            taxaDeImposto = 37.35 / 100;
        } else {
            taxaDeImposto = 49.50 / 100;
        }
        System.out.println("O valor de imposto a ser pago é de " + (salario*taxaDeImposto));
    }
}
