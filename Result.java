public class Result
{
	public static void main(String args[])
	{
	int n=20;
	if(n>75&&n<100)
	System.out.println(n+"distinction");
	else if(n>60&&n<=75)
	System.out.println(n+"First Class");
	else if(n>45&&n<=60)
	System.out.println(n+"Second Class");
	else if(n>30&&n<=45)
	System.out.println(n+"Pass Class");
	else
	System.out.println(n+"Fail");
	}
}