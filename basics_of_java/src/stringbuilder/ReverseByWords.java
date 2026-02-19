package stringbuilder;

public class ReverseByWords {
    public static String solution(String s) {

        StringBuilder result = new StringBuilder();

        int startIndex = s.length()-1;
        
        while (startIndex >= 0) {
            while (startIndex >= 0 && s.charAt(startIndex) == ' ') {
                startIndex--;
            }
            if(startIndex < 0) {
                break;
            }
            int endIndex = startIndex;

            while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
                startIndex--;
            }

            // got the word
            if (result.length() == 0) {
                // first word inserting in result
                result.append(s.substring(startIndex+1, endIndex+1));
            }
            else {
                result.append(' ');
                result.append(s.substring(startIndex+1, endIndex+1));
            }
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        String s = " I Love Coding In JAVA";
        System.out.println(solution(s));  
    }
}
