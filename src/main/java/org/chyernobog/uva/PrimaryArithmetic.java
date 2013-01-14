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
 * I'm failing on edge cases here. Need to take it to pen and paper and
 * figure out where I'm failing.
 * @author turnau_r
 */
public class PrimaryArithmetic {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner("999743 859\n" // 6 carries
//                + "123 456\n"                   // no carries
//                + "555 555\n"                   // 3 carries
//                + "123 594\n"                   // 1 carry
//                + "1234567890 9876543210\n"     // 9 carries
//                + "2 9876543210\n"              // no carries
//                + "909 909\n"                   // 2 carries
//                + "0 0");

        Scanner sc = new Scanner("123 456\n"      //No carry operation. 
                + "555 555\n"                     // 3 carry operations
                + "\n"                            
                + "123 594\n"                     // 1 carry operation
                + "1234 5678910\n"                // 
                + "12354 9125478654\n"
                + "321456 21\n"
                + "56324\n"
                + "987\n"
                + "1 9\n"
                + "333 0\n"
                + "0 1\n"
                + "11 99\n"
                + "\n"
                + "9999999999\n"
                + "9999999999\n"
                + "9999999999 1\n"
                + "\n"
                + "99999999 1\n"
                + "0 0\n");

        String s;
        long a, b;
        long moda, modb;
        int digits;
        int count;
        boolean carry = false;
        String[] nums;
        while (sc.hasNextLine()) {
            count = 0;
            s = sc.nextLine();
            if (s.isEmpty()) continue;
            nums = s.split(" ");
            if (nums.length < 2) continue;
            if (nums[0].equals("0") && nums[1].equals("0")) {
                break;
            }
            a = Long.parseLong(nums[0]);
            b = Long.parseLong(nums[1]);

            digits = Math.min(nums[0].length(), nums[1].length());
            for (int x = 0; x < digits; x++) {
                moda = a % 10;
                modb = b % 10;
                if ((moda + modb) > 9) {
                    carry = true;
                    count++;
                } else {
                    carry = false;
                }
                a /= 10;
                b /= 10;
            }

            if (carry) {
                if (b != 0) {
                    a = b;
                }
                while ((a % 10) == 9) {
                    count++;
                    a /= 10;
                    if (a == 0) {
                        count++;
                    }
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
