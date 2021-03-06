package day32_multidimensional_arrays;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {


       /*

    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

     */
        int[] a = {1, 2, 3};
        int[] b = a; // b is a new reference/name but the array is the same as the one 'a' reference/name is pointing to, so there is only one array made
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 100;
        b[1] = 200;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println();

        int[] z = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(z));

        z[0] = 500;

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("z: " + Arrays.toString(z));
    }
}