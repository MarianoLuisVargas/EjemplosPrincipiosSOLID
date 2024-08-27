public class Spock extends Figura {

    public Spock() {
        super();
    }

    @Override
    public String jugar(Piedra figura) {
        return "Ganaste";
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
    public String jugar(Lagarto figura) {
        return "Perdiste";
    }

    @Override
    public String jugar(Spock figura) {
        return "Empate";
    }

     */
}
