package aaa.aa.misc;

public class DecimalToHexExample
{
   public static void main(String args[])
   {
    
     int num = 334;
        
     // For storing remainder
     int rem;
        
     // For storing result
     String str2=""; 
 
     // Digits in hexadecimal number system
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(num>0)
     {
       rem=num%16; 
       str2=hex[rem]+str2; 
       num=num/16;
     }
     System.out.println("Method 2: Decimal to hexadecimal: "+str2);
  }
}