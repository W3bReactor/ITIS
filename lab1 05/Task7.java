import java.util.Arrays;
public class Task7 {
    public static void main(String[] args) {
        int[] a = {1, 3, 9, 10, -20};
        System.out.println(mean(a, 1, 1));

    }
    public static double mean(int[] a, double curr, int currId) {
        if (currId == a.length) {
            return (double) curr / a.length;
        }
        return mean(a, curr + a[currId], currId + 1);
    }
}