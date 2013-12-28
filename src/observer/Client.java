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
package observer;

public class Client {

	public static void main(String args[]) {
		
		//creationg the subject  
		Player player = new Player();

		//creationg the observers  
		Enemy enemy1 = new Enemy("Enemy 1",player);
		Enemy enemy2 = new Enemy("Enemy 2",player);
		Enemy enemy3 = new Enemy("Enemy 3",player);
	
		//registering the observers  
		player.addObserver(enemy1);
		player.addObserver(enemy2);
		player.addObserver(enemy3);
			
		//altering the subject, all 3 observers got notified  
		player.move("NORTH"); 

		//removing 1 observer  
		player.removeObserver(enemy2);

		//altering the subject, now 2 observers got notified  
		player.move("SOUTH"); 

	}
}
