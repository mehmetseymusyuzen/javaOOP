public class SecurityGuard extends CivilServant{

    private String document;

    public SecurityGuard(String name, String phoneNumber, String email, String department, String shift, String document) {
        super(name, phoneNumber, email, department, shift);

        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void watch() {
        System.out.println(getName() + " started to keep watch");
    }

    @Override
    public void getInfo() {
        System.out.println("------------ Civil Servant Information ------------------");
        System.out.println("Name is : " + getName());
        System.out.println("Number is : " + getPhoneNumber());
        System.out.println("Email is : " + getEmail());
        System.out.println("Department is : " + getDepartment());
        System.out.println("Shit is : " + getShift());
        System.out.println("Task is : " + getDocument());
    }
}
