package com.internousdev.template.dao;

import com.internousdev.template.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO login DTO = new LoginDTO();
		String sql = "SELECT * FROM login_user_transaction where login_id=?AND
				login_pass =?";
	}

}
