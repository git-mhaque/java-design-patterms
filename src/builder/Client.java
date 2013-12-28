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
package builder;

public class Client {

	public static void main(String[] args) {
		
		Maze maze = null;
		
		//Director
		MazeGame game = new MazeGame();  
		//Builder
		MazeBuilder stdBuilder = new StandardMazeBuilder();
		MazeBuilder metalBuilder = new MetalMazeBuilder();

		game.createMaze(stdBuilder);
		maze = stdBuilder.getMaze();
		maze.viewMaze();

		game.createMaze(metalBuilder);
		maze = metalBuilder.getMaze();
		maze.viewMaze();
		 	
	}
}
