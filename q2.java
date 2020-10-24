//Q2.Write a program using parameterized constructor with two parameters id and name. While
//creating the objects obj1 and obj2 passed two arguments so that this constructor gets invoked
//after creation of obj1 and obj2. 

//Author : Ajay Prajapati
public class  paraconstructor{
	
	int id;
	String name;
	paraconstructor(int id, String name){
		this.id =id;
		this.name = name;
		System.out.print("The ID :"+id+"\nName is:"+name+"\n\n");
			
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paraconstructor obj1 = new 	paraconstructor(1,"Rahul");
		paraconstructor obj2 = new 	paraconstructor(2,"Suraj");


	}

}
