//Q1.Write a program to create a class Student along with two method getData(),printData()
//to get the value through argument and display the data in printData function . Create the
//two objects s1 ,s2 to declare and access the values from class Test.
class Student{
		  String name,course;
		  int id;
		
		  void getdata(int id1, String name1, String course1){
			id= id1;
			name =name1;
			course  = course1;
			
		}
		  void display() {
			System.out.println("The ID is : "+id +"\n Name   : "+name+"\n Course : "+course+"\n");
		}
}
	
public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		     Student s1 = new Student();
	         Student s2 = new Student();
	         s1.getdata(1, "Joe", "MBA");
	         s2.getdata(2, "Rini", "B.com");
	         s1.display();
	         s2.display(); 
		
	}

}



