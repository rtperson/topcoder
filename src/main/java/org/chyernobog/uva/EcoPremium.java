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
public class EcoPremium {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Scanner sc = new Scanner("3\n"
//                + "5\n"
//                + "1 1 1\n"
//                + "2 2 2\n"
//                + "3 3 3\n"
//                + "2 3 4\n"
//                + "8 9 2\n"
//                + "3\n"
//                + "9 1 8\n"
//                + "6 12 1\n"
//                + "8 1 1\n"
//                + "3\n"
//                + "10 30 40\n"
//                + "9 8 5\n"
//                + "100 1000 70");
        int size, animals, eco;

        int n = sc.nextInt();
        for (int x = 0; x < n; x++) {
            int tot = 0;
            int farmers = sc.nextInt();
            for (int y = 0; y < farmers; y++) {
                size = sc.nextInt();
                animals = sc.nextInt();
                eco = sc.nextInt();
                tot += size * eco;
            }
            System.out.println(tot);
        }
    }
}
