package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userDAO {
	public String rejister(userDTO userdto) throws SQLException, ClassNotFoundException{
	//	public static commonDAO commonDAOObject;
		commonDAO CommonDAO= commonDAO.getObject();
		Connection con= null;
		PreparedStatement pstmt=null;
		try {
			con= CommonDAO.getConnection();
		if(con==null){
			return statusConstants.ERROR;
		}
		 pstmt=con.prepareStatement(SQLConstants.REGISTER_SQL);
		 pstmt.setString(1,userdto.getUserid());
		 pstmt.setString(2, userdto.getPassword());
		 int recordEffected= pstmt.executeUpdate();
		 if(recordEffected>=0){
			 return statusConstants.SUCCESS;
		 }
		 else{
			 return statusConstants.FAIL;
		 }
		}
	finally{
		if(pstmt!=null){
			pstmt.close();
}
		if(con!=null){
			con.close();
		}
	}
	
}
}


				
	


		
	

