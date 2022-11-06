package generic_interface;

public class Student<T> implements IDatabase<T>{

    @Override
    public boolean insert(T data) {
        System.out.println(data + " Data added");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println(data  + " Data deleted");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println(data + " Data updated");
        return true;
    }

    @Override
    public T select() {
        System.out.println("Data retrieved");
        return null;
    }
}
