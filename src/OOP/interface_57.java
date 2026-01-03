package OOP;

interface  Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){//can't use in mysmartphn but can be used in default method
        System.out.println("hello");
    }
    default void record4kVideo(){
        greet();
        System.out.println("recording in 4k....");
    }
}

interface Wifi{
    String[] getNetwork();
    void connectNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements Wifi,Camera{
    @Override
    public void takeSnap() {
        System.out.println("snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("video");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("getting list of networks");
        String[] networkList = {"Harry","prashat","reshmi"};
        return networkList;
    }

    @Override
    public void connectNetwork(String network) {
        System.out.println("connecting to"+ network);
    }
}



public class interface_57 {
    static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
        String[] ar = ms.getNetwork();
        for (String item: ar){
            System.out.println(item);

        Camera cm = new MySmartPhone();//using smartphn as camera(polymorphism)
        //cm.getNetworks() --> not allowed sirf camera ke methods use karo
        }
    }
}
