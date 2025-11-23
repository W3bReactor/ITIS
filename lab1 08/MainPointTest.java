public class MainPointTest {
	public static void main(String[] args) {
		/*
			Определяем переменную point типа Point
			и инициализируем её новый экземпляром класса Point
		*/

		Point point = new Point();
				/*
			инициализируем внутреннюю структуру,
			используя оператор доступа
		*/

		point.x = 5;
		point.y = 6;
		System.out.println(point.distanceToStartCoords());
		point.move(5,4);
		System.out.println(point.distanceToStartCoords());
		
	}


}