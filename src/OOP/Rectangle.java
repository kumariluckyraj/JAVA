package OOP;

public class Rectangle {
    private int l;
    private int b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getLength() {
        return l;
    }

    public int getBreadth() {
        return b;
    }

    public int getArea() {
        return l * b;
    }

    public int getPerimeter() {
        return 2 * (l + b);

    }


    static class Cuboid extends Rectangle {
        private int h;

        public Cuboid(int l, int b, int h) {
            super(l, b);
            this.h = h;
        }

        public int getHeight() {
            return h;
        }

        public int getVolume() {
            return getLength() * getBreadth() * h;
        }
    }

        public static void main(String[] args) {
            Rectangle rect = new Rectangle(4, 5);
            System.out.println("area:" + rect.getArea());
            System.out.println("perimeter:" + rect.getPerimeter());

            Cuboid cub = new Cuboid(4, 5, 6);
            System.out.println("vol:" + cub.getVolume());



    }
}



