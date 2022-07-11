import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {9,8,7,9};
        int n = 234;
        System.out.println(Arrays.toString(plusNumber(array,n)));

    }
    private static int[] plusNumber (int[] digits, int number){

            int a = 0;
            for (int i = 0; i < digits.length; i++){
                a += (int) (digits[i]*Math.pow(10, digits.length-1-i));
            }

            a += number;
            System.out.println(a);
            int length = 0;
            int n = a;
            while (n > 0) {
                n /= 10;
            length++;
             }

            int[] array = new int[length];

            for (int i = 0; i < length; i++){
                array[i] = (int)(a/Math.pow(10, length-1-i));
                a -= (int)(array[i]*Math.pow(10, length-1-i));

            }

            return array;

    }
}
