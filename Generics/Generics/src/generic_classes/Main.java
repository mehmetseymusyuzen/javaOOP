package generic_classes;

public class Main {
    public static void main(String[] args) {

        Integer number = 21;
        Nullable<Integer> n = new Nullable<Integer>(number);
        n.run();

        System.out.println("-------------------------------------");

        Integer a = 1978;
        String b = "Java";
        Double c = 3.14;
        Test<Integer, String, Double> t = new Test<Integer, String, Double>(a, b, c);
        t.showInfo();

    }
}