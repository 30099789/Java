/*Student ID:CAIO GUILHERME FERREIRA DA SILVA
 *Date: 20/02/2025
 *Version: 2.0
 *Description: Get a 5-digit number and put space between the numbers 
 */
package numberwithspace;

import java.util.Scanner;

/**
 *
 * @author 30099789
 */
public class NumberWithSpace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, digit1, digit2, digit3, digit4, digit5;
        System.out.print("Insert a 5-digit number:\n");
        num = sc.nextInt();
        digit1 = num / 10000;//Get the First digit
        digit2 = (num / 1000) % 10;//Get the Second digit
        digit3 = (num / 100) % 10;//Get the Third digit
        digit4 = (num / 10) % 10;//Get the Fourth digit
        digit5 = num % 10;//Get the Fifth digit
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }

}
