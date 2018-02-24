import java.util.Scanner;
import java.io.*;

public class Encryption 
{
	String cipher(String msg, int shift)
	{
	    String s = "";
	    int len = msg.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(msg.charAt(x) + shift);
	        if (c > 'z')
	            s += (char)(msg.charAt(x) - (26-shift));
	        else
	            s += (char)(msg.charAt(x) + shift);
	    }
	    return s;
	}
	
	String decipher(String msg, int shift)
	{
	    String s = "";
	    int len = msg.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(msg.charAt(x) - shift);
	        if (c > 'z')
	            s += (char)(msg.charAt(x) + (26-shift));
	        else
	            s += (char)(msg.charAt(x) - shift);
	    }
	    return s;
	}
	static String word;
	static int shift;
	static String encryptedWord;
	static String eord;
	static String yorn;
	
	

	
	
	public static void main(String args[])
	{
		
		

		Scanner input=new Scanner(System.in);
		Encryption test = new Encryption();
		System.out.println("Welcome to Cipher.");
		System.out.println("Press 'e' for encryption. 'd' for decryption");
		eord=input.next();
		if (eord.equalsIgnoreCase ("e"))
		{
			
		System.out.println("Write down the message you want to encrypt.");
		word=input.next();
		System.out.println("Write down the shifter.");
		shift=input.nextInt();
		System.out.println("Your encrypted message is"+ " " +(test.cipher(word,shift)));
		
		
		
		}
		else if (eord.equalsIgnoreCase("d"))
				{
			System.out.println("Write down the message you want to decrypt.");
			encryptedWord=input.next();
			System.out.println("Write down the shifter.");
			shift=input.nextInt();
			System.out.println("Your decrypted message is"+ " " +(test.decipher(encryptedWord,shift)));
			
				}
		else
			System.err.println("Invalid input");
		
		
		//Ýlk testler
		/*System.out.println(test.cipher("ogulcan",3));
		System.out.println(test.decipher("rjxofdq",3));*/
		
		//Programý console dan baþtan baþlatmak.
		/*System.out.println("Do you want to restart?");
		if(yorn.equalsIgnoreCase("y"))
		{
			try {
				   Runtime.getRuntime().exec("java -jar application.jar");
				   System.exit(0);
				} catch (IOException e) {
				}
			
		}
		else
			System.out.println("Goodbye");*/
		
		
			}//End of main.
	
	}//End of the class.
	
	
	
	
	
