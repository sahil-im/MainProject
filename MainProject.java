import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;  
class main
{
	//Creating Object of Scanner Scanner Class 
	Scanner sc =new Scanner(System.in);
	public void Information()
	{
		//Information About Myself
		System.out.println("\nProjectName = MainProject.java");
		System.out.println("Name = Sahil Shafik Mujawar");
		System.out.println("Email = mujawarsahil678@gmail.com\n");
		
	}
	//Creating Method To Check List of Files in perticular Directory
	public void ListDirectory()
	{		
				try
				  {
					System.out.println("Enter the path of file :");
					String Filedir=sc.next();				//Inputing File/Directory Path by user
					File fileser = new File(Filedir);
					String [] files=null;
					files=fileser.list();
					System.out.println("Files are :\n");
					for(int i=0;i<files.length;i++)
					{
						System.out.println(files[i]);			//Display the All files in Perticular Directory
						
					}
					System.out.println("\n");
				  }
				  catch (Exception e)						//Handle Exception
			          {
           		 		System.err.println("Enter Proper Path/Enter the Directory From System :\n");
        		          }
				 
				
	}
	//Creating Method To  Add a File in perticular Directory
	public void AddFile()
	{
			
		try {  
				System.out.println("Enter the path of File/Directory in which you want Add :\n");
				String Cre=sc.next();						//Inputing File/Directory Path by user
				File Dircre=new File(Cre);
				System.out.println("Enter the name file : \n");
				String file=Cre+sc.next();					//Inputing Name of File Want add
				File filecre=new File(file);
				if(filecre.createNewFile())
				{
					System.out.println("File created: " +filecre.getName());  //Display the New Added File
				}
				else 
				{
        				System.out.println("File already exists.");			
				}
    		    }
		    catch (IOException e) 							//Handle Exception
	           {
     				System.out.println("An error occurred.\n");
      				e.printStackTrace();  
    		   } 
		   
	}
	//Creating Method To  Delete a File in perticular Directory
	public void DeleteFile()
	{
		try
		{
			System.out.println("Enter the directory/File :");		//Inputing File/Directory Path by user
			String Dir =sc.next();
			File Dircre=new File(Dir);
			System.out.println("Enter the File Want to delete :");
			String DeleFile=Dir+sc.next();					//Inputing Name of File Want Delete
			File Delete=new File(DeleFile);
			if(Delete.exists())
			{
				     if(Delete.delete())
				     {  
				    	 System.out.println(Delete.getName() + " deleted");    //Display the Deleted File
				     }  
				     else  
				     {  
						System.out.println("failed");  
				      }  
			}
			else
			{
				System.out.println("File does not exist");
			}  
		}
		catch(Exception e)  								//Handle Exception
		{  
			e.printStackTrace();  
		}  
	}
	//Creating Method To  Search a File in perticular Directory
	public void SearchFile()
	{
		try
	   	   {
			System.out.println("Enter the directory/File :\n");
			String Dir =sc.next();							//Inputing File/Directory Path by user
			File Dircre=new File(Dir);
			System.out.println("Enter the File Want to search :\n");
			String SearFile=Dir+sc.next();						//Inputing Name of File Want Search
			File Search=new File(SearFile);
			if(Search.exists())
			{
				System.out.println("File exists in Directory\n");		//Display File Exist
			}
			else
			{	
				System.out.println("File not exists in Directory Create new File");
			}
	
		   }
	            catch(Exception e)  							//Handle Exception
		     {  
			e.printStackTrace();  
		     }  
       }
}
//These Main Class
public class MainProject
{
	public static void main(String[] args) 				//Main  Method
	{	
		int ch,ch1;
		Scanner sc=new Scanner(System.in);
		main pro=new main();					//Creating Object Of main Class
		pro.Information();					//Call Information Method
		//Use do-while loop
		do
		{
			//ENTER THE OPTIONS TO DISPLAY
			System.out.println("1.Check Files/Folder in Directory");
			System.out.println("2.Operation on Files");
			System.out.println("3.Exit");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			System.out.println("\n");
			switch(ch)						//USE SWITCH-CASE
			{
				case 1: 
				pro.ListDirectory();				//Call Information Method ListDirectory()
        			break;
				case 2:
				do						//ENTER THE OPTIONS TO DISPLAY
				{
					System.out.println("1.Add File :");
					System.out.println("2.Delete File :");
					System.out.println("3.Search File :");
					System.out.println("4.Return to Main Context :");
					System.out.println("Enter your choice :\n");
					ch1=sc.nextInt();
					switch(ch1)
					{
						case 1:
						pro.AddFile(); 
						break;
						case 2:
						pro.DeleteFile();
						break;
						case 3:
						pro.SearchFile();
						break;
						default:

					}
				}while(ch1<=3);
				break;
				default:
			}
		}while(ch<=2);
	}
}	
