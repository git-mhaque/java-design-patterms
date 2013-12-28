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

public class ReverseListIterator implements Iterator {

	int m_currentIndex;
	AbstractList m_list;
	
	public ReverseListIterator(AbstractList p_list) {
		m_currentIndex = p_list.size()-1;
		m_list = p_list;	 

	}
	
	public void first() {
		m_currentIndex = m_list.size()-1;
	}
	
	public void next() {
		m_currentIndex--;
	}
	
	public boolean isDone() {
		return m_currentIndex < 0; 
	}
	
	public Object currentItem() {
		return m_list.getItemAt(m_currentIndex);
	}

}
