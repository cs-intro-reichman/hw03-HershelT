import java.util.HashSet;
import java.util.Set;

/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {
        //String str = args[0];
        String str = "hheellregeroohhhhhhweeeeeeeezyw";
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string,
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */

    public static String uniqueChars(String s) {
        char testLetter = ' ';
        String newString = "";
        Set<Integer> numberList = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i< s.length();i++ ) {
            System.out.println(i +":" + s.charAt(i) + " : " + testLetter);
            testLetter = s.charAt(i);
            for (int j = i + 1;j < s.length();j++) {
                if (s.indexOf(testLetter, j) > 0) {
                    System.out.println(s.indexOf(testLetter, j));
                    numberList.add(s.indexOf(testLetter, j));
                }
            }
        }
        for (int i =0; i < s.length();i++) {
            if (!numberList.contains(i)) {
                newString+=s.charAt(i);
            }
        }
        return newString;

    }
}

