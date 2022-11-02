public class LabAssistant extends Assistant{

    public LabAssistant(String name, String phoneNumber, String email, String department, String superscription, String officeClock) {
        super(name, phoneNumber, email, department, superscription, officeClock);
    }

    public void attendLab() {
        System.out.println("The " + getName() + " entered the laboratory");
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
