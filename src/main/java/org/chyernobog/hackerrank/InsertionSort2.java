/*
 * Copyright (C) 2013 roger
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
package org.chyernobog.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author roger
 */
public class InsertionSort2 {

    public static void insertionSort(int[] ar) {
        if (ar.length > 1) {
            for (int x = 1; x <= ar.length; x++) {
                int v = ar[x - 1];
                for (int i = x-2; i >= 0; i--) {
                    if (v < ar[i]) {
                        ar[i + 1] = ar[i];
                        if (i == 0) {
                            ar[i] = v;
                            printArray(ar);
                        }
                    } else {
                        ar[i + 1] = v;
                        printArray(ar);
                        break;
                    }
                }
            }
        }


    }
    /* Tail starts here */

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] ar = new int[n];
//        for (int i = 0; i < n; i++) {
//            ar[i] = in.nextInt();
//        }
//        int[] ar = {1};
//        int[] ar = {1, 2, 3, 4, 5, 6};
//        int[] ar = {};
        int[] ar = {1, 4, 3, 5, 6, 2};
        insertionSort(ar);
    }
}
