import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        // 0  1  2   3  4  5  6  7  8  9  10  11  12  13  14
        // 7, 1, 8, 11, 4, 2, 5, 6, 3, 9, 13, 12, 14, 10, 17
//
        int[] tree = {7, 1, 8, 11, 4, 2, 5, 6, 3, 9, 13, 12, 14, 10, 17};
        System.out.println(Arrays.toString(findMin(0, tree, new char[(int) Math.log(tree.length) + 10], -1, '-', 100000)));
    }


    public static char[] findMin(int nodeIndex, int[] tree, char[] road, int id, char curr, int savedMin) {
        if(curr != '-') {
            road[id] = curr;
            if(tree[nodeIndex] < savedMin) {
                savedMin = tree[nodeIndex];
                if(savedMin < 0) {
                    road[id + 2] = (char) 10000;
                }
                road[id + 1] = (char) savedMin;
            }
        }
        char[] savedRoad = road.clone();
        char[] lResult = new char[(int) Math.log(tree.length) + 10];
        int lMin = 0;
        int prevMin = findLastElement(road);
        if(curr == '-') {
            prevMin = tree[nodeIndex];
        }
        savedMin = prevMin;
        if(nodeIndex*2+1 < tree.length) {

            lResult = findMin(nodeIndex*2+1, tree, road, id+1, 'l', savedMin);
            lMin = findLastElement(lResult);
        }
        char[] rResult = new char[(int) Math.log(tree.length) + 10];
        int rMin = 0;
        if(nodeIndex*2+2 < tree.length) {
            rResult = findMin(nodeIndex*2+2, tree, road, id+1, 'r', savedMin);
            rMin = findLastElement(rResult);
        }
        if(prevMin < rMin && prevMin < lMin) {
            return savedRoad;
        }
        if(rMin < lMin) {
            return rResult;
        } else {
            return lResult;
        }


    }


    public static int findLastElement(char[] arr) {
        boolean isNegative = false;
        int result = 100000;
        for(int i = arr.length-1; i >= 0; i--) {
            if((int) arr[i] != 0) {
                char temp = arr[i];
                if((int) temp == 10000) {
                    isNegative = true;
                }
                if( temp != 'r' && temp != 'l' && temp != '-' ) {
                    result = ((int) temp) * (isNegative ? -1 : 1);
                }
            }
        }
        return result;
    }


}