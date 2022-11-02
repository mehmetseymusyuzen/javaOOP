public class Computing extends  CivilServant{

    private String task;

    public Computing(String name, String phoneNumber, String email, String department, String shift, String task) {
        super(name, phoneNumber, email, department, shift);

        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void networkSetup() {
        System.out.println(getName() + " started to set up the network");
    }

    @Override
    public void getInfo() {
        System.out.println("------------ Civil Servant Information ------------------");
        System.out.println("Name is : " + getName());
        System.out.println("Number is : " + getPhoneNumber());
        System.out.println("Email is : " + getEmail());
        System.out.println("Department is : " + getDepartment());
        System.out.println("Shit is : " + getShift());
        System.out.println("Task is : " + getTask());
    }
}
