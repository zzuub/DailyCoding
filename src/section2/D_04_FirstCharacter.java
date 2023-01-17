package section2;

public class D_04_FirstCharacter {
    public String firstCharacter(String str){
        if(str.length() == 0){
            return "";
        }
        String[] arr = str.split(" ");
        String result = "";

        for(int i = 0; i < arr.length; i++){
            result += arr[i].charAt(0);
        }
        return result;
    }
}
