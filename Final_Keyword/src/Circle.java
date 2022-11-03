public class Circle {
    private int r;

    // The final keyword is fixed values that cannot be changed later.
    // The syntax is capitalized
    public final double PI_NUMBER = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    public void areaOfTheCircle() {
        double area = PI_NUMBER * (this.r * this.r);
        System.out.println("Area Of The Circle : " + area);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
