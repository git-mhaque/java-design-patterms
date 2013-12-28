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
package chainofresponsibility;

public class Label implements HelpHandler {
	
	HelpHandler m_successor;
	boolean m_hasHelp; 
	
	public Label(HelpHandler p_successor,boolean p_hasHelp) {
		m_successor = p_successor;
		m_hasHelp = p_hasHelp;
	}

	public void handleHelp() {
		if (m_hasHelp) {
			System.out.println("Label Help");
		} else if (m_successor != null) {
			m_successor.handleHelp();
		} else {
			System.out.println("No Help at all");
		}
	}
}
