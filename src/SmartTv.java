public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void AumentarCanal(){
        canal++;
        System.out.println("Aumentar de canal para : " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuir de canal para : " + canal);
    }

    public void aumentarVolume() {
        volume++;
        //volume = volume + 1;
        System.out.println("Aumentar volume para :" + volume);
    }

    public void diminuirVolume() {
        volume--;
        //volume = volume + 1;
        System.out.println("Diminuir volume para :" + volume);
        
    }

    public void ligar () {
        ligada = true;
    }

    public void desligar () {
        ligada = false;
        
    }

}