import java.util.Arrays;

public class Test2 {
//    [ [[r, r, r], [17] ], [...] ]
    public static void main(String[] args) {
        int[] tree = {7, 1, 8, 11, 4, 2, 5, 6, 3, 9, 13, 12, 14, 10, 17};
        System.out.println(toInt("B"));
        System.out.println(Arrays.toString(findMax(0, tree, new String[(int) Math.log(tree.length) + 10], -1, "-", 0)));

    }

    public static String[] findMax(int nodeIndex, int[] tree, String[] road, int id, String curr, int savedMax) {

        if(!curr.equals("-")) {
            road[id] = curr;
            if(tree[nodeIndex] > savedMax) {
                savedMax = tree[nodeIndex];
                road[id + 1] = savedMax + "";
            }
        }
        String[] savedRoad = road.clone();
        String[] lResult = new String[(int) Math.log(tree.length) + 10];
        int lMax = 0;
        int prevMax = findLastElement(road);
        if(curr.equals("-")) {
            prevMax = tree[nodeIndex];
        }
        savedMax = prevMax;
        if(nodeIndex*2+1 < tree.length) {

            lResult = findMax(nodeIndex*2+1, tree, road, id+1, "l", savedMax);
            lMax = findLastElement(lResult);
        }
        String[] rResult = new String[(int) Math.log(tree.length) + 10];
        int rMax = 0;
        if(nodeIndex*2+2 < tree.length) {
            rResult = findMax(nodeIndex*2+2, tree, road, id+1, "r", savedMax);
            rMax = findLastElement(rResult);
        }
        if(prevMax > rMax && prevMax > lMax) {
            return savedRoad;
        }
        if(rMax > lMax) {
            return rResult;
        } else {
            return lResult;
        }


    }


    public static int findLastElement(String[] strArr) {
        if(strArr[0] == null) {
            return 0;
        }
        for(int i = strArr.length-1; i >= 0; i--) {
            if(toInt(strArr[i]) != 0) {
                return toInt(strArr[i]);
            }
        }
        return 0;
    }


    public static int toInt(String str) {
        int result = 0;
        if(str == null) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            char res = str.charAt(i);
            if((res - '0') < 10) {
                result = result * 10 + (res - '0');
            } else {
                return 0;
            }
        }
        return result;
    }
}
