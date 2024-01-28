public class isMonotonicClass {

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3, 3, 14, 8}));
    }

    public static boolean isMonotonic(int[] nums) {

        boolean asc = true;
        boolean dsc = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                asc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dsc = false;
            }
        }
        return asc || dsc;

    }
}
