package aaalme.stringproblems;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratePwd {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    public static String generatePwd(int pwdLength) {
        Random random = new SecureRandom();
        StringBuilder pwd = new StringBuilder(pwdLength);
        for (int i = 0; i < pwdLength; i++) {
            pwd.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return pwd.toString();
    }

    public static void main(String[] args) {
        int pwdLength = 16;
        String pwd = generatePwd(pwdLength);
        System.out.println(pwd);
    }
}