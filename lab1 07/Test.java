public class Test {
	public static void main(String[] args) {
		String t = "105";
		System.out.println(Integer.parseInt(t));
        System.out.println(toInt(t));
	}

    public static int toInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); ++i) {
            char symbol = str.charAt(i);
            result = result * 10 + (symbol - '0');
        }

        return result;
    }

}