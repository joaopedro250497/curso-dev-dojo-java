package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = (double) numero01 / numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == != (Sempre retornam booleanos!)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("É dez maior que vinte? " + isDezMaiorQueVinte);
        System.out.println("É dez menor que vinte? " + isDezMenorQueVinte);
        System.out.println("É dez igual a vinte? " + isDezIgualVinte);
        System.out.println("É dez igual a dez? " + isDezIgualDez);
        System.out.println("É dez diferente a dez? " + isDezDiferenteDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > 5000 || valorTotalContaPoupança > 5000;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // == += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; //800
        bonus *= 2; // 3600
        bonus /= 2; // 900
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador ++;
        contador --;
        ++ contador;
        -- contador;
        int contador2 = 0;
        System.out.println(contador2++);
    }
}
