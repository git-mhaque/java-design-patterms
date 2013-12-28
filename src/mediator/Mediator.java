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
package mediator;

import javax.swing.*;

public class Mediator {
	
	OptionButtonA m_optA;
	OptionButtonB m_optB;
	HelpButton m_helpButton;
	
	public Mediator() {
	}
	
	public void doTaskA() {		
		m_helpButton.setEnabled(false);
	}

	public void doTaskB() {		
		m_helpButton.setEnabled(true);
	}

	public void showHelp() {		
		JOptionPane.showMessageDialog(null,"Help");
	}
	
	public void registerOptionButtonA(OptionButtonA p_optA) {
		m_optA = p_optA;	 
	}

	public void registerOptionButtonB(OptionButtonB p_optB) {
		m_optB = p_optB;	 
	}

	public void registerHelpButton(HelpButton p_helpButton) {
		m_helpButton = p_helpButton;	 
	}

	
}
