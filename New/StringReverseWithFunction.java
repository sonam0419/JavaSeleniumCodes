package New;

class StringReverse
{
	public void reverseFunction()
	{
		String str = "my name is sonam";
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i>=0; i--)
		{
			sb.append(str.toLowerCase().charAt(i));
		}
		System.out.println(sb);
	}
}
