package aaalme.stringproblems;

public class AddBinary {
    
        public String addBinary(String a, String b) {
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;
            StringBuilder result = new StringBuilder();
            
            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += a.charAt(i--) - '0';
                }
                if (j >= 0) {
                    sum += b.charAt(j--) - '0';
                }
                carry = sum / 2;
                result.append(sum % 2);
            }
            
            return result.reverse().toString();
        }
        public static void main(String[] args) {
            AddBinary addBinary = new AddBinary();
            
            // Test case 1
            String a1 = "11";
            String b1 = "1";
            String result1 = addBinary.addBinary(a1, b1);
            System.out.println("Result 1: " + result1); // Expected output: 100
            
            // Test case 2
            String a2 = "1010";
            String b2 = "1011";
            String result2 = addBinary.addBinary(a2, b2);
            System.out.println("Result 2: " + result2); // Expected output: 10101
        }
}
