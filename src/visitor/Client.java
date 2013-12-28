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

public class Client {
	
	/* output
	 Total Salary = 6000.0
	 Total Bonus = 600.0 
	 */
	public static void main(String[] args) {
		Staff st1 = new Staff("Staff 1",1000,100);
		Staff st2 = new Staff("Staff 2",2000,200);
		Executive ex1 = new Executive("Executive 1",3000,300); 		

		EmployeeSalaryVisitor salVisitor = new EmployeeSalaryVisitor();
		st1.accept(salVisitor); 
		st2.accept(salVisitor); 
		ex1.accept(salVisitor); 
		System.out.println("Total Salary = " + salVisitor.getTotalSalary());

		EmployeeBonusVisitor bonVisitor = new EmployeeBonusVisitor();
		st1.accept(bonVisitor); 
		st2.accept(bonVisitor); 
		ex1.accept(bonVisitor); 
		System.out.println("Total Bonus = " + bonVisitor.getTotalBonus());

	}
}
