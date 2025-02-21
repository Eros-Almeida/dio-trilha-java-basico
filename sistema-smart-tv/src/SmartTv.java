//Exemplo de Classe para representar uma SmartTv
// 1. Ela tenha características: Ligada(booleano), canal(int), volume(int)
// 2. TV irá ligar/desligar e assim mudar o estado ligada
// 3. TV aumentar/diminuir volume em +1/-1
// 4. TV aumentar/diminuir canal em +1/-1 ou definindo o número do canal

public class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume=10;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void mudarCanal(int novoCanal){
        canal=novoCanal;
        System.out.println("Mudando o canal para: " + canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }
}