package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.dividirDoisNumeros02(20,2));
        System.out.println("------------------");
        calculadora.imprimirDivisaoDeDoisNumeros(86,5);
    }
}
