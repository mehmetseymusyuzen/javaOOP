public class Prelector extends Academician {

    private int roomNumber;

    public Prelector(String name, String phoneNumber, String email, String department, String superscription, int roomNumber) {
        super(name, phoneNumber, email, department, superscription);

        this.roomNumber = roomNumber;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void senateMeeting() {
        System.out.println("The " + getSuperscription() + getName() + " attended the senate meeting.");
    }

    public void prepareExam() {
        System.out.println("The " + getSuperscription() + getName() + " prepared exams for students");
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
        System.out.println("Room is : " + getRoomNumber());
    }
}
