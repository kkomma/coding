package aaa.aa.misc;

public class IntToRoman {
	
	public static String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};        
        String ans = "";
        int last_pos = 0;		
        while(num>0){
            for(int i=last_pos;i<values.length;i++){
                if(num>=values[i]){
                    num -= values[i];
                    ans += strs[i];
                    i--;
                    last_pos = i;
                }
            }    
        }
        return ans;
    }
	
	public static void main(String[] args) {
		System.out.println(intToRoman(2342));
	}
}
