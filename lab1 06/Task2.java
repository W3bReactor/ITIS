import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		// 0  1  2   3  4  5  6  7  8  9  10  11  12  13  14
		// 7, 1, 8, 11, 4, 2, 5, 6, 3, 9, 13, 12, 14, 10, 17
		int[] tree = {7, 1, 8, 11, 4, 2, 5, 6, 3, 9, 13, 12, 14, 10, 17};
		
		System.out.println(Arrays.toString(findMax(0, tree, new char[(int) Math.log(tree.length) + 10], -1, '-', 0)));
	}


	public static char[] findMax(int nodeIndex, int[] tree, char[] road, int id, char curr, int savedMax) {

        if(curr != '-') {
			road[id] = curr;
			if(tree[nodeIndex] > savedMax) {
				savedMax = tree[nodeIndex];
                road[id + 1] = (char) savedMax;
            }
		}
        char[] savedRoad = road.clone();
		char[] lResult = new char[(int) Math.log(tree.length) + 10];
		int lMax = 0;
        int prevMax = findLastElement(road);
        if(curr == '-') {
            prevMax = tree[nodeIndex];
        }
        savedMax = prevMax;
        if(nodeIndex*2+1 < tree.length) {

            lResult = findMax(nodeIndex*2+1, tree, road, id+1, 'l', savedMax);
            lMax = findLastElement(lResult);
		}
        char[] rResult = new char[(int) Math.log(tree.length) + 10];
        int rMax = 0;
        if(nodeIndex*2+2 < tree.length) {
            rResult = findMax(nodeIndex*2+2, tree, road, id+1, 'r', savedMax);
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


    public static int findLastElement(char[] arr) {
        for(int i = arr.length-1; i >= 0; i--) {
            if((int) arr[i] != 0) {
                char temp = arr[i];
                if( temp != 'r' && temp != 'l' ) {
                    return (int) temp;
                }
            }
        }
        return 0;
    }


}