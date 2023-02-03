class Sample21
{
public static void triangle()
{
	int b=10;
	int h=5;
	double area=0.5*b*h;
	System.out.println(area);
}
static int a=4;
}
class MainClass
{
	public static void main(String[] args) 
	{
		Sample21.triangle();
		System.out.println(Sample21.a);
	}
}
