/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {
        //String str = args[0];
        String str = "helllllllllllo";
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string,
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        return null;

    }
}
       /*
        // Replace the following statement with your code
        int[] numsToIgnore = new int[s.length()];
        int iterate = 0;
        String UniqueString = String.valueOf(s.charAt(0));
        char testLetter = s.charAt(0);
        for (int i = 0; i < s.length();i++) {
            if (i+1 <s.length()) {
                for (int j = i+1;j<s.length()-1;j++){

                        for (int c = 0; c < numsToIgnore.length;c++) {
                            if (testLetter == s.charAt(j)) {
                                if (c == numsToIgnore[j]) {
                                    numsToIgnore[iterate] = j;
                                    System.out.println(testLetter + " : " + s.charAt(j));
                                    iterate++;
                                }
                            }
                        }

                    }
                }
            }

            testLetter = s.charAt(i);
        }
        for (int i = 0;i<s.length();i++){
            boolean isIn = false;
            for (int j = 0; j < numsToIgnore.length;j++) {
                if (i == numsToIgnore[j]) {
                    isIn = true;
                }
            }
            if (!isIn) {
                UniqueString += s.charAt(i);
            }
        }
        return UniqueString;












    */

}