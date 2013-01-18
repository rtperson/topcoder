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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * There are two ways to do this one: 
 * 1) create a list of numbers whose prime factorization consists only of 2, 3, or 5
 *    this requires writing a prime factorization routine
 * 2) Just print out the 1500th number to stdout. Do the calculations in Haskell. (heh, heh...)
 * ... but, since my goal is to learn these algorithms in Java, I'll stick to Java
 * 
 * gotchas here are whether or not we need BigInt. 
 * @author turnau_r
 */
public class UglyNumbers {
    
    public static final BigInteger ZERO = BigInteger.ZERO;
    public static final BigInteger ONE = BigInteger.ONE;
    public static final BigInteger TWO = BigInteger.valueOf(2);
    public static final int[] aValues = {2,3,5,7,11,13,17,19,23,29,31,37,41}; // values for bases
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        List<Long> uglyNums = new ArrayList<Long>();
        // "By convention, 1 is included."
//        uglyNums.add(1L);
//        
//        List<Long> factors = new ArrayList<Long>();
        
        // get prime factors for an integer using Pollard's rho algorithm
        
        long begin = System.currentTimeMillis();
        
        BigInteger n = new BigInteger("44343535354351600000003434353");
        boolean ret = millerRabin(n, 13);
        long end = System.currentTimeMillis();
        System.out.println(ret);
        System.out.println("time: " + (end - begin));
        
        System.out.println("");
        
        
    }
    
    public static List<Long> factor(long n) {
        return null;
    }
    
    /**
     * Miller Rabin primality test
     * @param n
     * @param numValues
     * @return 
     */
    public static boolean millerRabin(BigInteger n, int numValues) { // n = number to test
        BigInteger d = n.subtract(ONE);                              // numValues = # of bases to test
        int s = 0;
        while(d.mod(TWO).equals(ZERO)){
            s++;
            d = d.divide(TWO);
        }
        System.out.print("Base ");
        for (int i = 0; i < numValues; i++) {
            BigInteger a = BigInteger.valueOf(aValues[i]);  // composite
            boolean r = testPr(n, a, s, d);
            System.out.println(aValues[i] + " ");
            if (!r) {
                return false;
            }
        }
        return true;
    }
     
    private static boolean testPr(BigInteger n, BigInteger a, int s, BigInteger d) {
        for (int i = 0; i < s; i++) {
            BigInteger exp = TWO.pow(i);
            exp = exp.multiply(d);
            BigInteger res = a.modPow(exp, n);
            if (res.equals(n.subtract(ONE)) || res.equals(ONE)) {
                return true;
            }
        }
        return false;
    }
     

    
}
