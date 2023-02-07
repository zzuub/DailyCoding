package section2;

public class D_17_ComputeSquareRoot {
    public String computeSquareRoot(int num) {
        double[] diffs = new double[]{1, 0.1, 0.01, 0.001};
        double result = 1;

        for(int i = 0; i < diffs.length; i++) {
            while (result * result < num) {
                result = result + diffs[i];
            }
            if(result * result == num) {
                return String.format("%.2f", result);
            }else {
                result = result - diffs[i];
            }
        }
        return String.format("%.2f", result);
    }
}
