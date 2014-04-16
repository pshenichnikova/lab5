package ru.pshenichnikova.lab5;

/**
 * Класс "Четырёхугольник"
 *
 *  @author Pshenichnikova Valentina
 */

public class Quadrangle extends Figure
{
	private Point A,B,C,D;
	public Quadrangle( Point A, Point B, Point C, Point D)
	{
		this.setName("Четырёхугольник");
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
/**
 * Метод вычисления периметра четырёхугольника
 *
 * @return Периметр четырёхугольника
 */  
    public double getPerimeter()
    {
       return (this.getAB() + this.getBC() + this.getCD() + this.getAD()); 
    }

/**
 * Метод вычисления стороны AB
 *
 */ 
    public double getAB()	// AB
    {
        return A.distance(B);
    }
 /**
 * Метод вычисления стороны BC
 *
 */    
    public double getBC()
    {
        return B.distance(C);
    }
/**
 * Метод вычисления стороны CD
 *
 */ 
    public double getCD()
    {
        return C.distance(D);
    }
/**
 * Метод вычисления стороны AD
 *
 */  
    public double getAD()
    {
        return A.distance(D);
    }
    
    public String toString()
    {
        String str;
        str = this.getTime() + ") " + " ID = " + this.getId() + " - " + this.getName();
        str = str + "\n Периметр = " + f(this.getPerimeter());
        str = str + "\n Стороны: AB = " + f(this.getAB()) + ", BC = " + f(this.getBC()) + ", CD = " + f(this.getCD()) + ", AD = " + f(this.getAD());
        str = str + "\n Координаты:";
        str = str +	 " A(" + A.getX() + ", " + A.getY() + ", " + A.getZ() +")";
        str = str + ", B(" + B.getX() + ", " + B.getY() + ", " + B.getZ() +")";
        str = str + ", C(" + C.getX() + ", " + C.getY() + ", " + C.getZ() +")";
        str = str + ", D(" + D.getX() + ", " + D.getY() + ", " + D.getZ() +")";
        str = str + "\n-----------------";
        return str;
    }

/**
 * Реализация перемещения объекта на заданный вектор
 * 
 */  
    public void move( Point A, Point B) 
    {
		double dx = B.getX() - A.getX();
		double dy = B.getY() - A.getY();
		double dz = B.getZ() - A.getZ();
		
		double x = this.A.getX();
		double y = this.A.getY();
		double z = this.A.getZ();
		this.A.setPoint(dx + x , dy + y, dz + z);
	
		x = this.B.getX();
		y = this.B.getY();
		z = this.B.getZ();
		this.B.setPoint(dx + x, dy + y, dz + z);
		
		x = this.C.getX();
		y = this.C.getY();
		z = this.C.getZ();
		this.C.setPoint(dx + x, dy + y, dz + z);
		
		x = this.D.getX();
		y = this.D.getY();
		z = this.D.getZ();
		this.D.setPoint(dx + x, dy + y, dz + z);
    }

    public void reflect( int k) 
	{
		double x,y,z;
		if( k == 0) // относительно ОХ
		{
			x = this.A.getX();
			y = this.A.getY();
			z = this.A.getZ();
			this.A.setPoint( x , (-1)*y, z);
			
			x = this.B.getX();
			y = this.B.getY();
			z = this.B.getZ();
			this.B.setPoint( x , (-1)*y, z);
			
			x = this.C.getX();
			y = this.C.getY();
			z = this.C.getZ();
			this.C.setPoint( x , (-1)*y, z);
			
			x = this.D.getX();
			y = this.D.getY();
			z = this.D.getZ();
			this.D.setPoint( x , (-1)*y, z);			
		}
		if( k == 1) // относительно ОУ
		{
			x = this.A.getX();
			y = this.A.getY();
			z = this.A.getZ();
			this.A.setPoint( (-1)*x , y, z);
			
			x = this.B.getX();
			y = this.B.getY();
			z = this.B.getZ();
			this.B.setPoint( (-1)*x ,y, z);
			
			x = this.C.getX();
			y = this.C.getY();
			z = this.C.getZ();
			this.C.setPoint( (-1)*x , y, z);
			
			x = this.D.getX();
			y = this.D.getY();
			z = this.D.getZ();
			this.D.setPoint( (-1)*x ,y, z);	
		}
		if( k == 2) // относительно ОZ
		{
			x = this.A.getX();
			y = this.A.getY();
			z = this.A.getZ();
			this.A.setPoint( (-1)*x , (-1)*y, z);
			
			x = this.B.getX();
			y = this.B.getY();
			z = this.B.getZ();
			this.B.setPoint( (-1)*x ,(-1)*y, z);
			
			x = this.C.getX();
			y = this.C.getY();
			z = this.C.getZ();
			this.C.setPoint( (-1)*x , (-1)*y, z);
			
			x = this.D.getX();
			y = this.D.getY();
			z = this.D.getZ();
			this.D.setPoint( (-1)*x ,(-1)*y, z);
		}
	}
}