

abstract class Parent2{
    public Parent2(){//parent2 bas eek zariya hai eek actual/concerete class(child2) bnanane ka
        System.out.println("i am constructor of parent2");
    }

    public void sayHello(){
        System.out.println("hello");
    }

    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override //u either have to override the abstract method from abstarct class or make the chils class abstract if it extends the parent abstract

    public void greet() {
        System.out.println("good morning");
    }

    @Override
    public void greet2() {
        System.out.println("good night");
    }

    public void additional() {
        System.out.println("additional");
    }
}
abstract class Child3 extends Parent2{

    public void Hello() {
        System.out.println("hello iam child abstract class ");
    }
}

public class cwh_53_abstract {
    static void main(String[] args) {
        //Parent2 p = new Parent2();//wrong coz it is an abstract class so can't create an abject of abstract class
        Child2 c= new Child2();// can do this coz this is a concerete class and not abstract
    }
}


