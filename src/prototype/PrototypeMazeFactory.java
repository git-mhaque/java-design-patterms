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

public class PrototypeMazeFactory extends MazeFactory {

	Maze m_maze;
	Room m_room;

	public PrototypeMazeFactory(Maze p_maze, Room p_room) {
		m_maze = p_maze;
		m_room = p_room;
	}
	
	public Maze buildMage(String p_name) { 
		Maze maze = (Maze)m_maze.clone();
		maze.setName(p_name);	
		return maze;
	}

	public Room buildRoom(String p_name) { 
		Room room = (Room)m_room.clone();
		room.setName(p_name);	
		return room; 
	}
}
