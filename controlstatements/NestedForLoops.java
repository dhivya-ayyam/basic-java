package controlstatements;

/**
 * Created by RAJESH on 6/7/2019.
 */
public class NestedForLoops {
    public static void main(String[] args) {
        int r=5;
        for(int i=1;i<=r;i++) {
            for (int j = r; j >= 1; j--) {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
       /* for(int i=1;i<=r;i++)
        {
            for(int j=i;j<r;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // loop to iterate for the given number of rows
        for (int i = 1; i <= r; i++) {

            // loop to print the number of spaces before the star
            for (int j = r; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // for new line after printing each row
            System.out.println();
        }*/

    }

}
