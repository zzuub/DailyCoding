package section2;

import java.util.HashMap;

public class D_16_IsIsogram {
    public boolean isIsogram(String str) {
        if(str.length() == 0) {
            return true;
        }
        HashMap<Character, String> cache = new HashMap<Character, String>();
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            if(cache.containsKey(str.charAt(i))) {
                return false;
            }
            cache.put(str.charAt(i), "Exists");
        }
        return true;
    }
}
