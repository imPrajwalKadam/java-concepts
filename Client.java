import java.io.*;
import java.net.*;

class Client
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Client is running...\n\n");

		

		Socket aths = new Socket("localhost",2101);

		

		PrintStream ps = new PrintStream(aths.getOutputStream());

		BufferedReader br1 = new BufferedReader(new InputStreamReader(aths.getInputStream()));
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		String str1,str2;

		while(!(str1 = br2.readLine()).equals("exit"))
		{
			ps.println(str1);
			str2 = br1.readLine();
			System.out.println(str2);	
		}
		ps.close();
		br1.close();	
		br2.close();
	}
}
