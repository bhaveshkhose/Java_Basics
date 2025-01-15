package Data;

public class String_OP{
	
	public int String_To_Integer(String s) {
		
		s=s.trim();
		int sign =1;
		int i=0;
		
		if(s.charAt(0)=='-') {
			
			sign=-1;
			i++;
		}
		
		int sum=0;
		while(i<s.length())
		{
			char currentchar=s.charAt(i);
			if(currentchar < '0' || currentchar > '9')
			{
				break;
			}
			int a = currentchar -'0';
			
			sum = sum*10+a;
			i++;
		}
		
	return (int)(sign * sum);
		
}
	
	public  static void main(String[] args) {
		String s1 = "7";
		String s2 = "12";
		
		int a =Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		int c = a*b;
		System.out.println(c);
		
		String str = Integer.toString(c);
		System.out.println(str);
		
		
		
		
	}

}
