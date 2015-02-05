/*
 * Copyright (C) 2014 roger
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
 * @author roger
 */
class AboveAverage {

    public static void main(String[] args) {
//                Scanner sc = new Scanner("7\n"
//                + "1 0\n"
//                + "5 50 50 70 80 100\n"
//                + "7 100 95 90 80 70 60 50\n"
//                + "3 70 90 80\n"
//                + "3 70 90 81\n"
//                + "9 100 99 98 97 96 95 94 93 91\n"
//                + "1 0\n"
//                        );
        Scanner sc = new Scanner(System.in);
        int[] ns = new int[1000];
        int cases = sc.nextInt();
        for (int x = 0; x < cases; x++) {
            int n = sc.nextInt();
            int sum = 0;
            for (int y = 0; y < n; y++) {
                ns[y] = sc.nextInt();
                sum += ns[y];
            }
            double avg = (double)sum / (double)n;
            int aboveCount = 0;
            for (int z = 0; z < n; z++) {
                if (ns[z] > avg) aboveCount++;
            }
            double pctAbove = (double)aboveCount / (double)n * 100;
            
            System.out.printf("%.3f%%\n", pctAbove);
        }
    }
}
