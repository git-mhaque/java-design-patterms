/*******************************************************************************
 * Copyright (c) 2003-2013 Mahfuzul Haque	
 * 
 * This file is part of java-design-patterns which provides example implementations of 23 GoF design patterns.
 *   
 *  
 * java-design-patterns is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *  
 * java-design-patterns is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *  
 * You should have received a copy of the GNU General Public License
 * along with java-design-patterns.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
/*
 * Created on Dec 17, 2003
 *
 */
package templatemethod;

import javax.swing.JOptionPane;

public class Logon extends AbstractLogon {

	public String getUsername() {
		String username = JOptionPane.showInputDialog(null,"Enter Username");
		if(username == null) username = "";
		return username;
	}
	
	public String getPassword() {
		String password = JOptionPane.showInputDialog(null,"Enter Password");
		if(password == null) password = "";
		return password;
	}
	
	public boolean authenticate(String p_username,String p_password) {
		if (p_username.equals("guru") && p_password.equals("123")) {
			return true;
		}
		return false;
	}

}
