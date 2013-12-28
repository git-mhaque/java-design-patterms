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
package iterator;

public class Client {

	public static void main(String[] args) {
		List list = new List();
		list.addItem("Duke");
		list.addItem("Tom");
		list.addItem("Jerry");
		list.addItem("Micky");

		Iterator iter = list.createIterator();
		for (iter.first(); !iter.isDone(); iter.next()) {
			System.out.println((String)iter.currentItem());		
		}

		System.out.println("\nNow in reverse order\n");
		
		Iterator revIter = list.createReverseListIterator();
		for (revIter.first(); !revIter.isDone(); revIter.next()) {
			System.out.println((String)revIter.currentItem());		
		}
		 
	}
}
