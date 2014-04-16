package ru.pshenichnikova.lab5;

public class Point
{
    private double x, y, z;
 
    public Point(double x, double y, double z)    // конструктор
    { 
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double distance( Point p )  // метод вычисдения расстоянии до какой нибудь точки
    {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double dz = this.z - p.z;
        
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
 
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public double getZ()
    {
        return z;
    }   
    
    public void setX( double x)
    {
        this.x = x;
    }
    
    public void setY( double y)
    {
        this.y = y;
    }
    
    public void setZ( double z)
    {
        this.z = z;
    }
    
    public void setPoint( double x, double y, double z)
    {
    	this.x = x;
    	this.y = y;
    	this.z = z;
    }
    
}
