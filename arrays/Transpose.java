package arrays;

import java.util.Scanner;

/**
 * Created by RAJESH on 9/18/2019.
 */
public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose matrix");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[j][i]+" ");

            }
            System.out.println();
        }
    }
}
