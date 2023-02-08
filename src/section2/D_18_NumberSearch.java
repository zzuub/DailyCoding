package section2;

public class D_18_NumberSearch {
    public int numberSearch(String str) {
        String digits = "0123456789";

        if(str.length() == 0) {
            return 0;
        }

        double sum = 0;
        String pureStr = "";

        for(int i = 0; i < str.length(); i++) {
            if(digits.indexOf(str.charAt(i)) != -1) {
                sum = sum + Character.getNumericValue(str.charAt(i));
            } else if(str.charAt(i) != ' ') {
                pureStr = pureStr + str.charAt(i);
            }
        }
        double result = sum / pureStr.length();

        return (int) Math.round((result * 10) / 10);
    }
}
