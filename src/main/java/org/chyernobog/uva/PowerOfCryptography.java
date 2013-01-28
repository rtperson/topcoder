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
public class PowerOfCryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner("2\n"
//                + "16\n"
//                + "3\n"
//                + "27\n"
//                + "7\n"
//                + "4357186184021382204544\n");        
        
        while (sc.hasNext()) {
            double n, p;
            double ans;
            n = sc.nextDouble();
            p = sc.nextDouble();
            ans = Math.round(Math.pow(p, 1/n));
            System.out.println((long)ans);
        }
        
    }
}
