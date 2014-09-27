import java.io.*;
import java.util.*;
public class captcha 
{
	String generateCaptcha()
	{
		char stringarray[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
		Random random=new Random();
		StringBuffer captchastrbuff=new StringBuffer();
		String strcapt="";
		int num=0;
		for(int i=0;i<5;i++)
		{
			num=Math.abs(random.nextInt(62));
			strcapt=strcapt+stringarray[num];
		}
		System.out.println(captchastrbuff.toString());
		
		
		return strcapt;
		
	}
	public static void main(String[] args)
	{
		int b=0,count=0;
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		captcha captcha1=new captcha();
		do
		{
		String captchastring=captcha1.generateCaptcha();
		System.out.println(captchastring);
		System.out.println("Enter the captcha shown above : ");
		String inputstring=br.readLine();
		b=captchastring.compareTo(inputstring);
		if(b==0)
		{
			System.out.println("\nUser Authenticated Successfully !");
			break;
		}
		count++;
		if(count>=3)
		{
			System.out.println("\nERROR! Authentication failed ..! ");
			break;
		}
		System.out.println("ERROR ! Wrong CAPTCHA entered .. Try Again ! ("+(3-count)+") remaining ..");
		}while(b!=0);	
		}
		catch(Exception e){}
	}

}

/* OUTPUT 

HoCny
Enter the captcha shown above : 
hoCny
ERROR ! Wrong CAPTCHA entered .. Try Again ! (2) remaining ..

VGmDL
Enter the captcha shown above : 
vgmdl
ERROR ! Wrong CAPTCHA entered .. Try Again ! (1) remaining ..

WU5b3
Enter the captcha shown above : 
WU5b3

User Authenticated Successfully !

*/
