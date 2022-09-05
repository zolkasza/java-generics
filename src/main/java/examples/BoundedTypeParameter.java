package examples;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        System.out.println(
                countGreaterThan(numbers, 0)
        );

        Double[] numbers2 = {1.0, 2.0, 3.8};
        System.out.println(
                countGreaterThan(numbers2, .9)
        );
    }

    static <T extends Comparable<T>> int countGreaterThan(
            T[] numbers,
            T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }

    // Multiple Bounds
    interface A {}
    interface B {}

    // sorrend: mindig extends, interfacenél is. Az első helyen class (csak 1 db lehet!!) utána jönnek az interfacek
    static <T extends A & B> int asd(T sg) {
        return 5;
    }
}
