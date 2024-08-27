//Dependency Inversion
public class Interruptor {
    private Dispositivo dispositivo;
    private boolean estado = false;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void presionar() {
        if (!estado) {
            dispositivo.prender();
            estado = true;
        } else {
            dispositivo.apagar();
            estado = false;
        }

    }
}