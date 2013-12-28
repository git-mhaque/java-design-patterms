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
package state;

public class DrawingController {
	
	Tool m_currentTool; 
	LineTool m_lineTool;
	RectangleTool m_rectTool;
	CircleTool m_circleTool;

	public DrawingController() {
		m_lineTool = new LineTool();
		m_rectTool = new RectangleTool();
		m_circleTool = new CircleTool();		
		m_currentTool = m_lineTool;
		m_currentTool.activate();
	}
	
	public void selectLineTool() {
		m_currentTool = m_lineTool;
		m_currentTool.activate();  
	}

	public void selectRectTool() {
		m_currentTool = m_rectTool;
		m_currentTool.activate();  
	}

	public void selectCircleTool() {
		m_currentTool = m_circleTool;
		m_currentTool.activate();  
	}

}
