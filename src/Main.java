public class Main {
    public static void main(String[] args) {
        //Single Responsibility
        Integer[] numbers = {1,2,3,4,5,6};
        Dado dado = new Dado(numbers);

        System.out.println("Ejemplo 1");

        System.out.println(dado.throwDice());

        System.out.println("-----------------");

        //Open Close
        Piedra piedra = new Piedra();
        Paper papel = new Paper();
        Tijera tijera = new Tijera();

        System.out.println("Ejemplo 2");

        System.out.println(piedra.jugar(piedra));
        System.out.println(piedra.jugar(papel));
        System.out.println(piedra.jugar(tijera));

        System.out.println("-----------------");

        //Liskov Substitution
        Vehiculo vehiculo = new Vehiculo();
        Auto auto = new Auto();
        Bicicleta bicicleta = new Bicicleta();

        System.out.println("Ejemplo 3");

        System.out.println(vehiculo.mover());
        System.out.println(auto.mover());
        System.out.println(bicicleta.mover());

        System.out.println("-----------------");

        System.out.println("Ejemplo 4: en el metodo throwDice de dado");
        System.out.println("-----------------");

        Lampara lampara = new Lampara();
        Interruptor interruptor = new Interruptor(lampara);

        System.out.println("Ejemplo 5");

        interruptor.presionar();
        interruptor.presionar();

        System.out.println("-----------------");
    }
}