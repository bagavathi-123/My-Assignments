package week1day2;

public class Palindrome {

	public static void main(String[] args) {
	  int rem,rev=0,n;
      int num=121;
      n = num;
      while (num > 0)
      {
          rem = num % 10;
          rev = (rev * 10)+rem;
          num = num/10;
      }
      if(n==rev)
    	  System.out.println("palindrome :"+n);
     else
    	  System.out.println("not palindrome :"+n);
    	     
	} 

	}
