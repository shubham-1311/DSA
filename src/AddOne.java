public class AddOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println(digits);
            if (++digits[i] != 10) return digits;
            digits[i] = 0;
        }

        int[] res = new int[digits.length + 1];
        System.out.println("hey");
        res[0] = 1;
        return res;
    }
}
