package perscholas.shameena.hackerrank;

import java.util.HashMap;

public class SimpleCipher {

	public static void main(String[] args) {
		simpleCipher("VTAOG",2);

	}
	public static String simpleCipher(String encrypted, int k) {
        String result = "";
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<Character,Character> hashMap = new HashMap<>();
        for (int i = 0; i < alpha.length(); i++) {
            int encryptpos = (i-k)%26;
            if(encryptpos<0) {
            	encryptpos = alpha.length()+ encryptpos;
            }
            hashMap.put(alpha.charAt(i), alpha.charAt(encryptpos));
        }
        for(int i=0;i<encrypted.length();i++) {
        	result +=hashMap.get(encrypted.charAt(i));
        }
        System.out.println(hashMap);
        System.out.println(result);
        return result;
    }
}
