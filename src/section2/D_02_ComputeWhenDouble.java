package section2;

public class D_02_ComputeWhenDouble {
    public int computeWhenDouble(double interestRate) {
        int year = 0;
        double rate = 1 + interestRate / 100;
        double principal = 1;

        while (principal < 2) {
            principal = principal * rate;
            year++;
        }
        return year;
    }
}
