
public class Sample03 {

	public static void main(String[] args) {
		int a= 0;
		a++; //a=a+1
		System.out.println(a);
		int b= 0;
		int c = b++;
		System.out.println(c);
		System.out.println(b);
		
		int d = 0;
		++d;//d =1+d
		System.out.println(d);
		
		int e= 0;
		int f= ++e;
		System.out.println(f);
		System.out.println(e);
		
		int h = 10;
		System.out.println(h++);
		System.out.println(h);
		System.out.println(++h);
		System.out.println(h);
		System.out.println(h++);
		
		int h1 =  10;
		h1--;
		System.out.println(h1);
		System.out.println(h1--);
		System.out.println(h1);
		System.out.println(--h1);
		
		int i=10;
		int j = 10;
		System.out.println(i++ + ++i);
		System.out.println(j++ + j++);
		
		int x =10;
		int y =-10;
		
		System.out.println(~x);
		Integer.toBinaryString(x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(~x));
		
		boolean z= true ;
		boolean k =false;
		System.out.println(!z);
		System.out.println(!k);
		
		int m= 10;
		int n=3;
		System.out.println(m%n);
		
		int p= 100;
		int q= 200;
		System.out.println(p ==q) ;
		System.out.println(p !=q);
		System.out.println(p <q);
		boolean s= p==q;
		System.out.println(s);
		
		boolean l  = ((p==q) &&(p!=q))|| ((p==q) ||(p!=q));
		System.out.println(l);
	}

}
