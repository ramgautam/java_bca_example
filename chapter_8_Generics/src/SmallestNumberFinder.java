public class SmallestNumberFinder {

    public static <T extends Comparable<T>> T findSmallest(T... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }

        T smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].compareTo(smallest) < 0) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Integer smallestInt = findSmallest(3, 7, 1, 9, 4, 5, 2, 8, 6, 10);
        System.out.println("Smallest Integer: " + smallestInt);

        Double smallestDouble = findSmallest(3.5, 7.8, 1.2, 9.1, 4.7, 5.0, 2.3, 8.9, 6.4, 10.6);
        System.out.println("Smallest Double: " + smallestDouble);
    }
}

