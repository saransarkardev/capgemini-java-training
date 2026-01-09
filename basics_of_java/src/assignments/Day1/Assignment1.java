package assignments.Day1;


// Capgemini Training Day 1 --> Assignment 1

public class Assignment1 {
	
	public static void main(String[] args) {
		// Type Casting in Java:
		// 1. Implicit casting → Widening (automatic, safe)
		// 2. Explicit casting → Narrowing (manual, may lose data)
		
		//============================================================================
		System.out.println("----------------byte to xyz---------------");
		
		// byte to short --> Implicit Type casting (Widening)
		byte a = 10;		// 1 byte
		short b = a;		// 2 byte
		System.out.println(b);
		
		// byte to int --> Implicit Type casting (Widening)	
		byte a1 = 10;		// 1 byte
		int b1 = a1;		// 4 byte
		System.out.println(b1);
		
		// byte to long --> Implicit Type casting (Widening)
		byte a2 = 10;		// 1 byte
		long b2 = a2;		// 8 byte
		System.out.println(b2);
		
		
		// byte to float --> Implicit Type casting (Widening)
		byte a3 = 10;		// 1 byte
		float b3 = a3;		// 4 byte
		System.out.println(b3);
		
		// byte to double --> Implicit Type casting (Widening)
		byte a4 = 10;		// 1 byte
		double b4 = a4;		// 8 byte
		System.out.println(b4);
		
		// byte to char --> Explicit Type casting (Narrowing)
		byte a5 = 65;		    // 1 byte
		char b5 = (char)a5;		// 2 byte
		System.out.println(b5);
		
		//========================================================================
		System.out.println("--------------Short to xyz---------------");
		
		// short to byte --> Explicit Type casting (Narrowing)
		short a6 = 11;		    // 2 byte
		byte b6 = (byte)a6;		// 1 byte
		System.out.println(b6); 
		
		// short to int --> Implicit Type casting (Widening)
		short a7 = 11;		    // 2 byte
		int b7 = a7;			// 4 byte
		System.out.println(b7); 
		
		// short to long --> Implicit Type casting (Widening)
		short a8 = 11;		    // 2 byte
		long b8 = a8;			// 8 byte
		System.out.println(b8); 
		
		// short to float --> Implicit Type casting (Widening)
		short a9 = 11;		    // 2 byte
		float b9 = a9;			// 4 byte
		System.out.println(b9); 
		
		// short to double --> Implicit Type casting (Widening)
		short a10 = 11;		    	// 2 byte
		double b10 = a10;			// 8 byte
		System.out.println(b10); 
		
		// short to char --> Explicit Type casting (Narrowing)
		short a11 = 65;		    		// 2 byte
		char b11 = (char)a11;			// 2 byte
		System.out.println(b11); 
		
		//========================================================================
		System.out.println("------------int to xyz-------------");
		
		// int to byte --> Explicit Type casting (Narrowing)
		int x = 23;					// 4 byte
		byte y = (byte)x;			// 1 byte
		System.out.println(y);
		
		// int to short --> Explicit Type casting (Narrowing)
		int x1 = 23;				// 4 byte
		short y1 = (short)x1;		// 2 byte
		System.out.println(y1);
		
		// int to long --> Implicit Type casting (Widening)
		int x2 = 23;				// 4 byte
		long y2 = x2;				// 8 byte
		System.out.println(y2);
		
		// int to float --> Implicit Type casting (Widening)
		int x3 = 23;				// 4 byte
		float y3 = x3;				// 4 byte
		System.out.println(y3);
		
		// int to double --> Implicit Type casting (Widening)
		int x4 = 23;				// 4 byte
		double y4 = x4;				// 8 byte
		System.out.println(y4);
		
		// int to char --> Explicit Type casting (Narrowing)
		int x5 = 97;					// 4 byte
		char y5 = (char)x5;				// 2 byte
		System.out.println(y5);
		
		//========================================================================
		System.out.println("------------long to xyz-------------");
		
		// long to byte --> Explicit Type casting (Narrowing)
		long p = 129;				// 8 byte
		byte q = (byte)p;			// 1 byte  
		System.out.println(q);      // --> This behavior is called overflow with wrap-around
		
		// long to short --> Explicit Type casting (Narrowing)
		long p1 = 129;				// 8 byte
		short q1 = (short)p1;		// 2 byte  
		System.out.println(q1);     
		
		// long to int --> Explicit Type casting (Narrowing)
		long p2 = 129;				// 8 byte
		int q2 = (int)p2;				// 4 byte  
		System.out.println(q2);     
		
		
		// long to float --> is a special case in Java’s type conversion rules.
		long p3 = 129;				// 8 byte
		float q3 = p3;				// 4 byte  
		System.out.println(q3);   
		
		// long to double --> Implicit Type casting (Widening)
		long p4 = 129;				// 8 byte
		double q4 = p4;				// 8 byte  
		System.out.println(q4); 
		
		// long to char --> Explicit Type casting (Narrowing)
		long p5 = 65;					// 8 byte
		char q5 = (char)p5;				// 2 byte  
		System.out.println(q5);
		
		//========================================================================
		System.out.println("------------float to xyz-------------");
		
		// float to byte --> Explicit Type casting (Narrowing)
		float m = 129.5f;					// 4 byte
		byte n = (byte)m;					// 1 byte  
		System.out.println(n);				// --> This behavior is called overflow with wrap-around
		
		// float to short --> Explicit Type casting (Narrowing)
		float m1 = 112.5f;					// 4 byte
		short n1 = (short)m1;				// 2 byte  
		System.out.println(n1);
		
		// float to int --> Explicit Type casting (Narrowing)
		float m2 = 112.5f;					// 4 byte
		int n2 = (int)m2;					// 4 byte  
		System.out.println(n2);
		//Java does not allow float to int automatically because the decimal part would be lost, so you must explicitly cast it.
		
		
		// float to long --> Explicit Type casting (Narrowing)
		float m3 = 112.5f;					// 4 byte
		long n3 = (long)m3;					// 8 byte  
		System.out.println(n3);
		//Java does not allow float to long automatically because the decimal part would be lost, so you must explicitly cast it.
		
		// float to double --> Implicit Type casting (Widening)
		float m4 = 112.5f;					// 4 byte
		double n4 = m4;						// 8 byte  
		System.out.println(n4);
		
		
		// float to char --> Explicit Type casting (Narrowing)
		float m5 = 66.5f;					// 4 byte
		char n5 = (char)m5;					// 2 byte  
		System.out.println(n5);
				
		// NOTE: So Java follows this rule: Any floating-point value must first be converted to an integer before it can become a character.
		// Conversion pipeline: float → int → char
		
		//========================================================================
		System.out.println("------------double to xyz-------------");
		
		//	double to byte --> Explicit Type casting (Narrowing)	
		double c = 45.21;					// 8 byte
		byte d = (byte)c;					// 1 byte
		System.out.println(d);	
		
		//	double to short --> Explicit Type casting (Narrowing)	
		double c1 = 45.21;					// 8 byte
		short d1 = (short)c1;				// 2 byte
		System.out.println(d1);	
		
		//	double to int --> Explicit Type casting (Narrowing)	
		double c2 = 45.21;					// 8 byte
		int d2 = (int)c2;					// 4 byte
		System.out.println(d2);	
		
		//	double to float --> Explicit Type casting (Narrowing)	
		double c3 = 45.21;					// 8 byte
		float d3 = (float)c3;				// 4 byte
		System.out.println(d3);
		
		//	double to char --> Explicit Type casting (Narrowing)	
		double c4 = 67.21;					// 8 byte
		char d4 = (char)c4;					// 2 byte
		System.out.println(d4);
		// NOTE: So Java follows this rule: Any floating-point value must first be converted to an integer before it can become a character.
		// Conversion pipeline: double → int → char
		
		
		//========================================================================
		System.out.println("------------char to xyz-------------");
			
		// char to byte --> Explicit Type casting (Narrowing)	
		char e = 'A';						// 2 byte
		byte f = (byte)e;					// 1 byte
		System.out.println(f);
		
		// char to short --> Explicit Type casting (Narrowing)	
		char e1 = 'A';						// 2 byte
		short f1 = (short)e1;						// 2 byte
		System.out.println(f1);
		// Even though char and short are both 2 bytes, char can hold larger positive values than short.
		// Converting char to short can lose data, so Java requires explicit casting.
		
		// char to int --> Implicit Type casting (Widening)
		char e2 = 'a';						// 2 byte
		int f2 = e2;						// 4 byte
		System.out.println(f2);
		
		// char to long --> Implicit Type casting (Widening)
		char e3 = 'z';						// 2 byte
		long f3 = e3;						// 8 byte
		System.out.println(f3);
		
		// char to float --> Implicit Type casting (Widening)
		char e4 = 'A';						// 2 byte
		float f4 = e4;						// 4 byte
		System.out.println(f4);
		
		// char to double --> Implicit Type casting (Widening)
		char e5 = 'B';						// 2 byte
		double f5 = e5;						// 8 byte
		System.out.println(f5);
		
		//===========================================================================
		
		
		
		
		
	}
}
