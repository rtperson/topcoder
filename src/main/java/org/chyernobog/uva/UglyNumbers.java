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

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * There are two ways to do this one: 1) Generate a huge list of numbers, and
 * try to determine which ones have a prime factorization of only 2, 3, or 5 2)
 * Generate the list of ugly numbers by an ultra-simple BFS. multiply 1 by 2,
 * then 3, then 5. Then the challenge becomes sorting. 3) Just print out the
 * 1500th number to stdout. Do the calculations in Haskell. (heh, heh...) ...
 * but, since my goal is to learn these algorithms in Java, I'll stick to Java
 *
 * @author turnau_r
 */
public class UglyNumbers {

    public static void main(String[] args) {
        Set<Long> uglies = new HashSet<Long>();
        long next = 0L;
        long twox, threex, fivex;

        // do a simple BFS -- put first elt on a queue
        Queue<Long> ugQueue = new PriorityQueue<Long>();

        ugQueue.add(1L);

        while (!ugQueue.isEmpty() && uglies.size() < 1500) {
            next = ugQueue.poll();
            uglies.add(next);
            twox = next * 2L;
            if (!ugQueue.contains(twox)) {
                ugQueue.add(twox);
            }
            threex = next * 3L;
            if (!ugQueue.contains(threex)) {
                ugQueue.add(threex);
            }
            fivex = next * 5L;
            if (!ugQueue.contains(fivex)) {
                ugQueue.add(fivex);
            }
        }



        Long[] ugs = uglies.toArray(new Long[0]);

        Arrays.sort(ugs);

        for (int x = 0; x < ugs.length; x++) {
            System.out.println("The " + (x + 1) + " 'th ugly number is " + ugs[x] + ".");
        }

        System.out.println("The 1500'th ugly number is " + ugs[1499] + ".");

    }
}
