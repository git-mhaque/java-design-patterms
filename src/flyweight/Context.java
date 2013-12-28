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

public class Context {
	
	String m_fonts[] = {
		"Arial plain 12",
		"Times Roman plain 12",
		"Times Roman bold 12",
		"Verdana plain 8",
	};
	
	int m_currentIndex;
	
	public Context() {
		m_currentIndex = 0;
	}
	
	public void next() {
		m_currentIndex++;	
	}
	
	public String getFont() {
		int fontIndex = 0;
		
		if(m_currentIndex >= 0 && m_currentIndex <=3) {
			fontIndex = 0;
		} 
		if(m_currentIndex >= 4 && m_currentIndex <=5) {
			fontIndex = 1;
		} 
		if(m_currentIndex >= 6 && m_currentIndex <=10) {
			fontIndex = 2;
		} 
		if(m_currentIndex >= 11 ) {
			fontIndex = 3;
		} 
		return m_fonts[fontIndex];		
	}
	
}
