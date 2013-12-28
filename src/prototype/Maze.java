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
 * Created on Dec 15, 2003
 *
 */
package prototype;

public class Maze implements Cloneable {

	String m_name = "";
	String m_structure = "";  
	String m_type = "(Normal)";

	public Maze(String p_name) {
		m_name = p_name;
	}

	public void setName(String p_name) {
		m_name = p_name; 	
	}

	public String getName() {
		return m_name; 	
	}

	public void setType(String p_type) {
		m_type = p_type; 	
	}

	public String getType() {
		return m_type; 	
	}
	
	public void addRoom(Room p_room) {
		m_structure += "Room " + p_room.getType() + " " + p_room.getName() + "\n";		
	}

	public void viewMaze() {
		m_structure = "Maze " + m_type + " " + m_name + "\n" + m_structure;		
		System.out.println(m_structure);		
	}

	public Object clone() {
		try {
			return super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println(e.toString());
		}
		return null;
	}

}
