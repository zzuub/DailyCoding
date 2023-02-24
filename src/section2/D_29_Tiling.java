package section2;

import java.util.ArrayList;
import java.util.Arrays;

public class D_29_Tiling {
    public int tiling(int num) {
        ArrayList<Integer> memo = new ArrayList<>(Arrays.asList(0, 1, 2));
        return aux(num, memo);
    };

    public int aux(int size, ArrayList<Integer> memo) {
        if(memo.size() > size) {
            return memo.get(size);
        }
        memo.add(aux(size - 1, memo) + aux(size - 2, memo));
        return memo.get(size);
    };
}
