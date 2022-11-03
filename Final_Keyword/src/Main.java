import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the circle radius : ");
        int r = sc.nextInt();

        Circle circle = new Circle(r);
        circle.areaOfTheCircle();
    }
}