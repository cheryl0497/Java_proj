package Shape;

class Figure
{
	void calculateVolume(float a)
    {
        System.out.println("Volume of cube: "+a*a*a);
    }
    void calculateVolume(float a, float b)
    {
        System.out.println("Volume of the Cylinder: "+2*3.14*a*b);
    }
    void calculateVolume(double a)
    {
        
        System.out.println("Volume of the Sphere: "+3.14*a*a);
    }
}

