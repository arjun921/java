class MultiCatch{
	public static void main(String args[]){
		try{
			int a=args.length;
			System.out.println("a="+a);
			int b=42/a;
			int c[]={1};
			c[42]=99;
		}
		catch(ArithmeticException e){
				System.out.println("Divide by 0:"+c);
		}
		System.out.println
		}
	}
}
