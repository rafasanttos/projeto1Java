package edu.rafael.primeirasemana;

public class SmartTv {

        boolean ligada = false;
        int canal = 1;
        int volume = 2;

        public void mudarCanal(int novoCanal){
                canal = novoCanal;
        }

        public void aumentarCanal(){
                canal++;
        }

        public void diminuirCanal(){
                canal--;
        }

        public void aumentarVolume(){
                if(this.volume>=100){
                        this.volume = 100;

                }else{
                        this.volume++;
                }

        }
        public void diminuirVolume(){
                if(this.volume<=0){
                        this.volume=0;
                }else{
                        this.volume--;
                }

        }


}
