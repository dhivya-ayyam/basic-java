package superkeyword;

/**
 * Created by RAJESH on 6/12/2019.
 */
public class Two extends One {
    //sub class variable
    int i=30;
    //Sub class method
    void show(){
        System.out.println("Sub class method"+i);
        super.show();
        System.out.println("Super class variable"+super.i);
    }
}
