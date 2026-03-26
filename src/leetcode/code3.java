package leetcode;

import java.util.HashSet;
import java.util.Set;

public class code3 {
    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()) {
            return 0;
        }

        Set<Character> set = new HashSet<Character>();
        int res = 0,l = 0,r = 0;

        for(int i = 0;i < s.length();i++){
            while (r < s.length() && !set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }
            res = Math.max(res, r - l);
            set.remove(s.charAt(l));
            l++;
        }

        return res;
    }

    public static void main(String[] args) {
        code3 c = new code3();
        System.out.println(c.lengthOfLongestSubstring(" "));
    }
}
