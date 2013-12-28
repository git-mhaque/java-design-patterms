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

public class Player {
	
	String m_name = ""; 
	String m_position = ""; // N S E W 
	
	public Player(String p_name,String p_position) {
		m_name = p_name;
		m_position = p_position;
		showStatus();
	}

	private void showStatus() {
		System.out.println(m_name + " at position " + m_position);
	}

	public void setPosition(String p_position) {
		m_position = p_position;
		showStatus();
	}
	
	public String getPosition() {
		return m_position;		 
	}

	public String getName() {
		return m_name;		 
	}

	public void setMemento(MementoIF p_memento) {
		 setPosition(p_memento.getPosition());
	}

	public MementoIF createMemento() {
		 MementoIF memento = new Memento();
		 memento.setPosition(getPosition());
		 return memento;
	}

}

class Memento implements MementoIF {
	String m_position;

	public void setPosition(String p_position) {
		m_position = p_position;
	}
	
	public String getPosition() {
		return m_position;		 
	}
}

