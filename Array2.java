/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array2;

/**
 *
 * @author RC_Student_lab
 */
 public class Array2 {
    public static void main(String[] args) {
        // Months and categories
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        String[] categories = {"Bathrooms", "Kitchens", "Gardens"};

        // 2D array: rows = months, columns = categories
        int[][] makeovers = {
            {5, 6, 4},  // JAN
            {3, 5, 2},  // FEB
            {7, 4, 3},  // MAR
            {6, 3, 5},  // APR
            {4, 5, 6},  // MAY
            {7, 7, 6}   // JUN
        };

        // Report Header
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println(".........................");
        System.out.printf("%-5s %-10s %-10s %-10s%n", "", categories[0], categories[1], categories[2]);
        System.out.println(".........................");

        // Print monthly data
        for (int i = 0; i < makeovers.length; i++) {
            System.out.printf("%-5s", months[i]);
            for (int j = 0; j < makeovers[i].length; j++) {
                System.out.printf("%-10d", makeovers[i][j]);
            }
            System.out.println();
        }

        // Dotted separator
        System.out.println(".........................");

        // Monthly Totals
        System.out.println("MONTHLY TOTALS");
        System.out.println(".........................");
        for (int i = 0; i < makeovers.length; i++) {
            int total = 0;
            for (int j = 0; j < makeovers[i].length; j++) {
                total += makeovers[i][j];
            }
            System.out.printf("%-5s %-3d", months[i], total);
            if (total >= 15) {
                System.out.print(" ***");
            }
            System.out.println();
        }
        System.out.println(".........................");
    }
}
      
    

