class Employee{
	float salary;	
	String name;
	public Employee(String name,float salary){
		this.name = name;
		this.salary = salary;
	}
	void sayName(){
		System.out.println("My name is "+this.name);
	}
	void saySal(){
		System.out.println("I earn: "+this.salary);
	}
	
}
