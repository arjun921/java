class Programmer extends Employee{
	float bonus;
	public Programmer(String name,float salary,float bonus){	
		super(name,salary);
		this.salary = salary+bonus;
	}
	public static void main(String[] args){
		Programmer p = new Programmer("Arjun",35000,5000);
		Employee q = new Employee("Karan",35000);
		System.out.println("Showing Details of P");
		p.sayName();
		p.saySal();
		System.out.println("Showing Details of Q");
		q.sayName();
		q.saySal();
	}
}
