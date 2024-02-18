package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.marca = "Siena";
        carro01.cor = "Azul";
        carro01.ano = 2006;

        Carro carro02 = new Carro();
        carro02.marca = "Corolla";
        carro02.cor = "Vermelho";
        carro02.ano = 2010;

        carro01 = carro02;

        System.out.println(carro01.marca + " " + carro01.cor + " " + carro01.ano);
        System.out.println(carro02.marca + " " + carro02.cor + " " + carro02.ano);
    }
}
