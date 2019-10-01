package constructor;

/**
 * Created by RAJESH on 6/17/2019.
 */
public class PassingReference {



    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rajesh");
        p.setName("Raj");

        System.out.println(p.getName());

        Person.swap(p);

        System.out.println(p.getName());


    }
}
