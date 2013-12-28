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
package interpreter;

import java.util.Hashtable; 

public class Context {
	
	Hashtable m_lookupTable;
		
	public Context() {
		m_lookupTable = new Hashtable();
	}
	
	public void assign(String p_key,boolean p_value) { 
		
		if (p_value) {
			m_lookupTable.put(p_key,"true");	
		} else {
			m_lookupTable.put(p_key,"false");	
		}
			
	}
	
	public boolean lookup(String p_key) {
		boolean result = false;
		if (m_lookupTable.containsKey(p_key)) {
			if (m_lookupTable.get(p_key).equals("true")) {
				result = true;									  
			} else {
				result = false;
			}
		}
		return result;
	}
}

