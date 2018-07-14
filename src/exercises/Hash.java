package exercises;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public abstract class Hash {

    private static String makeSalt()
    {
        Random rand = new Random();
        String salt = "";
        int val;
        char c;

        for (int i=0; i<8; i++)
        {
            val = rand.nextInt(128);
            c = (char) val;
            salt += c;
        }

        return salt;
    }

    /**
     * This function hashes a given password.
     *
     * The code was derived from the follwing youtube video:
     *
     * Generating MD5, SHA hash in java
     * https://www.youtube.com/watch?v=9eisErB4MO8
     *
     * @param password the
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        String salt = makeSalt();

        password += salt;
        md.update(password.getBytes());
        byte[] bytes = md.digest();
        StringBuffer hash = new StringBuffer();
        for (byte b : bytes)
        {
            hash.append(Integer.toHexString(b & 0xff).toString());
        }

        return String.format("%s;%s", hash.toString(), salt);
    }

    private static String hashPassword(String password, String salt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        password += salt;
        md.update(password.getBytes());
        byte[] bytes = md.digest();
        StringBuffer hash = new StringBuffer();
        for (byte b : bytes)
        {
            hash.append(Integer.toHexString(b & 0xff).toString());
        }

        return String.format("%s;%s", hash.toString(), salt);
    }

    public static boolean checkPassword(String password, String hash) throws NoSuchAlgorithmException {
        String salt = hash.split(";")[1];
        if (hashPassword(password, salt).equals(hash))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        String password = "cheese";
        String hash;

        try
        {
            hash =  hashPassword(password);
            System.out.println(hash);
            System.out.println(checkPassword(password, hash));
            //System.out.println("Salt:  " + makeSalt() + "\n");

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
