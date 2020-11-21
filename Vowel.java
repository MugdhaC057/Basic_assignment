public class Vowel
{
	public static void main(String args[])
	{
		char ch='B';
		switch(ch)
		{
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'A':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println(ch+"is a vowel");
		break;
		default:
		System.out.println(ch+"is not a vowel");
		}
	}
}