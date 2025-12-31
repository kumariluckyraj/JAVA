public class overload {
    private int length;
    private int breadth;

    // Constructor 1: Default (length=4, breadth=5)
    public overload() {
        this.length = 4;
        this.breadth = 5;
    }

    // Constructor 2: Custom parameters
    public overload(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public int getArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public int getPerimeter() {
        return 2 * (length + breadth);
    }

    // Getters (optional)
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    // Main method to test
    public static void main(String[] args) {
        // Using default constructor
        overload rect1 = new overload();
        System.out.println("Default Rectangle: Length=" + rect1.getLength() + ", Breadth=" + rect1.getBreadth());
        System.out.println("Area=" + rect1.getArea() + ", Perimeter=" + rect1.getPerimeter());

        // Using custom constructor
        overload rect2 = new overload(10, 7);
        System.out.println("Custom Rectangle: Length=" + rect2.getLength() + ", Breadth=" + rect2.getBreadth());
        System.out.println("Area=" + rect2.getArea() + ", Perimeter=" + rect2.getPerimeter());
    }
}
