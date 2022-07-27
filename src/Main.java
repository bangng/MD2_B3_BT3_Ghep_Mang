import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
        int [] arr1 = {4,6,8};
        int [] arr2 = {5,3,8};
        int [] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        System.out.println(Arrays.toString(newArr));

    }
}
