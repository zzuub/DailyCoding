package section2;

public class D_10_InsertDash {
    public String insertDash(String str) {
        if(str.length() == 0) {
            return null;
        }
        String result = "" + str.charAt(0);

        for(int i = 1; i < str.length(); i++) {
            int preNumber = Character.getNumericValue(str.charAt(i - 1)) % 2;
            int curNumber = Character.getNumericValue(str.charAt(i)) % 2;
            if(preNumber != 0 && curNumber != 0) {
                result = result + "-";
            }
            result = result + str.charAt(i);
        }
        return result;
    }
}
