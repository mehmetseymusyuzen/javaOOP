package generic_classes;

public class Nullable<T> {
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("No value is assigned to this variable. (null)");
        } else {
            System.out.println(this.getValue());
        }
    }
}