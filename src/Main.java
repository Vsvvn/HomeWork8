public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[] numbers = {1.57, 7.654, 9.986};

        long[] numberLong = new long[3];
        numberLong[0] = 333L;
        numberLong[1] = 4444L;
        numberLong[2] = 55555L;

        System.out.println();

        System.out.println("Задача № 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(number[i]/*+ ", " + numbers[i] + ", " + numberLong[i] */ + ", ");
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(numberLong[i] + ", ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Задача № 3");
        for (int i = 2; i > -1; i--) {
            System.out.print(number[i] + ", ");
        }

        System.out.println();

        for (int i = 2; i > -1; i--) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();

        for (int i = 2; i > -1; i--) {
            System.out.print(numberLong[i] + ", ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Задача № 4");
        for (int i = 0; i < numbers.length; i++) {
            if (number[i] % 2 != 0)
                number[i] = number[i] + 1;
            System.out.print(number[i] + ", ");
        }
    }
}