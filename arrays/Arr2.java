package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by RAJESH on 9/18/2019.
 */
public class Arr2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How Many Subjects?");
        int n=Integer.parseInt(br.readLine());
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the marks:");
            marks[i]=Integer.parseInt(br.readLine());
        }
        int tot=0;
        for (int i=0;i<n;i++){
            tot+=marks[i];
        }
        System.out.println("Total Marks:"+tot);
        float percent=(float)tot/n;
        System.out.println("Percentage:"+percent);

    }
}
