import java.util.Scanner;
class svow{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();//hi is use=> is use str=" "+str;
		str=" "+str;
		for(int i=0;i<l;i++)
		{
			 if(str.charAt(i)==' ')
			 {
				 if(str.charAt(i+1)=='a'||str.charAt(i+1)=='e' ||str.charAt(i+1)=='i' ||str.charAt(i+1)=='o'|| str.charAt(i+1)=='u' )
				 {
					for(int j=i+1;j<l;j++)
					{
						if(str.charAt(j)!=' ')
						System.out.print(str.charAt(j)); 
						else
						break;
					}
					System.out.println(); 	  
				 }
			 }
		}
	} 
}
/*
if(str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')
			{
				for(int j=0;j<l;j++)
					{
						if(str.charAt(j)!=' ')
						System.out.print(str.charAt(j)); 
						else
						break;
					}
					System.out.println(); 
			}
			
*/
			