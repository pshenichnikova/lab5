package ru.pshenichnikova.lab5.classes;

/**
* Тестирование методов класса "Шестиугольник"
*
*  @author Pshenichnikova Valentina
*/
import ru.pshenichnikova.lab5.*;

import org.junit.Test;
import static org.junit.Assert.*; 



public class HexagonTest
{
    @Test
    public void testPerimeter()
    {
	System.out.println("Проверка метода getPerimeter() в классе Hexagon");
	Hexagon p = new Hexagon(new Point(0,1,2),new Point(4,0,2), new Point(3,5,2), new Point(3,4,2), new Point(1,5,2), new Point(3,0,0));

	assertEquals(21.94441315, p.getPerimeter(), 0.00001);
    }
  @Test
    public void testAF()
    {
	System.out.println("Проверка метода getAF() в классе Hexagon");
	Hexagon p = new Hexagon(new Point(0,1,2),new Point(4,0,2), new Point(3,5,2), new Point(3,4,2), new Point(1,5,2), new Point(3,0,0));

	assertEquals(3.741657, p.getAF(), 0.00001);
    }
}


  