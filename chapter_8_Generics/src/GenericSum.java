import java.util.ArrayList;
import java.util.List;

public class GenericSum<T extends Number> {

    private List<T> numbers;

    public GenericSum() {
        numbers = new ArrayList<>();
    }

    public void addNumber(T number) {
        numbers.add(number);
    }

    public double sum() {
        double sum = 0;
        for (T number : numbers) {
            if (number instanceof Integer) {
                sum += (Integer) number;
            } else if (number instanceof Double) {
                sum += (Double) number;
            } else if (number instanceof Float) {
                sum += (Float) number;
            } else if (number instanceof Long) {
                sum += (Long) number;
            } else if (number instanceof Short) {
                sum += (Short) number;
            } else if (number instanceof Byte) {
                sum += (Byte) number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        GenericSum<Number> genericSum = new GenericSum<>();

        genericSum.addNumber(10);      // Integer
        genericSum.addNumber(20.5);    // Double
        genericSum.addNumber(15.3f);   // Float
        genericSum.addNumber(5L);      // Long

        double result = genericSum.sum();
        System.out.println("The sum of numbers is: " + result);
    }
}

