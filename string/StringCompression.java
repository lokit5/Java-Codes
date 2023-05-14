package string;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress("aaabbcccdd"));
    }
    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder("");
        for(int i = 0; i < str.length(); i++) {
            //char ch = str.charAt(i);
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1) {
                newStr.append(count);
            }
        }
        return newStr.toString();
    }
}
