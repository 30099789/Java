/*Student ID:CAIO GUILHERME FERREIRA DA SILVA
 *Date: 13/02/2025
 *Version: 1.0
 *Description: Input 3 INT and calculate the average 
 */
package totalaverage;

import java.util.Scanner;

/**
 *
 * @author 30099789
 */
public class TotalAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.print("Enter first integer:\n");
        num1 = sc.nextInt();
        System.out.print("Enter second integer:\n");
        num2 = sc.nextInt();
        System.out.print("Enter third integer:\n");
        num3 = sc.nextInt();
        double avg = (num1 + num2 + num3) / 3.0;
        System.out.println("The average of" + num1 + ", " + num2 + ", " + num3 + " is: " + avg);

    }

}
