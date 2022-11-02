public class Assistant extends Academician{

    private String officeClock;

    public Assistant(String name, String phoneNumber, String email, String department, String superscription, String officeClock) {
        super(name, phoneNumber, email, department, superscription);

        this.officeClock = officeClock;
    }

    public String getOfficeClock() {
        return officeClock;
    }

    public void setOfficeClock(String officeClock) {
        this.officeClock = officeClock;
    }

    public void prepareQuiz() {
        System.out.println("The " + getSuperscription() + " " + getName() + " prepared quiz for students");
    }

    @Override
    public void attendClass(String lessonTime) {
        System.out.println("The " + getName() + " started the lesson at " + lessonTime);
    }

    @Override
    public void getInfo() {
        System.out.println("------------ Academician Information ------------------");
        System.out.println("Name is : " + getName());
        System.out.println("Number is : " + getPhoneNumber());
        System.out.println("Email is : " + getEmail());
        System.out.println("Department is : " + getDepartment());
        System.out.println("Superscription is : " + getSuperscription());
        System.out.println("Office time is : " + getOfficeClock());
    }
}
