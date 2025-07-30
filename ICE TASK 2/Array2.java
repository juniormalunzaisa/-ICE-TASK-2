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
        String[] months = {"JAN", "FEB", "MAR", "APRIL", "MAY", "JUNE"};
        String[] rooms = {"Bathroom", "Kitchen", "Garden"};

        int[][] chores = {
            {8, 2, 5},  // JAN
            {5, 5, 3},  // FEB
            {7, 4, 2},  // MAR
            {8, 7, 3},  // APRIL
            {7, 9,10},  // MAY
            {7, 4,10}   // JUNE
        };

        StringBuilder output = new StringBuilder("Chores Table:\n");
        output.append(String.format("%-8s%-10s%-10s%-10s\n", "Month", rooms[0], rooms[1], rooms[2]));

        for (int i = 0; i < chores.length; i++) {
            output.append(String.format("%-8s", months[i]));
            for (int j = 0; j < chores[i].length; j++) {
                output.append(String.format("%-10d", chores[i][j]));
            }
            output.append("\n");
        }

        System.out.println(output.toString());
    }
}

                             
    

