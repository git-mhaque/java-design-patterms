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

public class MoveCommand implements Command {

	private MementoIF m_memento;
	private String m_position;
	private Player m_target;
	
	public MoveCommand(Player p_target,String p_position) {
		m_position = p_position;
		m_target = p_target;						
	}

	public void execute() {
		m_memento = m_target.createMemento();
		m_target.setPosition(m_position);
	}
	
	public void unexecute() {
		m_target.setMemento(m_memento);	
	}	
}
