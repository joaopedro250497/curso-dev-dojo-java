package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 6000;
        // (condição) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu doarei R$500,00 para o DevDojo" : "Ainda não tenho condições de doar";

        System.out.println(resultado);
    }
}
