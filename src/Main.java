import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] even = {1, 2, 3, 4, 5, 6};
        int[] reversed1 = ArrayAlgorithms.reverse(even);
        System.out.println(Arrays.toString(reversed1));

        // original array is NOT modified
        System.out.println(Arrays.toString(even));

        System.out.println("----");

        int[] odd = {1, 2, 3, 4, 5};
        int[] reversed2 = ArrayAlgorithms.reverse(odd);
        System.out.println(Arrays.toString(reversed2));

        // original array is NOT modified
        System.out.println(Arrays.toString(odd));

        System.out.println("----");

        int[] even2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] reversed3 = ArrayAlgorithms.reverse(even2);
        System.out.println(Arrays.toString(reversed3));

        // original array is NOT modified
        System.out.println(Arrays.toString(even2));

        System.out.println("----");

        int[] odd2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] reversed4 = ArrayAlgorithms.reverse(odd2);
        System.out.println(Arrays.toString(reversed4));

        // original array is NOT modified
        System.out.println(Arrays.toString(odd2));

    }

}
