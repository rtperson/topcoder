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
 * Trivial problem: can you read file input and subtract...
 * @author turnau_r
 */
public class Hashmat {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long hash, other, tot;
        do {
            hash = sc.nextLong();
            other = sc.nextLong();
            if (hash > other) {
                tot = hash - other;
            } else {
                tot = other - hash;
            }
            System.out.println(tot);
        } while(sc.hasNextLong());
        
    }
    
}
