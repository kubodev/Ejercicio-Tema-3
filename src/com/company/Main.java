package com.company;

public class Main {

    public static void main(String[] args) {

        int param1 = 20;
        int param2 = 5;
        int param3 = 10;

        int resultado = suma(param1,param2,param3);

        System.out.println(resultado);

        Coche miPotato = new Coche();

        miPotato.PonerPuertas();
        System.out.println(miPotato.puertas);
    }

    public static int suma(int a,int b,int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 2;

    public void PonerPuertas() {
        this.puertas++;
    }
}
