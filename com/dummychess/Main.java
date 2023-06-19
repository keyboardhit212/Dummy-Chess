package com.dummychess;
import com.dummychess.screen.Screen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*******************************");
        System.out.println("--------- DUMMY CHESS ---------");
        System.out.println("*******************************");
        System.out.println();
        System.out.println("(1.) 1 Player");
        System.out.println("(2.) 2 Players");
        System.out.println();
        int choice;
        while (true) {
            try {
                System.out.print("Select: ");
                choice = console.nextInt();
                start(choice, args);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Choice!");
            } catch (Exception e) {
                System.out.println("System Error... Exiting...");
                Screen.pause();
                System.exit(1);
            }
        }
    }

    public static void start(int choice, String[] args) {
        switch (choice) {
            case 2:
                SelfVsSelf.main(args);
                break;
            default:
                SelfVsSelf.main(args);
        }
    }


}
