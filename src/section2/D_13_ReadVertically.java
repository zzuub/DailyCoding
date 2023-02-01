package section2;

public class D_13_ReadVertically {
    public String readVertically(String[] arr) {
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].length()) {
                max = arr[i].length();
            }
        }

        String[] temp = new String[max];

        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
            for(int j = 0; j < str.length(); j++) {
                if(temp[j] == null) {
                    temp[j] = Character.toString(str.charAt(j));
                } else {
                    temp[j] = temp[j] + str.charAt(j);
                }
            }
        }

        String result = "";

        for(int i = 0; i < temp.length; i++) {
            result = result + temp[i];
        }
        return result;
    }
}
