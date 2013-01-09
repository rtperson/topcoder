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

public class EcoBinPacking {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bcg, bgc, cbg, cgb, gbc, gcb;
        while(sc.hasNextInt()) {
            int b1, b2, b3, g1, g2, g3, c1, c2, c3;
            b1 = sc.nextInt();
            g1 = sc.nextInt();
            c1 = sc.nextInt();
            b2 = sc.nextInt();
            g2 = sc.nextInt();
            c2 = sc.nextInt();
            b3 = sc.nextInt();
            g3 = sc.nextInt();
            c3 = sc.nextInt();
        
            // try BCG
            bcg = b2 + b3 + c1+ c3 + g1 + g2;
            
            // try BGC
            bgc = b2 + b3 + g1 + g3 + c1 + c2;
            
            // try CBG
            cbg = c2 + c3 + b1 + b3 + g1 + g2;
            
            // try CGB
            cgb = c2 + c3 + g1 + g3 + b1 + b2;
            
            // try GBC
            gbc = g2 + g3 + b1 + b3 + c1 + c2;
            
            // try GCB
            gcb = g2 + g3 + c1 + c3 + b1 + b2;
            
            // find the min and print it
            if (bcg <= bcg && bcg <= bgc && bcg <= cbg && bcg <= cgb && bcg <=gbc && bcg <= gcb) {
                System.out.println("BCG " + bcg);
                continue;
            }
            
            if (bgc <= bcg && bgc <= bgc && bgc <= cbg && bgc <= cgb && bgc <=gbc && bgc <= gcb) {
                System.out.println("BGC " + bgc);
                continue;
            }
            
            if (cbg <= bcg && cbg <= bgc && cbg <= cbg && cbg <= cgb && cbg <=gbc && cbg <= gcb) {
                System.out.println("CBG " + cbg);
                continue;
            }
            
            if (cgb <= bcg && cgb <= bgc && cgb <= cbg && cgb <= cgb && cgb <=gbc && cgb <= gcb) {
                System.out.println("CGB " + cgb);
                continue;
            }
            
            if (gbc <= bcg && gbc <= bgc && gbc <= cbg && gbc <= cgb && gbc <=gbc && gbc <= gcb) {
                System.out.println("GBC " + gbc);
                continue;
            }
            
            if (gcb <= bcg && gcb <= bgc && gcb <= cbg && gcb <= cgb && gcb <=gbc && gcb <= gcb) {
                System.out.println("GCB " + gcb);
                continue;
            }
            
            

        }
            
    }
    
}
