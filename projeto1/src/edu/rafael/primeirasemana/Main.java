package edu.rafael.primeirasemana;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? "+smartTv.ligada);
        System.out.println("Qual o volume da tv? "+smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.canal);
        smartTv.mudarCanal(27);
        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Qual o volume da tv? "+smartTv.volume);


    }
}