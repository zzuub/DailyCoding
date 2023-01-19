package section2;

public class D_06_LetterCapitalize {
    public String letterCapitalize(String str){
        if(str.length() == 0) return "";

        String[] words = str.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++) {
            if(words[i].isEmpty()) {
                words[i] = words[i];
            } else {
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
        }

        result = String.join(" ", words);
        return result;
    }
}
