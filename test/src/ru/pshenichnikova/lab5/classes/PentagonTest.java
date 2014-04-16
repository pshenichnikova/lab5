package ru.pshenichnikova.lab5.classes;

/**
* Тестирование методов класса "Пятиугольник"
*
*  @author Pshenichnikova Valentina
*/
import ru.pshenichnikova.lab5.*;

import org.junit.Test;
import static org.junit.Assert.*; 



public class PentagonTest
{
    @Test
    public void testPerimeter()
    {
	System.out.println("Проверка метода getPerimeter() в классе Pentagon");
	Pentagon p = new Pentagon(new Point(8,0,2),new Point(4,0,2), new Point(3,5,2), new Point(4,1,2), new Point(2,6,0));

	assertEquals(27.68448567, p.getPerimeter(), 0.00001);
    }
  @Test
    public void testAE()
    {
	System.out.println("Проверка метода getAE() в классе Pentagon");
	Pentagon p = new Pentagon(new Point(8,0,2),new Point(4,0,2), new Point(3,5,2), new Point(4,1,2), new Point(2,6,0));

	assertEquals(8.717797887, p.getAE(), 0.00001);
    }
}


  