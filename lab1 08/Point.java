/*
	Класс описывающий точку на плоскости
	Атрибуты (свойства, члены класса)

	поведение - методы
*/
public class Point {
	double x;
	double y;
	// Существуют также полярные координаты (через угол и радиус) 
	// double[] coords = {0.1, 0.3}

	double distanceToStartCoords() {
		return Math.sqrt(x*x + y*y);
	}

// 	Сдвиг точки
	void move(double deltaX, double deltaY) {
		x += deltaX;
		y += deltaY;
	}

}