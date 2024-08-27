public class Lampara implements Dispositivo {
    @Override
    public void prender() {
        System.out.println("La lámpara está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La lámpara está apagada.");
    }
}
