package inheritance;

/**
 * Created by RAJESH on 6/12/2019.
 */
public class Teacher {
    //instance variable
    int id;
    String name;
    String address;
    float sal;
    void setid(int id){
        this.id=id;
    }
    int getid(){
        return id;
    }
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return name;
    }
    void setaddress(String address){
        this.address=address;
    }
    String getaddress(){
        return address;
    }
    void setsal(float sal){
        this.sal=sal;
    }
    float getsal(){
        return sal;
    }

    public static void main(String[] args) {
       Teacher t=new Teacher();
        t.setid(116);
        t.setname("Dhivya");
        t.setaddress("India");
        t.setsal(12000);
        System.out.println(t.getid());
        System.out.println(t.getname());
        System.out.println(t.getaddress());
        System.out.println(t.getsal());
    }
}
