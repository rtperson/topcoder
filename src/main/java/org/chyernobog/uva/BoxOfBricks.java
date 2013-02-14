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
public class BoxOfBricks {
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("6\n5 2 4 1 7 5\n0");    
        
        while (sc.nextInt() != 0) {
            int blks = sc.nextInt();
            int[] st = new int[blks];
            for (int x = 0; x < blks; x++) {
                st[x] = sc.nextInt();
                System.out.println("st[" + x + "]: " + st[x]);
            }
        }
    }
    
}
