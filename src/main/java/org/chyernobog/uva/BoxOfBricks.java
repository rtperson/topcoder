/*
 <<<<<<< HEAD
 * Copyright (C) 2013 turnau_r
 =======
 * Copyright (C) 2013 roger
 >>>>>>> 6398590cad545ed6d785fc3cf4fa6be6f97911cc
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
public class BoxOfBricks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner("6\n5 2 4 1 7 5\n3\n7 1 1\n0");    
        int blks;
        int set = 1;
        while ((blks = sc.nextInt()) != 0) {
            int first = sc.nextInt();
            int[] st = new int[blks];
            st[0] = first;
            int height = first;
            for (int x = 1; x < blks; x++) {
                st[x] = sc.nextInt();
                height += st[x];
            }
            int level = height / blks;
            int totmoves = 0;
            for (int x = 0; x < blks; x++) {
                if (st[x] < level) {
                    totmoves += level - st[x];
                }
            }
            System.out.println("Set #" + set++);
            System.out.println("The minimum number of moves is " + totmoves + ".");
            System.out.println();
            blks = 0;
            first = 0;
            height = 0;
            level = 0;
            totmoves = 0;
            st = null;
        }
    }
}
