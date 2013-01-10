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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Easy problem, made more difficult by a vague problem statement. 
 * Things to remember: 
 *   1) never assume all ints are under 2^32 unless they say so
 * 
 * @author turnau_r
 */
public class JollyJumpers {

    public static void main(String[] args) {
        boolean[] visited = new boolean[3005];
        long a, b, c;
        int count;
        boolean jolly;
        String input;
        String[] ints;

        Scanner sc = new Scanner(System.in);
//        try {
//            Scanner sc = new Scanner(new File("input.txt"));

            while (sc.hasNextLine()) {
                jolly = false;
                input = sc.nextLine();
                ints = input.split(" ");
                count = Integer.parseInt(ints[0]);
                if (count > 0) {
                    a = Long.parseLong(ints[1]);
                    jolly = true;
                    for (int x = 2; x <= count; x++) {
                        b = Long.parseLong(ints[x]);
                        c = Math.abs(b - a);
                        
                        if (c > count || c < 0) {
                            jolly = false;
                            break;
                        } else {
                            visited[Math.abs((int) (c-1L))] = true;
                        }
                        
                        //System.out.println("a: " + a + ", b: " + b + ", c: " + c + " count: " + count);
//                System.out.println("visited: ");
//                for (int y = 0; y < count; y++) {
//                    System.out.print(visited[y] + ", ");
//                }
//                System.out.println();
                        a = b;

                    }

                    for (int x = 0; x < count-1; x++) {
                        if (!visited[x]) {
                            jolly = false;
                            //System.out.println("not jolly because of elt " + x);
                            break;
                        }
                    }
                    if (jolly) {
                        System.out.println("Jolly");
                    } else {
                        System.out.println("Not jolly");
                    }

                    for (int x = 0; x < count; x++) {
                        visited[x] = false;
                    }
                } else {
                    System.out.println("Jolly");
                }
            }
//        } catch (FileNotFoundException e) {
//        }




    }
}
