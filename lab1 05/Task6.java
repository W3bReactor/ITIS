import java.util.Arrays;
public class Task6 {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, -3, 9, 0};
        System.out.println(Arrays.toString(sort(a )));

    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if(compare(a[j], a[j+1]) > 0) {
                    swap(a, j, j+1);
                }
            }
        }
        return a;
    }

    public static int compare(int a, int b) {
        return a > b ? 1 : a < b ? -1 : 0;
    }

}