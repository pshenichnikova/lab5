package ru.pshenichnikova.lab5;

/**
 * Класс "Шестиугольник"
 *
 *  @author Pshenichnikova Valentina
 */

public class Hexagon extends Figure
{
	private Point A,B,C,D,E,F;
	public Hexagon( Point A, Point B, Point C, Point D, Point E, Point F)
	{
		this.setName("Шестиугольник");
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		this.E = E;
		this.F = F;
	}
	
/**
 * Метод вычисления периметра четырёхугольника
 *
 * @return Периметр четырёхугольника
 */  
    public double getPerimeter()
    {
       return (this.getAB() + this.getBC() + this.getCD() + this.getDE() + this.getAF() + this.getEF()); 
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
 * Метод вычисления стороны DE
 *
 */  
    public double getDE()
    {
        return D.distance(E);
    }
/**
 * Метод вычисления стороны EF
 *
 */  
    public double getEF()
    {
        return E.distance(F);
    }
    
/**
 * Метод вычисления стороны AF
 *
 */  
    public double getAF()
    {
        return A.distance(F);
    }  
    
    public String toString()
    {
        String str;
        str = " ID = " + this.getId() + " - " + this.getName();
        str = str + "\n Периметр = " + f(this.getPerimeter());
        str = str + "\n Стороны: AB = " + f(this.getAB()) + ", BC = " + f(this.getBC()) + ", CD = " + f(this.getCD()) + ", DE = " + f(this.getDE()) + ", EF = " + f(this.getEF()) + ", AF = " + f(this.getAF());
        str = str + "\n Координаты:";
        str = str +	 " A(" + A.getX() + ", " + A.getY() + ", " + A.getZ() +")";
        str = str + ", B(" + B.getX() + ", " + B.getY() + ", " + B.getZ() +")";
        str = str + ", C(" + C.getX() + ", " + C.getY() + ", " + C.getZ() +")";
        str = str + ", D(" + D.getX() + ", " + D.getY() + ", " + D.getZ() +")";
        str = str + ", E(" + E.getX() + ", " + E.getY() + ", " + E.getZ() +")";
        str = str + ", F(" + F.getX() + ", " + F.getY() + ", " + F.getZ() +")";
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
    		
    		x = this.E.getX();
    		y = this.E.getY();
    		z = this.E.getZ();
    		this.E.setPoint(dx + x, dy + y, dz + z);
    		
    		x = this.F.getX();
    		y = this.F.getY();
    		z = this.F.getZ();
    		this.F.setPoint(dx + x, dy + y, dz + z);
        }

	@Override
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
			
			x = this.E.getX();
			y = this.E.getY();
			z = this.E.getZ();
			this.E.setPoint( x , (-1)*y, z);
			
			x = this.F.getX();
			y = this.F.getY();
			z = this.F.getZ();
			this.F.setPoint( x , (-1)*y, z);			
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
			
			x = this.E.getX();
			y = this.E.getY();
			z = this.E.getZ();
			this.E.setPoint( (-1)*x , y, z);
			
			x = this.F.getX();
			y = this.F.getY();
			z = this.F.getZ();
			this.F.setPoint( (-1)*x , y, z);	
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
			
			x = this.E.getX();
			y = this.E.getY();
			z = this.E.getZ();
			this.E.setPoint( (-1)*x , (-1)*y, z);
			
			x = this.F.getX();
			y = this.F.getY();
			z = this.F.getZ();
			this.F.setPoint( (-1)*x , (-1)*y, z);	
		}
	}
}