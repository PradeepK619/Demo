package MainCode;

public class Calculator {
	
	public static double sum(double x, double y) {
		double z=x+y;
		return z;
	}
	public static double diff(double x, double y) {
		double z=x-y;
		return z;
	}
	public static double mul(double x, double y) {
		double z=x*y;
		return z;
	}
	public static double div(double x, double y) {
		double z=x/y;
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=10,b=20,c,d,e,f;
		c=sum(a,b);
		d=diff(a,b);
		e=mul(a,b);
		f=div(a,b);
		System.out.println("Sum:"+c);
		System.out.println("Difference:"+d);
		System.out.println("Multiplication:"+e);
		System.out.println("Division:"+f);
	}

}
