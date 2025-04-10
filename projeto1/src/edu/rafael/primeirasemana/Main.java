package edu.rafael.primeirasemana;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Rafael dos santos";
        double peso = 42.45;
        String imc;
        String nome1 ="Rafael";
        if(peso<55.20){
            imc="Muito Magro";
            System.out.println(nome1+"seu imc é "+imc);
        }
        else{
            imc = "Peso ideal";
            System.out.println(nome1+ "Seu imc é"+imc);
        }

        final String IDENTIFICATION = "Forsberg";
        System.out.println(IDENTIFICATION);


        System.out.println("Hello "+ nome);
        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}