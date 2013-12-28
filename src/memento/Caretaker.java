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
package memento;

import java.util.Vector;

public class Caretaker {
	
	private Vector m_commandList;
	
	public Caretaker() {
		 m_commandList = new Vector();
	}

	public void sendCommand(Command p_command) {
		m_commandList.add(p_command);
		p_command.execute();
	}

	public void undo() {
		int size = m_commandList.size(); 
		if (size > 0 ) {
			Command command = (Command)m_commandList.elementAt(size-1);
			m_commandList.removeElementAt(size-1);
			command.unexecute();			
		}
	}

}
