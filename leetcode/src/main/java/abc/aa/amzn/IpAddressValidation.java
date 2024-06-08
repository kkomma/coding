package abc.aa.amzn;

public class IpAddressValidation{

	private static boolean isValidNumber(String ipNumber){
		System.out.println("called isValidNumber");
		char[] c = ipNumber.toCharArray();
		for(int i=0; i< c.length;i++){
			if(!Character.isDigit(c[i])){
				System.out.println("retunr3");
				return false;
			}
		}
		int value = Integer.parseInt(ipNumber);
		if(value < 0 || value > 255){
			System.out.println("retunr4");
			return false;
		}
		return true;
	}


	private static boolean isValidIp(String ip){
		String[] ipParts = ip.split("\\.");		
		System.out.println(ipParts.length);		
		if(ip.equals("0.0.0.0") || ip.equals("255.255.255.255") || ipParts.length != 4){
			System.out.println("retunr1");
			return false;
		}		
		for(int i=0 ; i < ipParts.length;i++){
			System.out.println("part::"+ipParts[i]);
			if(ipParts[i].length() > 0 && ipParts[i] != null) {
				boolean isVal = isValidNumber(ipParts[i]);
			    System.out.println("isVal:"+isVal);
				if(!isVal){
					System.out.println("retunr2");
					return false;
				}	
			}else {
				return false;
			}
			
		}
		return true;
	}

	private static boolean isValidIPv6(String ip) {
		String[] ipParts = ip.split(":");
		if (ipParts.length != 8) {
			return false;
		}
		for (String part : ipParts) {
			if (part.length() == 0 || part.length() > 4) {
				return false;
			}
			for (int i = 0; i < part.length(); i++) {
				char c = part.charAt(i);
				if (!Character.isDigit(c) && !isHexCharacter(c)) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isHexCharacter(char c) {
		return (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
	}

	public static void main(String[] args){
		//String ip = "255.3.2.1";
		String ip = "255.255..255";
		System.out.println(isValidIp(ip));

		String ipv4 = "255.3.2.1";
		String ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
		System.out.println(isValidIp(ipv4)); // Output: true
		System.out.println(isValidIPv6(ipv6)); // Output: true

	}

}