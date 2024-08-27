public class Lagarto extends Figura {

    public Lagarto() {
        super();
    }

    @Override
    public String jugar(Piedra figura) {
        return "Perdiste";
    }

    @Override
    public String jugar(Paper figura) {
        return "Ganaste";
    }

    @Override
    public String jugar(Tijera figura) {
        return "Perdiste";
    }

    /*
    @Override
    public String jugar(Spock figura) {
        return "Perdiste";
    }

    @Override
    public String jugar(Lagarto figura) {
        return "Empate";
    }

     */
}

