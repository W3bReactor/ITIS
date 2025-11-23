public class Program3 {
	public static void main(String args[]) {
		// boolean varBool1 = true;
		// boolean varBool0 = false;
		// boolean varBool3 = varBool1 && varBool0;
		// System.out.println("Hello, world!");

		// if(varBool3) {
		// 	System.out.println("Hello, world!");
		// }
		boolean varBool1 = true;
		boolean varBool2 = true;
		boolean varBool1variant2 = true;
		boolean varBool2variant2 = false;
		boolean varBool1variant3 = false;
		boolean varBool2variant3 = true;
		boolean varBool1variant4 = false;
		boolean varBool2variant4 = false;

		// System.out.println("var1 | var2 | & | | | ^ | !");
		// System.out.println("-------------------------------------");
		// System.out.println(varBool1 + "|" + varBool2 + "|" + (varBool1 && varBool2) + "|" + (varBool1 || varBool2) + "|" + (varBool1 ^ varBool2) + "|" + (!varBool1));
		// System.out.println(varBool1variant2 + "|" + varBool2variant2 + "|" + (varBool1variant2 && varBool2variant2) + "|" + (varBool1variant2 || varBool2variant2) + "|" + (varBool1variant2 ^ varBool2variant2) + "|" + (!varBool1variant2));
		// System.out.println(varBool1variant3 + "|" + varBool2variant3 + "|" + (varBool1variant3 && varBool2variant3) + "|" + (varBool1variant3 || varBool2variant3) + "|" + (varBool1variant3 ^ varBool2variant3) + "|" + (!varBool1variant3));
		// System.out.println(varBool1variant4 + "|" + varBool2variant4 + "|" + (varBool1variant4 && varBool2variant4) + "|" + (varBool1variant4 || varBool2variant4) + "|" + (varBool1variant4 ^ varBool2variant4) + "|" + (!varBool1variant4));
		// System.out.println(	);

		System.out.println("var1 | var2 | & | | | ^ | !");
		System.out.println("-------------------------------------");
		System.out.println(varBool1 + "|" + varBool2 + "|" + (varBool1 && varBool2) + "|" + (varBool1 || varBool2) + "|" + (varBool1 ^ varBool2) + "|" + (!varBool1));
		varBool1 = true;
		varBool2 = false;
		System.out.println(varBool1 + "|" + varBool2 + "|" + (varBool1 && varBool2) + "|" + (varBool1 || varBool2) + "|" + (varBool1 ^ varBool2) + "|" + (!varBool1));
		varBool1 = false;
		varBool2 = true;
		System.out.println(varBool1 + "|" + varBool2 + "|" + (varBool1 && varBool2) + "|" + (varBool1 || varBool2) + "|" + (varBool1 ^ varBool2) + "|" + (!varBool1));
		varBool1 = false;
		varBool2 = false;
		System.out.println(varBool1 + "|" + varBool2 + "|" + (varBool1 && varBool2) + "|" + (varBool1 || varBool2) + "|" + (varBool1 ^ varBool2) + "|" + (!varBool1));

	}
}