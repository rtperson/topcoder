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
package org.chyernobog.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author turnau_r
 */
public class Princess1 {
    /* Head ends here */

    static void displayPathtoPrincess(int n, String[] grid) {
    }
    /* Tail starts here */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for (int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

        displayPathtoPrincess(m, grid);
    }
}
