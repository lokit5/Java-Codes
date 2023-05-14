package DSAProblems;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates("appnnacollege",0,new StringBuilder(""),new boolean[26]);
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            removeDuplicates(str,idx+1,newStr,map);
        } else {
            newStr.append(currChar);
            map[currChar - 'a'] = true;
            removeDuplicates(str,idx+1,newStr,map);
        }
    }
}
