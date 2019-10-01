package protectedspecifier;

/**
 * Created by RAJESH on 6/12/2019.
 */
public class Sub extends Access {
    public void get(){
        System.out.println();//System.out.println(a);
        //a is private
        System.out.println(b);//b is protected so accessible by sub class
    }

    public static void main(String[] args) {
        Sub s = new Sub();
        s.get();
    }
}
