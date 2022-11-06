package try_catch_finally;

public class Main {
    public static void main(String[] args) {
        System.out.println("The program has started");
        int a = 21;
        int b = 3;
        int[] arr = new int[2];

        try {
            System.out.println("Division");
            System.out.println(a / b);
            System.out.println("Division completed");
            arr[5] = 3;
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The program is over");
    }
}