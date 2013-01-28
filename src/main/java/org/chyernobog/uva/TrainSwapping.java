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
 * Bubble sort. That's it.
 * @author turnau_r
 */
public class TrainSwapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner("3\n"
//                + "3\n"
//                + "1 3 2\n"
//                + "4\n"
//                + "4 3 2 1\n"
//                + "2\n"
//                + "2 1\n");
        int tests = sc.nextInt();

        for (int x = 0; x < tests; x++) {
            int cars = sc.nextInt();
            int[] train = new int[cars];
            for (int y = 0; y < cars; y++) {
                // add cars to array
                train[y] = sc.nextInt();
            }
            boolean swapped = true;
            int j = 0, count = 0;
            int tmp;
            while(swapped) {
                swapped = false;
                j++;
                for (int i = 0; i < train.length - j; i++) {
                    if (train[i] > train[i+1]) {
                        tmp = train[i];
                        train[i] = train[i + 1];
                        train[i + 1] = tmp;
                        swapped = true;
                        count++;
                    }
                }
            }
            System.out.println("Optimal train swapping takes " + count + " swaps.");
        }

    }
}
