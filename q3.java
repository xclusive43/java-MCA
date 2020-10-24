 
 
import java.util.*;
 class Rational{
	  private int num1;
	  private int deno1;
	  private int n1,d1;
	  private int lcm1 ;
	 ///////////////////////////////////////////////////////////////	  
	  Rational(int a,int b){
              if(a%2==0 && b%2==0){
              if(a>b){   this.num1 = a/b; 
			  this.deno1=  b/b; 
                          System.out.print(num1+"/"+deno1+"\n");
		       }
		  else { this.num1 = a/a; 
			  this.deno1=b/a;
                          System.out.print(num1+"/"+deno1+"\n");
		        }
              }
              else{this.num1 =a;//a/b; 
		  this.deno1= b;//b/b; 
                  System.out.print(num1+"/"+deno1+"\n");
              }
	  }
          ///////////////////////////////////////////////////////////////
	  public void lcm(int d1,int d2) {
               int max ;
	       max = (d1>d2)?d1:d2;
		  while(true) {
			  if(max%d1==0&&max%d2==0) {
				  lcm1 = max;
				  break;
			  }
			  ++max;
		  }        
	  }
///////////////////////////////////////////////////////////////	 
          void reduce(int a, int b){
              if(a%2==0 && b%2==0){
              if(a>b){   this.n1 = a/b; 
			  this.d1=  b/b; 
                          System.out.print(n1+"/"+d1+"\n");
		     }
		  else {  this.n1 = a/a; 
			  this.d1=b/a;
                          System.out.print(n1+"/"+d1+"\n");
		  }
              }
              else{  this.n1 =a;//a/b; 
		  this.d1= b;//b/b; 
                  System.out.print(n1+"/"+d1+"\n");
              }
          }
 	 public  void add(Rational o1, Rational o2) 
	   {    if(o1.deno1==o2.deno1){
                         n1 = o1.num1+o2.num1;
                         d1=o1.deno1;
                         System.out.print("Addition:");
                         reduce(n1,d1);
                }
                else{ lcm(o1.deno1,o2.deno1);
		  n1 = o1.num1*o2.deno1 + o2.num1*o1.deno1;
		  d1 = lcm1; 
                  System.out.print("Addition:");
                  reduce(n1,d1);
                }  
           }
	 public  void sub(Rational o1, Rational o2) 
	   {    if(o1.deno1==o2.deno1){ 
                         n1 = (o1.num1)-(o2.num1);
                         d1=o1.deno1;
                         System.out.print("Substraction: ");
                         if(n1==0){
                          System.out.print("0\n");
                         }
                         else{
                          reduce(n1,d1);
                         }
           }
           else{  lcm(o1.deno1,o2.deno1);
		  n1 = (o1.num1*o2.deno1) - (o2.num1*o1.deno1);
		  d1 = lcm1;
		  System.out.print("Substraction:");
                  reduce(n1,d1);
           }
	  }
	 public void mul(Rational o1, Rational o2) { 
                  n1 = o1.num1 * o2.num1;
		  d1 =  o1.deno1*o2.deno1; 
		  System.out.print("Multiplication:");
                  reduce(n1,d1);
	 }
         public void mulscalar(Rational o1, Rational o2,int scal1){
             
             if(scal1==0){
              System.out.print("Scalar value after multiply by Rational is: 0\n");
             }
             else {
                     n1=o1.num1*scal1;
                     d1 = o1.deno1*scal1;
                     System.out.println("Scalar value "+scal1+" after multiply by first Rational Number is: "+n1+"/"+d1 );
                     
                     
                     n1=o2.num1*scal1;
                     d1 = o2.deno1*scal1;
                     System.out.println("Scalar value "+scal1+" after multiply by Second Rational Number is: "+n1+"/"+d1);
                      
               }
         
         }
	 public void div(Rational o1, Rational o2) {
		  
		  n1 = o1.num1*o2.deno1;
		  d1 =o1.deno1*o2.num1;
		  System.out.print("Dividion:");
                  reduce(n1,d1);
	 }
/////////////////////////////////////////////////////////////  
	  
 }
public class Tester {
    private static Scanner in;
     public static void main(String[] args) {
         in = new Scanner(System.in);
		 int a11,b11,a12,b12,scal1;
		 System.out.println("enter the Numirator for first Rational number:");
		 a11 = in.nextInt();
		 System.out.println("and  Denominator:");
		 b11 = in.nextInt();
		 
		 System.out.println("enter the Numirator for sencond Rational number:");
		 a12 = in.nextInt();
		 System.out.println("and  Denominator:");
		 b12 = in.nextInt();
		 
                 
		  System.out.println("The Rationals Numbers are : \n");
	  	  Rational b1 = new Rational(a11,b11);
	  	  Rational b2 = new Rational(a12,b12);
	          System.out.println("-----------------------------\n");
                  
	  	  System.out.println("Enter a Scalar Value:");
		  scal1 = in.nextInt();
                  
                  
                 b2.mulscalar(b1, b2, scal1);
	  	 b1.add(b1, b2); 
	         b2.sub(b1, b2);  
	  	 b1.mul(b1, b2); 
                 b1.div(b1, b2);
         }
    
}
