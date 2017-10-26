
class Final {
	public int a =2;
	public int b =4;
	final void arith()
	{
		int equal;
		equal = a + b;
		System.out.println(equal);
		
	}
	
}
class arit
{
	public static void main(String args[])
	{
		Final math= new Final();
		math.arith();
	}
}
