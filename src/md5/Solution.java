package md5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {
  public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    MessageDigest md = MessageDigest.getInstance("MD5");
    md.update(str.getBytes());
    // return bytesToHex(md.digest
    byte[] digest = md.digest();
    for (byte b : digest) {
      System.out.printf("%02x", b);
    }
    br.close();
  }
}
