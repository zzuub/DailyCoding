package section2;

import java.util.HashMap;

public class D_01_TransformFirstAndLast {
    public HashMap<String, String> transformFirstAndLast(String[] arr){
        if(arr.length == 0){
            return null;
        }

        HashMap<String, String> hh = new HashMap<>();

        hh.put(arr[0], arr[arr.length -1]);

        return hh;
    }
}
