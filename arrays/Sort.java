package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by RAJESH on 9/18/2019.
 */
public class Sort {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How Many Elements?");
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the elements:");
            arr[i]=Integer.parseInt(br.readLine());
        }
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                }
            }
        System.out.println("Display sorted elements");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
    }

