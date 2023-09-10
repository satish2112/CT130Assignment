package Practic;

import java.util.HashSet;
import java.util.Set;

public class SameString {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		
	}
	public static int lengthOfLongestSubstring(String s) {
        HashSet<String> x = new HashSet<String>();
        for(int i=0; i < s.length();i++){
       char m=s.charAt(i);
            x.add(Character.toString(m));
        }
        return x.size();
    }
}

