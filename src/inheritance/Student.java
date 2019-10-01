package inheritance;

/**
 * Created by RAJESH on 6/12/2019.
 */
public class Student extends Teacher{
    //instance variable
    int marks;
    /*int id;
    String name;
    String address;

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
    }*/
    void setmarks(int marks){
        this.marks =marks;
    }
    int getmarks(){
        return marks;
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.setid(116);
        s.setname("Dhivya");
        s.setaddress("India");
        s.setsal(12000);
        s.setmarks(499);
        System.out.println(s.getid());
        System.out.println(s.getname());
        System.out.println(s.getaddress());
        System.out.println(s.getsal());
        System.out.println(s.getmarks());
    }
}
