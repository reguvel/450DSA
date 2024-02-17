//Reverse an Array/String
//link:https://www.geeksforgeeks.org/problems/reverse-a-string/1
class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        // Reverse the string str
        int l = str.length();
        String rev = "";
        for (int i = 0; i < l; i++) {
            rev += str.charAt(l - i - 1);
        }
        return rev;
    }
}
