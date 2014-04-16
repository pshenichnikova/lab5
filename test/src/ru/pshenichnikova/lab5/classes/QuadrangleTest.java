package ru.pshenichnikova.lab5.classes;

/**
* Тестирование методов класса "Четырёхугольник"
*
*  @author Pshenichnikova Valentina
*/
import ru.pshenichnikova.lab5.*;

import org.junit.Test;
import static org.junit.Assert.*; 



public class QuadrangleTest
{
    @Test
    public void testPerimeter()
    {
	System.out.println("Проверка метода getPerimeter() в классе Quadrangle");
	Quadrangle p = new Quadrangle(new Point(3,0,2),new Point(4,0,2), new Point(3,5,2), new Point(8,2,4));

	assertEquals(18.008, p.getPerimeter(), 0.00001);
    }
  @Test
    public void testAD()
    {
	System.out.println("Проверка метода getAD() в классе Quadrangle");
	Quadrangle p = new Quadrangle(new Point(3,0,2),new Point(4,0,2), new Point(3,5,2), new Point(8,2,4));

	assertEquals(5.7445626, p.getAD(), 0.00001);
    }
}


  