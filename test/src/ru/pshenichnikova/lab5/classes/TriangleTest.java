package ru.pshenichnikova.lab5.classes;

/**
* Тестирование методов класса "Треугольник"
*
*  @author Pshenichnikova Valentina
*/
import ru.pshenichnikova.lab5.*;

import org.junit.Test;
import static org.junit.Assert.*; 



public class TriangleTest
{
    @Test
    public void testPerimeter()
    {
	System.out.println("Проверка метода getPerimeter() в классе Triangle");
	Triangle p = new Triangle(new Point(10,7,2),new Point(4,0,2), new Point(3,5,2));

	assertEquals(21.59867386, p.getPerimeter(), 0.00001);
    }
  @Test
    public void testAC()
    {
	System.out.println("Проверка метода getAC() в классе Triangle");
	Triangle p = new Triangle(new Point(10,7,2),new Point(4,0,2), new Point(3,5,2));

	assertEquals(7.280109889, p.getAC(), 0.00001);
    }
}


  