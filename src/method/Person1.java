package method;

public class Person1 {

     public void man(String name, int age) {
    	 System.out.println("Hey, my name is "+name);
    	 System.out.println("i'm "+age +" Year old");
     }

     public void women(String name, int age, float sellery) {
    	 System.out.println("Hey, my name is "+name);
    	 System.out.println("i'm "+age +" Year old");
    	 System.out.println("and i'm working in this company 4th year and my sellery "+sellery);  
     }

     public void child(String name, int age, String TeacherName) {
    	 System.out.println("Hey, my name is "+name);
    	 System.out.println("i'm "+age +" Year old");
    	 System.out.println("and this is my teacher "+TeacherName);  
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person1 obj=new Person1();
       obj.man("Bharat veer", 23);
	}

}
