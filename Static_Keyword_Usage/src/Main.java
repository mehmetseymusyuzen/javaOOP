public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math","math101",93);
        Course physics = new Course("Physics", "physics101", 91);
        Course chemistry = new Course("Chemistry", "chemistry101", 87);

        Course[] courses = {math, physics, chemistry};
        Course.noteAverage(courses);
    }
}