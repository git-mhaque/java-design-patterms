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

import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class MediatorUI extends JFrame implements ActionListener,ItemListener {
	
	Mediator m_mediator = new Mediator();
	OptionButtonA m_optA = new OptionButtonA("Option A",m_mediator);  
	OptionButtonB m_optB = new OptionButtonB("Option B",m_mediator);  
	HelpButton m_helpButton = new HelpButton("Help",m_mediator);  
	ButtonGroup bg = new ButtonGroup();
	
	Container c;
	public MediatorUI() {
		setTitle("Mediator UI");
		setResizable(false);
		c = getContentPane();
		c.setLayout(new FlowLayout());

		m_mediator.registerOptionButtonA(m_optA); 
		m_mediator.registerOptionButtonB(m_optB); 
		m_mediator.registerHelpButton(m_helpButton); 
		
		m_optA.setSelected(true);
		m_mediator.doTaskA();
		bg.add(m_optA);
		bg.add(m_optB);

		c.add(m_optA);
		c.add(m_optB);
		c.add(m_helpButton);

		m_optA.addItemListener(this);
		m_optB.addItemListener(this);
		m_helpButton.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		((Command)e.getSource()).execute(); 
	}

	public void itemStateChanged(ItemEvent e) {
		((Command)e.getSource()).execute(); 
	}

}

 
