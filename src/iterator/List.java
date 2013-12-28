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

import java.util.Vector;

public class List extends AbstractList {

	Vector m_listData;
	
	public List() {
		m_listData = new Vector();
	}
	
	public Iterator createIterator() {
		return new ListIterator(this);
	}

	public Iterator createReverseListIterator() {
		return new ReverseListIterator(this);
	}
	
	public void addItem(Object p_item) { 
		m_listData.add(p_item);
	}
	
	public void removeItem(Object p_item) {
		m_listData.remove(p_item);
	}

	public void addItemAt(Object p_item,int p_pos) {
		m_listData.add(p_pos,p_item);
	}
	
	public void removeItemAt(int p_pos) {
		m_listData.remove(p_pos);
	}

	public Object getItemAt(int p_pos) {
		return m_listData.elementAt(p_pos);
	}
	
	public int size() {
		return m_listData.size();
	}	

}
