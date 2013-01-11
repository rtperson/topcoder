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
 * I first tried this problem with a simple regex: [^A-Za-z]+
 * But it had problems with lines that started with spaces. Go figure.
 * @author roger
 */
public class KindergartenCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner("salim1233sazzad\n"
//                + "    i am\n"
//                + "i\n"
//                + "i\n"
//                + "    i am\n"
//                + "abc	 abc	 abc\n"
//                + " \n"
//                + "\n"
//                + "\n"
//                + "\n"
//                + "\n"
//                + "a \n"
//                + "\n"
//                + "Meep Meep!\n"
//                + "I tot I taw a putty tat\n"
//                + "I did! I did! I did taw a putty tat ....\n"
//                + "Shsssssssssh ... I am hunting wabbits. Heh Heh Heh Heh ....\n"
//                + "I tot I taw a putty tat\n"
//                + "I did I did I did taw a putty tat\n"
//                + "Shsssssssssh I am hunting wabbits Heh Heh Heh Heh\n"
//                + "\n"
//                + "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz");
        String s;
        int count = 0;
        boolean inWord = false;
        
        while (sc.hasNextLine()) {
            s = sc.nextLine();
            if (s.length() > 0) {
                char[] cs = s.toCharArray();
                for (int x = 0; x < cs.length; x++) {
                    if ((cs[x] >= 'A' && cs[x] <= 'Z') 
                            || (cs[x] >= 'a' && cs[x] <= 'z')) {
                        if (!inWord) {
                            inWord = true;
                            count++;
                        }
                    } else {
                        if (inWord) {
                            inWord = false;
                        }  
                    }
                }
                
                if (count > 0) {
                    System.out.println(count);
                }
                count = 0;
                inWord = false;
            }
        }

    }
}
