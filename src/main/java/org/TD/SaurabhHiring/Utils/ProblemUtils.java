package org.TD.SaurabhHiring.Utils;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class ProblemUtils {
    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private final int ITERATIONS = 10000;
    private final int KEY_LENGTH = 256;


    /*A UUID (Universal Unique Identifier) is a 128-bit number used to
    uniquely identify some object or entity on the Internet.
    UUID is either guaranteed to be different or is, at least,
    extremely likely to be different from any other UUID generated. */
    public String generateUUID() {
        String returnValue = UUID.randomUUID().toString().replaceAll("-", "");
        return returnValue;
    }

    private String generateRandomString(int length) {
        StringBuilder returnValue = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return new String(returnValue);
    }

    public String generateProblemId(int length) {
        return generateRandomString(length);
    }
}
