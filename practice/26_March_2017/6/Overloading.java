class Something{
	int ssum(int a, int b){
		return a+b;
	}
	int ssum(int a,int b, int c){
		return a+b+c;
	}
	}


class Overloading{
	public static void main(String[] args){
		Something obj = new Something();
		System.out.println(obj.ssum(10,20));
		System.out.println(obj.ssum(10,20,30));
	}
}
