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

package org.chyernobog.uva;

import java.util.Scanner;

/**
 *
 * @author roger
 */

class PrimaryArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Scanner sc = new Scanner("123 456\n"        // No carry operation.
//                + "555 555\n"                       // 3 carry operations.
//                + "\n"
//                + "123 594\n"                       // 1 carry operation.
//                + "1234 5678910\n"                  // 2 carry operations.
//                + "12354 9125478654\n"              // 3 carry operations.
//                + "321456 21\n"                     // No carry operation.
//                + "56324\n"                         // 3 carry operations. (combined with next number)
//                + "987\n"
//                + "1 9\n"                           // 1 carry operation.
//                + "333 0\n"                         // No carry operation.
//                + "0 1\n"                           // No carry operation.
//                + "11 99\n"                         // 2 carry operations.
//                + "\n"
//                + "9999999999\n"                    // 10 carry operations (combined with next number)
//                + "9999999999\n"
//                + "9999999999 1\n"                  // 10 carry operations (combined with next number)
//                + "\n"
//                + "99999999 1\n"                    // 8 carry operations
//                + "909 909\n"
//                + "445 555\n"
//                + "000 000\n"
//                + "0 0\n");

        long a, b;
        long moda, modb;
        int count;
        boolean carry = false;
        while (true) {
            count = 0;
            a = sc.nextLong();
            b = sc.nextLong();
            
            if (a == 0 && b == 0) {
                return;
            }

            // get count of carry operations by modulus
            while (a != 0 && b != 0) {
                moda = a % 10;
                modb = b % 10;
                if (carry) {
                    moda++;
                }
                if ((moda + modb) > 9) {
                    carry = true;
                    count++;
                } else {
                    carry = false;
                }
                a /= 10;
                b /= 10;
            }

            // if we're done, and we're still in a carry, increase count by 
            // number of nines to the left of the remaining value
            if (carry) {
                if (b != 0) {
                    a = b;
                }
                while ((a % 10) == 9) {
                    count++;
                    a /= 10;
                }
            }
            
            if (count > 0) {
                if (count == 1) {
                    System.out.println(count + " carry operation.");
                } else {
                    System.out.println(count + " carry operations.");
                }

            } else {
                System.out.println("No carry operation.");
            }
        }
    }
}
