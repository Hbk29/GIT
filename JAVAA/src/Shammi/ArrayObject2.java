package Shammi;

public class ArrayObject2 {
	 String a;
	 String b;
	
	public void abc(String a, String b) {
		this.a=a;
		this.b=b;
	}

	public void b() {
		System.out.println("all="+a+" "+b);
	}
	public static void main(String[] args) {
		ArrayObject2 a[]=new ArrayObject2 [3];
		
		a[0]=new ArrayObject2 ();
		
		a[0].abc("sachin","viru");
		
		a[1]=new ArrayObject2();
		
		a[1].abc("rahul","dada");
		
		a[2]=new ArrayObject2();
		
		a[2].abc("yuvraj","dhoni");
		
		a[0].b();
		
		a[1].b();
		
		a[2].b();

	}

}
