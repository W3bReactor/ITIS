import java.util.Arrays;
public class Task4 {
    static double saveFactor = 1;
    static int saveFactorNumber = 1;
    public static void main(String[] args) {
        System.out.println(findExp(-4));
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
            return saveFactor * (isNegative ? -1 : 1);
        }

        for (int i = (num > saveFactorNumber) ? saveFactorNumber+1 : 1; i <= num; ++i) {
            res *= i;
        }
        saveFactor = res;
        saveFactorNumber = num;
        if (isNegative) {
            return res * -1;
        }
        return res;
    }
    public static double extent(int num, int degree) {
        if (degree == 0) {
            return 1;
        }
        if (degree < 0) {
            degree *= -1;
        }
        int res = num;
        for (int i = 1; i < degree; ++i) {
            res *=  num;
        }
        if (degree < 0) {
            return 1/res;
        }
        return res;
    }

    public static double findExp(int x) {
        double e = 1;
        int i = 1;

        double checker = ((double) extent(x, i) / factor(i));
        while (!(  checker > -0.00001 && checker < 0.00001)) {
            checker = ((double) extent(x, i) / factor(i));
            e = e + checker;
            i++;
        }
        return e;
    }


}