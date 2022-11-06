package generic_interface;

public class Main {
    public static void main(String[] args) {

        Student<Integer> s1 = new Student<Integer>();
        s1.insert(21);

        Student<String> s2 = new Student<String>();
        s2.delete("Java");

    }
}
