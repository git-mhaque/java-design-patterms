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

public class OrExpr implements BooleanExpr {
	
	BooleanExpr m_op1;
	BooleanExpr m_op2;
	
	public OrExpr(BooleanExpr p_op1,BooleanExpr p_op2) {
		m_op1 = p_op1;
		m_op2 = p_op2;
	}
	
	public boolean evaluate(Context p_context) {
		return m_op1.evaluate(p_context) || m_op2.evaluate(p_context); 
	}	
}
