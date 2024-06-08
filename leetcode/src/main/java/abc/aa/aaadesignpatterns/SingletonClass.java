package abc.aa.aaadesignpatterns;

public class SingletonClass {

	private static SingletonClass instance;
	private String info = "this is singleton class";
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	private SingletonClass() {		
	}
	
	private static SingletonClass getInstance() {		
		if(instance == null) {
			instance = new SingletonClass();
			return instance;
		}		
		return null;		
	}

	public static void main(String[] args) {
		System.out.println(getInstance().getInfo());
	}

}
