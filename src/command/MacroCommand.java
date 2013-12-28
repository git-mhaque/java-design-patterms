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
package command;

import java.util.Vector;


public class MacroCommand implements Command {

	Vector m_commandList;
	
	public MacroCommand() {
		m_commandList = new Vector(); 	  
	}
	
	public void addCommand(Command p_command) {
		m_commandList.add(p_command);	
	}

	public void removeCommand(Command p_command) {
		m_commandList.remove(p_command);	
	}
	
	public void execute() {
		for(int i = 0; i < m_commandList.size(); i++ ) {
			((Command)m_commandList.get(i)).execute();
		}
	}
}
