package OOP;

public class CellPhone{
    private String ring;
    private String vibrate;

    public CellPhone(String ring , String vibrate){
        this.ring=ring;
        this.vibrate=vibrate;
    }

    public String getRing(){
        return ring;
    }

    public String getVibrate(){
        return vibrate;
    }

    public static void main(String[] args){
        CellPhone phn = new CellPhone("ringing","vibrating");
        System.out.println("ring:"+ phn.getRing());
        System.out.println("vibrate"+ phn.getVibrate());
    }
}
