public abstract class Academician extends Employee {

    private String department;
    private String superscription;

    public Academician(String name, String phoneNumber, String email, String department, String superscription) {
        super(name, phoneNumber, email);
        this.department = department;
        this.superscription = superscription;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSuperscription() {
        return superscription;
    }

    public void setSuperscription(String superscription) {
        this.superscription = superscription;
    }

    public abstract void attendClass(String lessonTime);

}
