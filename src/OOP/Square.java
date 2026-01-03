package OOP;

public class Square {
    private int side;

    public  Square(int side){
        this.side= side;

    }

    public int getSide(){
        return side;
    }
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return  4*side;
    }

    public static void main(String[] args){
        Square sq = new Square(2);
        System.out.println("area:" + sq.getArea());
        System.out.println("perimeter" + sq.getPerimeter());

    }
}
