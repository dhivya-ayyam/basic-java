package constructor;

/**
 * Created by RAJESH on 6/12/2019.
 */
public class Two extends One{
    int i;
    Two(){
        super();
        System.out.println("Two");
    }
    Two(int a,int b){
        super(a);
        i=b;
    }
    void show(){
        System.out.println(i);
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        Two t=new Two();//dout incase of argument
        t.show();
    }

}
