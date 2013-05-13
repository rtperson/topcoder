/*
 * Copyright (C) 2013 turnau_r
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.chyernobog.uva;

import java.util.Scanner;

/**
 *
 * @author turnau_r
 */
public class MaximumSum {
    
    

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("4\n0 -2 -7  0 9  2 -6  2\n-4  1 -4  1 -1\n8  0 -2");  
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                grid[y][x] = sc.nextInt();
                System.out.printf("%4d", grid[y][x]);
            }
            System.out.println();
        }
//        System.out.println(grid);
    }
    
    private void kadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int maxBegin = 0;
        int maxEnd = 0;
        int curMaxSum = 0;
        int curStartIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            curMaxSum += arr[i];
        }
    }
    
}
