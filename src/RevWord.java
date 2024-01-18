public class RevWord {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {

        String op = "";
        for (String a : s.split(" ")) {
            op += reverseString(a) + " ";
            System.out.println(op);
        }
        return op.substring(0, s.length());
    }

    public static String reverseString(String s) {
        char[] a = s.toCharArray();
        String op = "";
        for (int i = a.length-1; i >= 0; i--) {
            op += a[i];
        }
        return op;
    }

// Using stringBuilder

//    public String reverseWords(String s) {
//        String op = "";
//        for (String a : s.split(" ")) {
//            StringBuilder sb = new StringBuilder(a);
//            sb.reverse();
//            op += sb + " ";
//        }
//        return op.substring(0,s.length());
//    }

}
