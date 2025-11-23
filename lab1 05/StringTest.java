public class StringTest {
	public static void main(String[] args) {
		String s = "Лабораторная работа 5";
		System.out.println("Длина строки: " + s.length() );		
		System.out.println("2-й символ: " + s.charAt(1) );	
		String copyS = s + "";
		System.out.println("Строки равны? " + (copyS == s) );		
		s = s.replace("5", "6");
		System.out.println("Изменённая строка: " + s );		

		String a = "Hello";
		String b = a;
		a = "World";
		System.out.println(b);
	}
}