package abc.aa.amzn.qs;

public class IpAddressValidation{

	private static boolean isValidNumber(String ipNumber){
		System.out.println("called isValidNumber");
		char[] c = ipNumber.toCharArray();
		for(int i=0; i< c.length;i++){
			if(!Character.isDigit(c[i])){
				return false;
			}
		}
		int value = Integer.parseInt(ipNumber);
		if(value < 0 || value > 255){
			return false;
		}
		return true;
	}

	private static boolean isValidIp(String ip){
		String[] ipParts = ip.split("\\.");		
		System.out.println(ipParts.length);		
		if(ip.equals("0.0.0.0") || ip.equals("255.255.255.255") || ipParts.length != 4){
			return false;
		}		
		for(int i=0 ; i < ipParts.length;i++){
			System.out.println("part::"+ipParts[i]);
			if(ipParts[i].isEmpty() || !isValidNumber(ipParts[i])){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		//String ip = "255.3.2.1";
		String ip = "255.3..1";
		System.out.println(isValidIp(ip));
	}

}