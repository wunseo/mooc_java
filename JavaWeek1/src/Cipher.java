
public class Cipher
{
	public static char[] rot13(char[] chars)
	{
		int i;
		int result = 0;
		int chars_len = chars.length;
		char[] result_chs = new char[chars_len];
		
		for( i=0; i<chars_len; i++ )
		{
			if( chars[i]>=65 && chars[i]<=90 ) 			// A(65) to Z(90)
			{
				if(chars[i]+13 > 90)
					result = (int)chars[i]+13-26;
				else
					result = (int)chars[i]+13;
			}
			else if( chars[i]>=97 && chars[i]<=122 )		//a(97) to z(122)
			{
				if(chars[i]+13 > 122)
					result = (int)chars[i]+13-26;
				else
					result = (int)chars[i]+13;
			}
			else
				result = chars[i];
	
			result_chs[i] = (char)result;
		}
		return result_chs;
	}
	
	public static char[] rot_num(char[] chars, int rot)
	{
		int i;
		int result = 0;
		int chars_len = chars.length;
		char[] result_chs = new char[chars_len];
		
		for( i=0; i<chars_len; i++ )
		{
			if( chars[i]>=65 && chars[i]<=90 ) 			// A(65) to Z(90)
			{
				if(chars[i]+rot > 90)
					result = (int)chars[i]+rot-26;
				else
					result = (int)chars[i]+rot;
			}
			else if( chars[i]>=97 && chars[i]<=122 )		//a(97) to z(122)
			{
				if(chars[i]+rot > 122)
					result = (int)chars[i]+rot-26;
				else
					result = (int)chars[i]+rot;
			}
			else
				result = chars[i];
	
			result_chs[i] = (char)result;
		}
		return result_chs;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = "MOOC Java Online!";
		//String str = "I Love You";
		//String str = "I LOVE YOU";
		char ch[] = str.toCharArray();
		
		System.out.println(ch);
		
		char[] encrypted = rot13(ch);
		System.out.println(encrypted);

		char[] decrypted = rot13(encrypted);
		System.out.println(decrypted);

		if (args.length>1)
		{
			int num = Integer.parseInt(args[0]);
			if( num >=0 && num <=26 )
			{
				System.out.println();
				System.out.println(ch);

				char[] encrypted_nu = rot_num(ch, num);
				System.out.println(encrypted_nu);

				char[] decrypted_nu = rot_num(encrypted_nu, num);
				System.out.println(decrypted_nu);
			}
		}
		
	}

}


