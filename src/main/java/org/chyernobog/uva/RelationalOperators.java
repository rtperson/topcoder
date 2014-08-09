/*
 * Copyright (C) 2014 rturnau001
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
 * @author rturnau001
 */
public class RelationalOperators {

    public static void main(String[] args) {

//        Scanner sc = new Scanner("3\n"
//                + "10 20\n"
//                + "20 10\n"
//                + "10 10");
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                System.out.println(">");
            }
            if (a < b) {
                System.out.println("<");
            } 
            if (a == b) {
                System.out.println("=");
            }
        }
    }
}
