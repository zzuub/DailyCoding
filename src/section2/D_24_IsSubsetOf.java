package section2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D_24_IsSubsetOf {
    public boolean isSubsetOf(int[] base, int[] sample) {
        List<Integer> intList
                = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());

        for (int i : sample) {
            if (!intList.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
