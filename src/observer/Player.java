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

import java.util.Vector;

public class Player implements Subject {

	private Vector m_observers; 
	private String m_pos;
	
	public Player() {
		m_observers = new Vector(); 
	}
	
	public void addObserver(Observer observer) {
		m_observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		m_observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(int i = 0; i < m_observers.size(); i++ ) {
			((Observer)m_observers.get(i)).update();
		}
	}

	public void move(String p_pos) {
		m_pos = p_pos;
		notifyObservers();
	}

	public String getStatus() {
		return m_pos;
	}
}
