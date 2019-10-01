package protectedspecifier1;

/**
 * Created by RAJESH on 6/12/2019.
 */
public class Rectangle  extends Square{
    private double b;
    Rectangle(double x,double y){
        super(x);
        b=y;
    }
    void area(){
        System.out.println(l*b);
    }

    public static void main(String[] args) {
        Square s=new Square(5.5);
        s.area();
        Rectangle r=new Rectangle(5.5,6);
        r.area();

    }
}
