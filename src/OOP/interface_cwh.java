class Monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();

}

 class Human extends Monkey implements BasicAnimal {
    @Override
   public void eat(){
        System.out.println("eat");
    }
    @Override
    public void sleep(){
        System.out.println("sleep");
    }
}







public class interface_cwh {
    static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
    }
}
