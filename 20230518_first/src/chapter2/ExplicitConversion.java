package chapter2;

public class ExplicitConversion {

public static void main(String[] args) {
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		int iNum3 = (int)dNum1 + (int)fNum2; 
		int iNum3_1 = (int)1.2 + (int)0.9f; 
		
		int iNum4 = (int)(dNum1 + fNum2);
		int iNum4_1 = (int)(1.2 + 0.9f);
		System.out.println(iNum3);
		System.out.println(iNum3_1);


		System.out.println(iNum4);
		System.out.println(iNum4_1);
		
		int a1 = 10;
		int b1 = 3;
		int c1 = a1 / b1 ; 
		double d1 = a1 / b1;
		double d2 = (double)(a1/b1); 
		double d3 = (double)a1 / (double)b1;
		double d4 = (double)a1 /b1;
		double d5 = a1 + (double)b1;
		
				
		/*
		int = int;
		int / int (o)
		int / float (x)
		int / int ==>int
		
		*/
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
	}

}
