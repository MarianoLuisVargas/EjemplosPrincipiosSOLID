public class Piedra extends Figura {

    public Piedra() {
        super();
    }

    @Override
    public String jugar(Piedra figura) {
        return "Empate";
    }

    @Override
    public String jugar(Paper figura) {
        return "Perdiste";
    }

    @Override
    public String jugar(Tijera figura) {
        return "Ganaste";
    }

        /*
    @Override

    public String jugar(Spock figura) {
        return "Perdiste";
    }

    @Override
    public String jugar(Lagarto figura) {
        return "Ganaste";
    }
    */
}
