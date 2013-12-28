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
 * Created on Dec 16, 2003
 *
 */
package prototype;

public class Client {
	
	public static void main(String[] args) {
	
		Maze maze = null;
		
		//Director
		MazeGame game = new MazeGame();  
		//PrtotypeBuilder
		Maze m = new Maze("M");
		Room r = new Room("R");
		Maze dm = new DarkMaze("DM");
		Room dr = new DarkRoom("DR"); 
		
		//Noraml Maze
		MazeFactory factory1 = new PrototypeMazeFactory(m,r);
		maze = game.createMaze(factory1);
		maze.viewMaze();

		//Dark Maze
		MazeFactory factory2 = new PrototypeMazeFactory(dm,dr);
		maze = game.createMaze(factory2);
		maze.viewMaze();

		//Mixed Maze 1
		MazeFactory factory3 = new PrototypeMazeFactory(m,dr);
		maze = game.createMaze(factory3);
		maze.viewMaze();

		//Mixed Maze 2
		MazeFactory factory4 = new PrototypeMazeFactory(dm,r);
		maze = game.createMaze(factory4);
		maze.viewMaze();
		
		System.out.println(m.getName());
		System.out.println(r.getName());
		System.out.println(dm.getName());
		System.out.println(dr.getName());
		
	}
}
