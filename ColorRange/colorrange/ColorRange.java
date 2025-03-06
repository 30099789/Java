/*Student ID:CAIO GUILHERME FERREIRA DA SILVA 30099789
 *Date: 06/03/2025
 *Version: 1.0
 *Description: Create an operation with IF statements to check which color belongs to wavelength
 */
package colorrange;

import java.util.Scanner;

public class ColorRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with wave length to check which colour is (nm): ");
        double wavelength = sc.nextDouble();
        if (wavelength >= 380 && wavelength < 450) {
            System.out.println("The colour is Violet");
        }
        else if (wavelength >= 450 && wavelength < 495) {
            System.out.println("The colour is Blue");
        }
        else if (wavelength >= 495 && wavelength < 570) {
            System.out.println("The colour is Green");
        }
        else if (wavelength >= 570 && wavelength < 590) {
            System.out.println("The colour is Yellow");
        }
        else if (wavelength >= 590 && wavelength < 620) {
            System.out.println("The colour is Orange");
        }
        else if (wavelength >= 620 && wavelength < 750) {
            System.out.println("The colour is Red");
        } 
        else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
}
