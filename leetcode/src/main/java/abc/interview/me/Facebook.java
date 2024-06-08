package abc.interview.me;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FacebookVO {	
	
	int id;
	String fname;
	String lname;
	List<Integer> friends;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Integer> getFriends() {
		return friends;
	}
	public void setFriends(List<Integer> friendIds1) {
		this.friends = friendIds1;
	}
	
}

public class Facebook {	
	public static void main(String args[]){	
		
		List<FacebookVO> friendsList = new ArrayList<FacebookVO>();
		
		FacebookVO facebookVO1 = new FacebookVO();		
		facebookVO1.setId(1);
		facebookVO1.setFname("john");
		facebookVO1.setLname("lee");		
		Integer[] ints1 = new Integer[] {2,3};
		List<Integer> friendIds1 = Arrays.asList(ints1);		
		facebookVO1.setFriends(friendIds1);
		friendsList.add(facebookVO1);
		
		FacebookVO facebookVO2 = new FacebookVO();		
		facebookVO2.setId(2);
		facebookVO2.setFname("steve");
		facebookVO2.setLname("waugh");
		Integer[] ints2 =  {1,3};
		List<Integer> friendIds2 = Arrays.asList(ints2);		
		facebookVO2.setFriends(friendIds2);
		friendsList.add(facebookVO2);

		FacebookVO facebookVO3 = new FacebookVO();		
		facebookVO3.setId(3);
		facebookVO3.setFname("shane");
		facebookVO3.setLname("warne");
		Integer[] ints3 = new Integer[] {1,2};
		List<Integer> friendIds3 = Arrays.asList(ints3);		
		facebookVO3.setFriends(friendIds3);
		friendsList.add(facebookVO3);

		for(FacebookVO fblist: friendsList){			
			System.out.println("self id::"+fblist.getId());
			System.out.println("fname::"+fblist.getFname());
			System.out.println("lname::"+fblist.getLname());
			for(int i : fblist.getFriends()){
				System.out.println("frnd ids::"+i);				
				FacebookVO f = new FacebookVO();				
				if(f.getId() == i){
					System.out.println("nested::"+f.getFname());
					System.out.println("nested::"+f.getLname());
				}				
			}
			System.out.println("=============================");
		}
	}

}
