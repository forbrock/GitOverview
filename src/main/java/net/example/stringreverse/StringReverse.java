package net.example.stringreverse;

public class StringReverse {
    public String reverseXOR(String str) {
        char[] chars = str.toCharArray();
        int low = 0;
        int high = chars.length - 1;
        while (low < high) {
            chars[low] = (char) (chars[low] ^ chars[high]);
            chars[high] = (char) (chars[low] ^ chars[high]);
            chars[low] = (char) (chars[low] ^ chars[high]);
            low++;
            high--;
        }
        return new String(chars);
    }
}