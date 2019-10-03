package arrays;

/**
 * Created by RAJESH on 9/18/2019.
 */
public class CommandLine {
    public static void main(String[] args) {
        int n=args.length;
        System.out.println("No of args="+n);
        System.out.println("The args are:");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
