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
public class ReverseAndAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner("8\n195\n265\n750\n1021\n3\n2\n99\n429496295\n");

        boolean isPal;
        int count = 0;
        long res;
        int n = sc.nextInt();

        for (int x = 0; x < n; x++) {
            long num = sc.nextLong();
            count = 0; 
            isPal = false;

            while (!isPal && count < 1003) {
                count++;

                // reverse the numbers so that they can be added together. 
                long a = num, a1 = 0, tmp;
                while (a != 0) {
                    tmp = a % 10;
                    a /= 10;
                    if (a != 0) {
                        a1 += tmp;
                        a1 *= 10;
                    } else {
                        a1 += tmp;
                    }
                }

                res = num + a1;

                // check if res is a palindrome
                StringBuilder sb = (new StringBuilder()).append(res);
                char[] cs = (sb.toString()).toCharArray();
                isPal = true;
                for (int lo = 0, hi = cs.length - 1; lo < hi; lo++, hi--) {
                    if (cs[lo] != cs[hi]) {
                        isPal = false;
                        break;
                    }
                }
                if (isPal) {
                    System.out.println(count + " " + res);
                } else {
                    num = res;
                }
            }
        }
    }
}
