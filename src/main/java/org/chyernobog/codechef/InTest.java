/*
 * Copyright (C) 2015 rturnau001
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
package org.chyernobog.codechef;

import java.io.*;

class InTest {
    
    

    public static void main(String[] args) throws IOException {
        // comment this out when submitting
        //InputStream is = new FileInputStream("input.txt"); // this file needs to have unix newlines
        
        int n = 0, k = 0, i, j, t = 0, in, s = 0;
        byte[] input = new byte[65000];
        while ((in = System.in.read()) != ' ') {
        //while ((in = is.read()) != ' ') {     // comment this out when submitting. ASCII space is 32
            n = n * 10 + in - '0';
        }
        while ((in = System.in.read()) != '\n') {
        //while ((in = is.read()) != '\n') {     // comment this out when submitting 
            k = k * 10 + in - '0';
        }
        for (i = 1; i <= n; i++) {
            in = System.in.read(input, 0, 65000);
            //in = is.read(input, 0, 65000);    // comment this out when submitting
            if (in == -1) {
                break;
            }
            for (j = 0; j < in; j++) {
                if (input[j] == '\n') {
                    if (t % k == 0) {
                        s++;
                    }
                    t = 0;
                } else {
                    t = t * 10 + input[j] - '0';
                }
            }
        }
        System.out.println(s);
    }
}
