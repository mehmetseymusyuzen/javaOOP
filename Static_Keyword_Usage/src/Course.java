public class Course {
    private String name;
    private String code;
    private int note;

    Course(String name, String code, int note) {
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public static void noteAverage(Course[] notes) {
        double total = 0;
        for(Course c : notes) {
            total += c.note;
        }
        double average = total / notes.length;
        System.out.println("Your notes average : " + (int) average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
