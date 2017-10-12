package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is the length of the roof in feet? ");
	double length=keyboard.nextDouble();
	System.out.println("What is the width of the roof in feet? ");
	double width = keyboard.nextDouble();
	System.out.println("What is the rainfall this year in inches? ");
	double rainFall = keyboard.nextDouble();
	double	unformattedGallons=calculateCost(length, width, rainFall);
	System.out.println ("The amount of water that ran off the roof was "+ String.format("%.02f",unformattedGallons)+" gallons");
    }

    public static double calculateCost(double length, double width, double rainFall){
        return length*width*144*rainFall/231;
    }
}
