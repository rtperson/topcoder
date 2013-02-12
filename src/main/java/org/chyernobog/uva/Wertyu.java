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
 * Yet another problem that is far easier in C++ -- so much, that I'm 
 * going to switch to that language now.
 * @author turnau_r
 */
public class Wertyu {
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("O S, GOMR YPFSU/\n");
        
        String werts = "`1234567890-="
                     + "QWERTYUIOP[]\\" 
                     + "ASDFGHJKL;\'"
                     + "ZXCVBNM,./";
        
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            char[] cs = s.toCharArray();

            for (int x = 0; x < cs.length; x++) {
                if (cs[x] != ' ') {
                    int idx = werts.indexOf(cs[x]);
                    System.out.print(werts.charAt(idx-1));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
