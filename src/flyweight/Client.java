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
 * Created on Dec 18, 2003
 *
 */
package flyweight;

public class Client {

	public static void main(String args[]) {
		char document[] ={
			'a','a','z','k','b','b','a','c','k','d','z','a'
		};
		
		Context context = new Context();
		CharacterFlyweightFactory factory = new CharacterFlyweightFactory();
		
		for(int i = 0; i < document.length; i++ ) {
			Character c = factory.getCharacter(document[i]);
			c.drawCharacter(context);		
		}
		
		System.out.println();
	}
}
