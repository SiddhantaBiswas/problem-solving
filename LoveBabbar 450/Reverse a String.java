class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        // Reverse the string str
        int n = str.length() - 1;
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i];
            s[n - i] = temp;
        }
        StringBuilder sb = new StringBuilder("");
        for (char c : s) {
            sb.append(c);
        }
        return sb.toString();
    }
}
