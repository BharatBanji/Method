package method;

public class Holeselle {
	
	String Customer(String a) {
		System.out.println("Customer Name : "+a);
		return a;
	}
	
	long ContectNumber(long a) {
		System.out.println("Customer ContectNumber : "+a);
		return a;
	}
	
	
	String ProductName(String a) {
		System.out.println("ProductName :" +a);
		return a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holeselle obj=new Holeselle();
        obj.Customer("Bharat Veer");
        obj.ContectNumber(8650459076L);
        obj.ProductName("iphone 14 pro");
        
	}

}
