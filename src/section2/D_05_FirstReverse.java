package section2;

public class D_05_FirstReverse {
    public String firstReverse(String str){
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }
}
