public class strStrClass {

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }

    public static int strStr(String haystack, String needle) {
        haystack = haystack.toLowerCase();
        needle = needle.toLowerCase();
        if (haystack.length() < needle.length()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if(compareString(haystack, needle, i)) return i;
            }
        }
        return -1;
    }

    public static boolean compareString(String haystack, String needle, int idx) {
        if(haystack.length()-idx < needle.length()) return false;
        for (int i = 0; i < needle.length(); i++) {
            if (!(haystack.charAt(idx + i)==needle.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
