package constructor;

/**
 * Created by RAJESH on 6/17/2019.
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void swap(Person p) {
        p.setName("Dhivya");
    }
}
