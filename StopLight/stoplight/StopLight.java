/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stoplight;

import java.util.Scanner;

public class StopLight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a colour code (1: red, 2: green, 3: yellow)");
        int currentColor = sc.nextInt();
        switch (currentColor) {
            case 1:
                System.out.println("Next Traffic Light is green");
                break;
            case 2:
                System.out.println("Next Traffic Light is yellow");
                break;
            case 3:
                System.out.println("Next Traffic Light is red");
                break;
            default:
                System.out.println("Invalid colour");
        }
    }

}
