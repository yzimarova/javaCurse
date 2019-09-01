package com.playtika.javacurse;


import java.util.Scanner;

public class Velocity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in km:");
        int distance = scanner.nextInt();
        distance = distance * 1000;

        System.out.println("Entertime in min:");
        int time = scanner.nextInt();
        time *= 60;

        int velocity = distance / time;
        System.out.printf("Speed: %d", velocity);
    }
}
