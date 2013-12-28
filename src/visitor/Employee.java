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
package visitor;

public abstract class Employee {
	
	String m_name = "";
	double m_salary = 0.00;
	double m_bonus = 0.00;
	
	public Employee(String p_name,double p_salary,double p_bonus) {
		 m_name = p_name;
		 m_salary = p_salary;
		 m_bonus = p_bonus;
	}
	
	public double getSalary() {
		return m_salary;
	}

	public double getBonus() {
		return m_bonus;
	}

	public abstract void accept(EmployeeVisitor p_visitor);
}
