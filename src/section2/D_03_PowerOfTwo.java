package section2;

public class D_03_PowerOfTwo {
    public boolean  powerOfTwo(long num) {
        if(num == 1){
            return true;
        }

        if(num % 2 != 0){
            return false;
        }

        long pow = 2;

        while (pow < num){
            pow *= 2;
        }
        return pow == num;
    }
}
