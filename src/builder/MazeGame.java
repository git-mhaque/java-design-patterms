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
package builder;

public class MazeGame {

	public MazeGame() {
	}
	
	public void createMaze(MazeBuilder p_builder) {
		p_builder.buildMage("Duke\'s Maze");
		p_builder.buildRoom("Room 1");
		p_builder.buildRoom("Room 2");
		p_builder.buildWall("Wall of Room 1 NSEW");
		p_builder.buildDoor("Room 1 - Door - Room 2");
	}
}
