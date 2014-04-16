package ru.pshenichnikova.lab5;

/**
 * Основной класс программы
 *
 *  @author Pshenichnikova Valentina
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class lab5
{
	private static List<Figure> list; 
	
	public static void main(String[] args) throws IOException
    {
        inputData();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        String str, st;
        boolean sortDown = false;
        int sortMode = 0;
        double a,r,h;
        double x,y,z;
        
        
        outputData( sortDown, sortMode);
        for ( ; ; )
        { 
            System.out.println("--------------------------------------------------");
            System.out.println("                Сортировка:                      ");
	        System.out.println("--------------------------------------------------");
	        System.out.println(" 1) - по убыванию ID");
	        System.out.println(" 2) - по возврастанию ID");
	        System.out.println(" 3) - по убыванию имени");
	        System.out.println(" 4) - по возврастанию имени");
	        System.out.println(" 5) - по убыванию периметра");
	        System.out.println(" 6) - по увеличению периметра");
	        System.out.println(" 7) - переместить на вектор");
	        System.out.println(" 8) - отразить относительно осей");
	        System.out.println(" 9) - добавить элемент");
            System.out.println(" 10) - удалить элемент");
	        System.out.println(" 0) - Выход");
	        System.out.println("--------------------------------------------------");
	        System.out.print(  " === > ");
	        str = input.readLine();
	        System.out.println("--------------------------------------------------");
        
	        if ( str.equals("0") ) break;
        
	        sortDown = str.equals("1") || str.equals("3") || str.equals("5");   // убывание - возрастание
	        sortMode = -1;
	        if ( str.equals("1") || str.equals("2") || str.equals("7") || str.equals("8") )  sortMode = 0;  // по ID
	        if ( str.equals("3") || str.equals("4") )  sortMode = 1;  // по имени
	        if ( str.equals("5") || str.equals("6") )  sortMode = 2;  // по площади
	   
	        if(str.equals("9")) // добавить
            {
            	System.out.println("--------------------------------------------------");
            	System.out.println("                 Добавление элемента");
            	System.out.println("--------------------------------------------------");
            	System.out.println(" Выберите тип нового элемента:");
            	System.out.println("--------------------------------------------------");
            	System.out.println(" 1) - Треугольник");
            	System.out.println(" 2) - Четырёхугольник");
               	System.out.println(" 3) - Пятиугольник");
               	System.out.println(" 4) - Шестиугольник");
                System.out.println("--------------------------------------------------");
                System.out.print(  " === > ");
                st = input.readLine();
                System.out.println("--------------------------------------------------");
             
                System.out.println("|==>| Введите координаты точки А:             |");
            	System.out.print(  "|====>| Координаты точки А: x = ");
            	x = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки А: y = ");
                y = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки А: z = ");
                z = Double.parseDouble( input.readLine() );
                Point A = new Point (x,y,z);
                System.out.println("|==>| Введите координаты точки B:             |");
            	System.out.print(  "|====>| Координаты точки B: x = ");
            	x = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки B: y = ");
                y = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки B: z = ");
                z = Double.parseDouble( input.readLine() );
                Point B = new Point(x,y,z);
                System.out.println("|==>| Введите координаты точки C:             |");
            	System.out.print(  "|====>| Координаты точки C: x = ");
            	x = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки C: y = ");
                y = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки C: z = ");
                z = Double.parseDouble( input.readLine() );
                Point C = new Point (x,y,z);
                if ( st.equals("1") )
                {
                    list.add( new Triangle( A,B,C) );
                }
                if ( st.equals("2") )
                {
                	System.out.println("|==>| Введите координаты точки D:             |");
                 	System.out.print(  "|====>| Координаты точки D: x = ");
                 	x = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки D: y = ");
                    y = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки D: z = ");
                    z = Double.parseDouble( input.readLine() );
                    Point D = new Point (x,y,z);
                   
                    list.add( new Quadrangle( A,B,C,D) );
                }
                if ( st.equals("3") )
                {
                	System.out.println("|==>| Введите координаты точки D:             |");
                 	System.out.print(  "|====>| Координаты точки D: x = ");
                 	x = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки D: y = ");
                    y = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки D: z = ");
                    z = Double.parseDouble( input.readLine() );
                    Point D = new Point (x,y,z);
                    System.out.println("|==>| Введите координаты точки E:             |");
                 	System.out.print(  "|====>| Координаты точки E: x = ");
                 	x = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки E: y = ");
                    y = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки E: z = ");
                    z = Double.parseDouble( input.readLine() );
                    Point E = new Point (x,y,z);
                   
                    list.add( new Pentagon( A,B,C,D,E) );
                }
                if ( st.equals("4") )
                {
                	System.out.println("|==>| Введите координаты точки D:             |");
                 	System.out.print(  "|====>| Координаты точки D: x = ");
                 	x = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки D: y = ");
                    y = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки D: z = ");
                    z = Double.parseDouble( input.readLine() );
                    Point D = new Point (x,y,z);
                    System.out.println("|==>| Введите координаты точки E:             |");
                 	System.out.print(  "|====>| Координаты точки E: x = ");
                 	x = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки E: y = ");
                    y = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки E: z = ");
                    z = Double.parseDouble( input.readLine() );
                    Point E = new Point (x,y,z);
                    System.out.println("|==>| Введите координаты точки F:             |");
                 	System.out.print(  "|====>| Координаты точки F: x = ");
                 	x = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки F: y = ");
                    y = Double.parseDouble( input.readLine() );
                 	System.out.print(  "|====>| Координаты точки F: z = ");
                    z = Double.parseDouble( input.readLine() );
                    Point F = new Point (x,y,z);
                   
                    list.add( new Hexagon(A,B,C,D,E,F) );
                }
                
              
                System.out.println("--------------------------------------------------  ");
            }
            
	        if ( str.equals("7") ) // ввод вектора/перемещение
            { 
            	System.out.println("--------------------------------------------------");
            
            	System.out.println("|==>| Введите ID объекта:                        |");
            	System.out.print(  "|==>| ID = ");
            	
            	st = input.readLine();
            	
            	int id = Integer.parseInt(st);
            	System.out.println("|==>| Введите координаты вектора АВ:             |");
            	System.out.print(  "|====>| Координаты точки А: x = ");
            	x = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки А: y = ");
                y = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки А: z = ");
                z = Double.parseDouble( input.readLine() );
            	
            	Point A = new Point (x,y,z);
            	
            	System.out.print("\n|====>| Координаты точки B: x = ");
            	x = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки B: y = ");
            	y = Double.parseDouble( input.readLine() );
            	System.out.print(  "|====>| Координаты точки B: z = ");
            	z = Double.parseDouble( input.readLine() );
            	System.out.println("--------------------------------------------------");
                
            	Point B = new Point (x,y,z);
            	
            	for(int i = 0; i< list.size(); i++)
            	{
                    if( list.get(i).getId() == id) 
                    {
                        list.get(i).move( A, B);
                        break;
                    }
            	}
            
             	System.out.println("--------------------------------------------------  "   );
            }
            
            if( str.equals("8") ) // отражение относительно начала координат
            {
            	System.out.println("--------------------------------------------------");
                
            	System.out.println("|==>| Введите ID объекта:                        |");
            	System.out.print(  "|==>| ID = ");
            	
            	st = input.readLine();
            	int id = Integer.parseInt(st);
            	System.out.println(" Выберите тип отражения:");
            	System.out.println("--------------------------------------------------");
            	System.out.println(" 1) - Относительно ОX");
            	System.out.println(" 2) - Относительно ОY");
               	System.out.println(" 3) - Относительно ОZ");
                System.out.println("--------------------------------------------------");
                System.out.print(  " === > ");
                st = input.readLine();
            	int k = Integer.parseInt(st);
                for(int i = 0; i< list.size(); i++)
            	{
                    if( list.get(i).getId() == id) 
                    {
                        list.get(i).reflect(k);
                        break;
                    }
            	}
             	System.out.println("--------------------------------------------------  ");
            }
           
            if(str.equals("10"))
            {
            	System.out.println("--------------------------------------------------");
            	System.out.println("                 Удаление элемента");
            	System.out.println("--------------------------------------------------");
            	System.out.print(" Введите ID объекта: ");
            	
            	st = input.readLine();
            	int id = Integer.parseInt(st);
            	
            	for(int i = 0; i< list.size(); i++)
            	{
                    if( list.get(i).getId() == id) 
                    {
                        list.remove(i);
                        break;
                    }
            	}
            	
            	System.out.println("--------------------------------------------------");
            }
            if( sortMode < 0 )
            {
                System.out.println("|      Ошибка при вводе. Попробуйте еще раз...   |");
                System.out.println("==================================================");  
            }
            else 
            {
            	 outputData( sortDown, sortMode);
            }
        }
    }
    
    private static void outputData(boolean sortDown, int sortMode)
    {
    	 Collections.sort(list, new SortMode(sortDown,sortMode));
         
         for (Figure p: list ) 
         {
             System.out.println(p);
         }
    }
    
    private static void inputData()
    {
    	list = new ArrayList();
    	
    	list.add(new Triangle(new Point(10,7,2),new Point(4,0,2), new Point(3,5,2)));    
		list.add(new Quadrangle(new Point(3,0,2),new Point(4,0,2), new Point(3,5,2), new Point(8,2,4)));
		list.add(new Pentagon(new Point(8,0,2),new Point(4,0,2), new Point(3,5,2), new Point(4,1,2), new Point(2,6,0)));
		list.add(new Hexagon(new Point(0,1,2),new Point(4,0,2), new Point(3,5,2), new Point(3,4,2), new Point(1,5,2), new Point(3,0,0)));
  
    }
}
