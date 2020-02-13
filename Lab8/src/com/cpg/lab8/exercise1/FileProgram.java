package com.cpg.lab8.exercise1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram {
	
	
	public static void main(String args[])
			{
		
		    Scanner scan=new Scanner(System.in);
		   System.out.println("Enter Source File:");
		   String source=scan.nextLine();
		   System.out.println("Enter Target File:");
		   String target=scan.nextLine();
		   File sourcefile=new File(source);
		   File targetfile=new File(target);
		     if(sourcefile.exists() && targetfile.exists())
		     {
		     callAnotherClass(sourcefile,targetfile);
		     }
		     else if(!sourcefile.exists())
		    	 System.out.println("Source file does not exits");
		     else if(!targetfile.exists())
		     {
		    	 try {
					targetfile.createNewFile();
					callAnotherClass(sourcefile,targetfile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     }
		    
		     scan.close();
			}
	
	public static void callAnotherClass(File sourcefile,File targetfile)
	{
		 CopyDataThread cdt=new CopyDataThread(sourcefile,targetfile);
	     cdt.start();
	}

}
