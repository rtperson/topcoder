/*
 * Copyright (C) 2014 Roger
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
package org.chyernobog.testing;

import java.security.Provider;
import java.security.Security;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.RandomSaltGenerator;
import org.jasypt.util.text.StrongTextEncryptor;

/**
 *
 * @author Roger
 */
public class JasyptTest {
    
    public static final String TEST_STR_1 = "Here is a string of text";
    public static final String TEST_PASSWORD = "password";
    
    public static void main(String[] args) {
        
        for (Provider provider : Security.getProviders()) {
            System.out.println("Provider: " + provider.getName());
            for (Provider.Service service : provider.getServices()) {
                System.out.println("  Algorithm: " + service.getAlgorithm());
            }
        }
        
        StrongTextEncryptor textEncryptor = new StrongTextEncryptor();
        textEncryptor.setPassword(TEST_PASSWORD);
        String encryptedText = textEncryptor.encrypt(TEST_STR_1);
        System.out.println("encryptedText: " + encryptedText);
        String plainText = textEncryptor.decrypt(encryptedText);
        System.out.println("plain text: " + plainText);
        
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setAlgorithm("PBEWithSHA1AndRC2_40");
        encryptor.setPassword(TEST_PASSWORD);
        encryptor.setSaltGenerator(new RandomSaltGenerator());
        encryptedText = encryptor.encrypt(TEST_STR_1);
        System.out.println("encrypted: " + encryptedText);
        plainText = encryptor.decrypt(encryptedText);
        System.out.println("plain text: " + plainText);
    }
    
}
