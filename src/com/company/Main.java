package com.company;
import  java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Input total number of slices: ");
        int tSlices = input.nextInt();
        System.out.print("Input total number of recipients: ");
        int NoRecipients = input.nextInt();
        System.out.print("Input number of slices per recipient: ");
        int Slices = input.nextInt();

        if (NoRecipients*Slices == tSlices)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
