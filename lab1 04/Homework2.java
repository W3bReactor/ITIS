import java.util.Arrays;

public class Homework2 {
	public static void main(String[] args) {
        char[] arr = {'А', 'с', 'ё', 'а', 'ж', 'к', 'Б', 'b', 'я'};
        String[] strArr = {"Apple", "Appled", "Arslanov", "Baraban"};
        String[] strArrRu = {"ЁЖ", "ЖЁ", "ЯблокоД", "Арсланов", "Яблоко"};
//        System.out.println(sorting(arr ));
        System.out.println(Arrays.toString(sorting(strArr)));
        System.out.println(Arrays.toString(sorting(strArrRu)));
	}

    public static String[] sorting(String[] strArr) {
//        Флаг (отсортирован/не отсортирован)
        boolean isSorted = false;

        String alph = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
//       Если при сортировке элементы поменялись местами, то выполняем все, что ниже
        while(!isSorted) {
//
            isSorted = true;
//            Проходимся по массиву из слов (Начинаем с w = 1, чтобы сравнивать 2 слова)
            for (int w = 1; w < strArr.length; w++ ) {
//
                String word1 = strArr[w - 1];
                String word2 = strArr[w];
//              Проходимся по символам слова (при этом нужен минимальный, чтобы не выйти за границы 1-го или 2-го слова)
                for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
//                  Находим нашу букву
                    int elIndex1 = word1.charAt(i);
                    int elIndex2 = word2.charAt(i);
//                   Находим букву в алфавите (функция findEl вернёт местоположение (индекс) в алфавите, либо -1, если слова нет в алфавите )
                    int finded1 = findEl(alph, word1.charAt(i));
                    int finded2 = findEl(alph, word2.charAt(i));
//                  Проверяем есть ли символ в алфавите
                    if (finded1 != -1) {
//                      Если символ есть в алфавите, то к его индексу добавляем какое-то число (любое, просто нужно, чтобы русские символы не совпали с латиницей или другими символами
//                      К примеру: латинская I - 73 и русская А - 73 (Ну типо смешение будет индексов при сортировке, поэтому не нада, чтобы так было)
//                      )
                        elIndex1 = finded1+100*100;
                    }
//                    Тут тоже самое
                    if (finded2 != -1) {
                        elIndex2 = finded2+100*100;
                    }
//                    Проверяем какой индекс больше (Нас не устраивает если, к примеру 10005 > 10004 (А тут будет такое [..., 10005, 10004, ...] ), надо, чтобы соблюдался порядок [..., 10004, 10005, ...])
                    if(elIndex1 > elIndex2) {
//                      Сохраняем значения 2-го слова в переменной
                        String temp = strArr[w];
//                      Меняем 2-ое слово на 1-ое
                        strArr[w] = strArr[w-1];
//                      Меняем 1-ое слово на 2-ое
                        strArr[w-1] = temp;
//                      Массив поменялся местами => Будем проходится еще раз => меняем флаг на false
                        isSorted = false;
                        break;
//                        P.S 10004, 10005 - только для примера
//                        Если 10004 < 10005 т.е [..., 10004, 10005, ...], то нас все устраивает, мы не меняем слова местами
                    } else if (elIndex1 < elIndex2 ) {
//                      Нужно обязательно break, чтобы не продолжать сравнение (иначе массив продолжит сортироваться, вроде даже бесконечно)
                        break;
                    }
//                  Проверка на длину массива и последний символ, т.е пусть существует Apple и Appled,
//                  Тогда очевидно, что Appled должно быть первее, чем Apple, т.е [..., Appled, Apple, ...]
//                  Как раз это тут и проверяется
//                  Проверяем на последнем ли мы символе и длину массивов (нас не устраивает вариант, когда 1 слово имеет длину меньше, чем второе
//                  Т.е [..., Apple, Appled, ...], надо поменять на [..., Appled, Apple, ...]
                    if(i == Math.min(word1.length(), word2.length())-1 && word1.length() < word2.length()) {
//                      Сохраняем значения 2-го слова в переменной
                        String temp = strArr[w];
//                      Меняем 2-ое слово на 1-ое
                        strArr[w] = strArr[w-1];
//                      Меняем 1-ое слово на 2-ое
                        strArr[w-1] = temp;
//                      Массив поменялся местами => Будем проходится еще раз => меняем флаг на false
                        isSorted = false;
                        break;
                    }


                }
            }
        }
        return strArr;
    }


    public static int findEl(String str, char letter) {
//      Проходимся по алфавиту и проверяем есть ли наш символ в алфавите
		for (int i = 0; i < str.length(); i++) {
			if(letter == str.charAt(i)) {
//               Если есть, то возвращаем её место в алфавите (индекс)
				return i;
			}
		}
//      Иначе -1
		return -1;
	}

}