package section3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class D_40_PrimePassword {
    public int primePassword(int curPwd, int newPwd) {
        if (curPwd == newPwd) {
            return 0;
        }
        Queue<int[]> queue = new LinkedList<>();

        boolean[] isVisited = new boolean[10000];

        isVisited[curPwd] = true;

        queue.offer(new int[]{0, curPwd});

        while (!queue.isEmpty()) {
            int[] data = queue.poll();
            int step = data[0];
            int num = data[1];

            for (int i = 0; i < 4; i++) {
                int[] digits = splitNumber(num);

                for (int d = 0; d < 10; d++) {
                    if (d != digits[i]) {
                        digits[i] = d;
                        int next = joinDigits(digits);

                        if(next == newPwd) {
                            return step + 1;
                        }

                        if(next > 1000 && isPrime(next) && !isVisited[next]) {
                            isVisited[next] = true;
                            queue.offer(new int[]{step + 1 , next});
                        }
                    }
                }
            }
        }
        return -1;
    }

    public boolean isPrime(int num) {
        if(num % 2 == 0) return false;
        int sqrt = (int)(Math.sqrt(num));
        for(int divider = 3; divider <= sqrt; divider += 2) {
            if(num % divider == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] splitNumber(int num) {
        return Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
    }

    public int joinDigits(int[] arr) {
        String[] tempArr = new String[arr.length];

        for(int i = 0; i < arr.length; i++) {
            tempArr[i] = String.valueOf(arr[i]);
        }

        return Integer.parseInt(String.join("", tempArr));
    }
}
