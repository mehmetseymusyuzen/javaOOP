public abstract class Employee {
    private String name;
    private String phoneNumber;
    private String email;

    public Employee(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void entranceTime() {
        System.out.println(this.getName() + " entered the university.");
    }

    public  void leaveTime() {
        System.out.println(this.getName() + " came out of university.");
    }

    public void refectory() {
        System.out.println(this.getName() + " entered the refecatory");
    }

    public void getInfo() {
        System.out.println(getName());
        System.out.println(getPhoneNumber());
        System.out.println(getEmail());
    }

}
