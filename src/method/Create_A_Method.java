package method;

public class Create_A_Method {
	
	public String Name(String a) {
		System.out.println("customer Name : s"+a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create_A_Method obj=new Create_A_Method(); 
		obj.Name("Bharat veer");
	}

}
