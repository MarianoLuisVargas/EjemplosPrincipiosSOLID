import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Single responsability
public class Dado {
    private List<Integer> numbers;

    public Dado(Integer[] numbers) {
        this.numbers = Arrays.asList(numbers);
    }
//Interface Segregation
    public String throwDice(){
        this.randomizeArray();
        int randomNumber = this.getRandomNumber();
       return "El resultado es: " + randomNumber;
    }

    private void randomizeArray() {
        Collections.shuffle(this.numbers);
    }

    private int getRandomNumber() {
        int randomNumber = this.numbers.getFirst();
        return randomNumber;
    }

}
