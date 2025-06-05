class AplusBWholeSquare 
{
	public int lhs(int a,int b)
	{
		int l=(a*a)+(b*b);
		return l;
	}
	public int rhs(int a,int b)
	{
		int r=(a+b)*(a+b)-2*a*b;
		return r;
	}
	public static void main(String[] args) 
	{
		AplusBWholeSquare a=new AplusBWholeSquare();
		if(a.lhs(4,5)==a.rhs(4,5))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
