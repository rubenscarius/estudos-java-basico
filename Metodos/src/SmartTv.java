/**
 * Represents a Smart TV with basic functionality for power, volume, and channel control.
 * 
 * This class provides methods to turn the TV on and off, 
 * and adjust volume and channel settings.
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volume para: " + volume);
        volume++;
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo o volume para: " + volume);
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
}
