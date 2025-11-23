import java.util.Arrays;
public class Task5 {
    static double saveFactor = 1;
    static int saveFactorNumber = 1;

    public static void main(String[] args) {
        System.out.println(factor(5));
        System.out.println(factor(6));
    }
    public static double factor(int num) {
        if (num == 0) {
            return 1;
        }
        boolean isNegative = false;
        if (num < 0) {
            num *= -1;
            isNegative = true;
        }
        double res = 1;

        if (num > saveFactorNumber) {
            res = saveFactor;
        } else if (num == saveFactorNumber) {
            return saveFactor;
        }

        for (int i = (num > saveFactorNumber) ? saveFactorNumber+1 : 1; i <= num; ++i) {
            res *= i;
            System.out.println("Итерация");
        }
        saveFactor = res;
        saveFactorNumber = num;
        if (isNegative) {
            return res * -1;
        }
        return res;
    }


}