package method;

public class Person2 
{
     	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Person2 Object = new Person2();
				Object.man("Ashish", 1);
				Object.woman("Nivedita", 1,2);
				Object.child("Niv", "Ashi",'a');
				

			}
			
			public String man(String a, int b) {
				String c= a+b;
				return c;
			}
			
			public String woman(String a, int b, int c) {
				String d= a+b+c;
				return d;
			}
			public String child(String a, String b, char c) {
				String d= a+b+c;
				return d;

	}

}
