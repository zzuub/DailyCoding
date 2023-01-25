package section2;

public class D_08_ConvertDoubleSpaceToSingle {
    public String convertDoubleSpaceToSingle(String str){
        String[] words = str.split("  ");
        return String.join(" ", words);
    }
}
