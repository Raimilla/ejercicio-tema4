package com.company;

public class Main {

    public static void main(String[] args) {
        // if, else if y else
        int numeroIf = -2;

        if (numeroIf<0){
            System.out.println(" negativo");
        }
        else if(numeroIf>0){
            System.out.println(" positivo");
        } else {
            System.out.println("La variable es 0");
        }

        //while
        int numeroWhile = 1;

        while(numeroWhile < 3){

            System.out.println(+ numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        //do while
        int numeroDoWhile = 7;
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        }while(numeroDoWhile < 3);

        //for
        int numeroFor = 0;
        for( ; numeroFor <=3 ; numeroFor++){
            System.out.println(numeroFor);
        }

        //switch
        String estacion = "Marte";
        switch(estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("Escribe una estación");
        }
    }
}