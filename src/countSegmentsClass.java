public class countSegmentsClass {

    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public static int countSegments(String s) {
        if(s.isEmpty()) return 0;
        System.out.println(s);
        s = s.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        return s.split(" " ).length;
    }
}
