import java.util.Scanner;

public class Array_demo {

    public static void main(String[] args) {
        int arr[];
        arr= new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();

        }
        for (int rec:arr) {
            System.out.println(rec);
            System.out.println(arr.length);
        }
    }
}
