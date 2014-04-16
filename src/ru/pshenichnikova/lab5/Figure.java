package ru.pshenichnikova.lab5;

import java.text.DecimalFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* Абстрактный класс "Фигура"
*
*  @author Pshenichnikova Valentina
*/

public abstract class Figure implements Movable, Symmetry
{
	 public int id;
	 private static int nextId = 1;
	 private boolean sortDown;
     private int sortMode;
     
	 private String name;
	 
	 abstract double getPerimeter();
	 
     { id = nextId++; }
     
     
     public String getTime() 
     {
	DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
	Date date = new Date();
        return dateFormat.format(date);
     }
    
     public int getId()
     {
         return id;
     }
     
     public String getName()
     {
         return name;
     }
     
     public void setName(String name0)
     {
         name = name0;
     }

     public void setSortMode(int t)
     {
         sortMode = t;
     }
     
     public void setSortDown(boolean t)
     {
         sortDown = t;
     }
     
 /**
  * Метод преобразование формата вывода числа с плавающей точкой
  *
  * @param a число с плавающей точкой
  * @return строка с преобразованным числом
  */
     public String f( double a)
     {
         DecimalFormat f = new DecimalFormat("0.###");
         return f.format(a);       
     }
     
     public int compareTo(Object o) 
     {
         int res=0;
         Figure p = (Figure) o;
     
         if ( sortMode == 0)	// сортировка по id
         {
             if ( id > p.id ) res = 1;  
             else res = -1;         
         }
         
         if ( sortMode == 1 )	// по имени
         {
             res = name.compareTo(p.name);
         }
         
         if ( sortMode == 2 )	// по периметру
         {
             if ( getPerimeter() > p.getPerimeter() ) res = 1;
             else res = -1;
         }
         
         if (sortDown) res*=(-1);

         return res;
     }
}
