//Dependency Inversion
public class Interruptor {
    final private Dispositivo DISPOSITIVO;
    private boolean estado = false;

    public Interruptor(Dispositivo dispositivo) {
        this.DISPOSITIVO = dispositivo;
    }

    public void presionar() {
        if (!estado) {
            DISPOSITIVO.prender();
            estado = true;
        } else {
            DISPOSITIVO.apagar();
            estado = false;
        }

    }
}