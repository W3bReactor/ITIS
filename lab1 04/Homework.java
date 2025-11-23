import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*
 {
 	"A": 1025,
 	"Б": 1026,
 	...
*/ 
public class Homework {
	public static void main(String[] args) {
        char[] arrEng = {'A', 'a', 'B'};
		char[] arr = {'А', 'с', 'ё', 'а', 'ж', 'к', 'Б'};
		Map<Character, Integer> extension = new HashMap<Character, Integer>() {{
            put('А', 1025);
            put('Б', 1026);
            put('В', 1027);
            put('Г', 1028);
            put('Д', 1029);
            put('Е', 1030);
            put('Ё', 1031);
            put('Ж', 1032);
            put('З', 1033);
            put('И', 1034);
            put('Й', 1035);
            put('К', 1036);
            put('Л', 1037);
            put('М', 1038);
            put('Н', 1039);
            put('О', 1040);
            put('П', 1041);
            put('Р', 1042);
            put('С', 1043);
            put('Т', 1044);
            put('У', 1045);
            put('Ф', 1046);
            put('Х', 1047);
            put('Ц', 1048);
            put('Ч', 1049);
            put('Ш', 1050);
            put('Щ', 1051);
            put('Ъ', 1052);
            put('Ы', 1053);
            put('Ь', 1054);
            put('Э', 1055);
            put('Ю', 1056);
            put('Я', 1057);
            put('а', 1058);
            put('б', 1059);
            put('в', 1060);
            put('г', 1061);
            put('д', 1062);
            put('е', 1063);
            put('ё', 1064);
            put('ж', 1065);
            put('з', 1066);
            put('и', 1067);
            put('й', 1068);
            put('к', 1069);
            put('л', 1070);
            put('м', 1071);
            put('н', 1072);
            put('о', 1073);
            put('п', 1074);
            put('р', 1075);
            put('с', 1076);
            put('т', 1077);
            put('у', 1078);
            put('ф', 1079);
            put('х', 1080);
            put('ц', 1081);
            put('ч', 1082);
            put('ш', 1083);
            put('щ', 1084);
            put('ъ', 1085);
            put('ы', 1086);
            put('ь', 1087);
            put('э', 1088);
            put('ю', 1089);
            put('я', 1090);
        }};
		ArrayList<Map<Character, Integer>> extensions = new ArrayList<>();
		
		extensions.add(extension);
		String[] strArr = {"Apple", "Appled", "Arslanov", "Baraban"};
        String[] strArrRu = {"ЁЖ", "ЖЁ", "ЯблокоД", "Арсланов"};
        System.out.println(sorting(arr ));
        System.out.println(sorting(arrEng ));
		System.out.println(sorting(arr, extensions ));
        System.out.println(Arrays.toString(sorting(strArr )));
        System.out.println(Arrays.toString(sorting(strArrRu )));
        System.out.println(Arrays.toString(sorting(strArrRu, extensions )));
	}

	public static char[] sorting(char[] charArr) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i = 1; i < charArr.length; i++) {
				if(charArr[i] < charArr[i - 1]) {
					char temp = charArr[i];
					charArr[i] = charArr[i-1];
					charArr[i-1] = temp;
					isSorted = false;
				}
			}
		}
		return charArr;
	}
	public static char[] sorting(char[] charArr, ArrayList<Map<Character, Integer>> extensions) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i = 1; i < charArr.length; i++) {
                int elIndex1 = charArr[i];
                int elIndex2 = charArr[i - 1];
                for (int j = 0; j < extensions.size(); j++) {
                    if (extensions.get(j).containsKey(charArr[i])) {
                        elIndex1 = extensions.get(j).get(charArr[i]);
                    }
                    if (extensions.get(j).containsKey(charArr[i-1])) {
                        elIndex2 = extensions.get(j).get(charArr[i-1]);
                    }
                }
                if(elIndex1 < elIndex2) {
					char temp = charArr[i];
					charArr[i] = charArr[i-1];
					charArr[i-1] = temp;
					isSorted = false;
				}
			}
		}
		return charArr;
	}
	public static String[] sorting(String[] stringArr) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int w = 1; w < stringArr.length; w++ ) {
				String word1 = stringArr[w-1];
				String word2 = stringArr[w];
				for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
                    if(word1.charAt(i) > word2.charAt(i)) {
                        String temp = stringArr[w];
						stringArr[w] = stringArr[w-1];
						stringArr[w-1] = temp;
                        isSorted = false;
                        break;
                    } else if (word1.charAt(i) < word2.charAt(i) ) {
                        break;
                    }
                    if(i == Math.min(word1.length(), word2.length())-1 && word1.length() < word2.length()) {
                            String temp = stringArr[w];
                            stringArr[w] = stringArr[w-1];
                            stringArr[w-1] = temp;
                            isSorted = false;
                            break;
                    }
                }
			}
		}
		return stringArr;
	}
    public static String[] sorting(String[] stringArr, ArrayList<Map<Character, Integer>> extensions) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int w = 1; w < stringArr.length; w++ ) {
                String word1 = stringArr[w-1];
                String word2 = stringArr[w];

                for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
                    int elIndex1 = word1.charAt(i);
                    int elIndex2 = word2.charAt(i);
                    for (int j = 0; j < extensions.size(); j++) {
                        if (extensions.get(j).containsKey(word1.charAt(i))) {
                            elIndex1 = extensions.get(j).get(word1.charAt(i));
                        }
                        if (extensions.get(j).containsKey(word2.charAt(i))) {
                            elIndex2 = extensions.get(j).get(word2.charAt(i));
                        }
                    }
                    if(elIndex1 > elIndex2) {
                        String temp = stringArr[w];
                        stringArr[w] = stringArr[w-1];
                        stringArr[w-1] = temp;
                        isSorted = false;
                        break;
                    } else if (elIndex1 < elIndex2 ) {
                        break;
                    }
                    if(i == Math.min(word1.length(), word2.length())-1 && word1.length() < word2.length()) {
                        String temp = stringArr[w];
                        stringArr[w] = stringArr[w-1];
                        stringArr[w-1] = temp;
                        isSorted = false;
                        break;
                    }
                }
            }
        }
        return stringArr;
    }

}