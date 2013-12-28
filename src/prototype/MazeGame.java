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

public class MazeGame {

	public MazeGame() {
	}
	
	public Maze createMaze(MazeFactory p_factory) {
		Maze maze = p_factory.buildMage("Duke\'s Maze");
		
		Room room1 = p_factory.buildRoom("Room 1");  
		Room room2 = p_factory.buildRoom("Room 2");  
		
		maze.addRoom(room1);
		maze.addRoom(room2);
	
		return maze;
	}
}
