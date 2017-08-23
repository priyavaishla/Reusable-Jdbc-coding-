package project;

import java.sql.SQLException;
import java.util.Scanner;

public class userview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("1. login");
System.out.println("2. Rejistration");
System.out.println("enter your choice");
Scanner scanner= new Scanner(System.in);
int choice=scanner.nextInt();
if(choice==2){
	System.out.println("enter userid");
	String userid=scanner.next();
	System.out.println("enter password");
	String password= scanner.next();
	userDTO userdto= new userDTO();
	userdto.setUserid(userid);
	userdto.setPassword(password);
	userDAO dao = new userDAO();
	try {
		String status = dao.rejister(userdto);
		if(status.equals(statusConstants.SUCCESS)){
			System.out.println("user register....");
		}
		else
		{
			System.out.println("Can't Register");
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
	}


