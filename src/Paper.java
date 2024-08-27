public class Paper extends Figura {

    public Paper() {
        super();
    }

    @Override
    public String jugar(Piedra figura) {
        return "Ganaste";
    }

    @Override
    public String jugar(Paper figura) {
        return "Empate";
    }

    @Override
    public String jugar(Tijera figura) {
        return "Perdiste";
    }

    /*
    @Override

    public String jugar(Spock figura) {
        return "Ganaste";
    }

    @Override
    public String jugar(Lagarto figura) {
        return "Perdiste";
    }
    */

}

