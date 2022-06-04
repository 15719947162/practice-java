
public class MobilePhone {
    String size = "4.5吋";
    double height;
    String Color;
    final double price;

    public MobilePhone() {
        System.out.println("父类的");
    }

    void asd(String i, int a, double b) {

    }

    void asd(int a, String i, double b) {

    }
}

class Nokia extends MobilePhone {
    String size = "4.3吋";
    public Nokia() {
        this.size=super.size;
        // this(9,10);
        System.out.println("子类的构造方法");
    }
    public Nokia(int i,int j){

    }
    
    void Call(){
       

    }
}
