/*Student ID:CAIO GUILHERME FERREIRA DA SILVA
 *Date: 13/02/2025
 *Version: 1.0
 *Description: Create a history insert input for STRING, INT, and DOUBLE. Also, put so math operations for INT and DOUBLE 
 */
package javaStory;

import java.util.Scanner;
import java.text.DecimalFormat;

public class JavaStory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String charName;
        String occupation;
        int qstTotal;
        int qstComplete;
        double heathBar;
        double actualHeathBar;
        System.out.print("Welcome to RPG Story\n");
        System.out.print("What is your name?\n");
        charName = sc.nextLine();
        System.out.print("What is your class? i.e: Paladin, Monk, Wizard or etc.\n");
        occupation = sc.nextLine();
        System.out.print("How many quest have you done?\n");
        qstTotal = sc.nextInt();
        System.out.print("How many quest have you successed?\n");
        qstComplete = sc.nextInt();
        System.out.print("Insert your health bar in total:\n");
        heathBar = sc.nextDouble();
        System.out.print("Insert your health bar after last mission:\n");
        actualHeathBar = sc.nextDouble();
        int qstFailed = qstTotal - qstComplete;
        double lifeLost = ((actualHeathBar / heathBar) * 100) - 100;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("You are " + charName + " and your class is " + occupation + ". "
                + "You have done " + qstTotal + " quest and have successed in " + qstComplete + " and have failed in " + qstFailed
                + ". When you are full health is " + heathBar + " but now your life is " + actualHeathBar + " so you lost "
                + numberFormat.format(Math.abs(lifeLost)) + " %");
    }
}
