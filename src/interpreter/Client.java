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

public class Client {

	public static void main(String[] args) {
		//(true and x) or (y and (not x))
		
		Context context = new Context();
		BooleanExpr expr;

		expr = new OrExpr(
			new AndExpr(new ConstantExpr(true),new VariableExpr("x")),
			new AndExpr(new VariableExpr("y"),new NotExpr(new VariableExpr("x")))
		);  

		context.assign("x",false);
		context.assign("y",true);
		System.out.println(expr.evaluate(context)); //true
		
		context.assign("y",false);
		System.out.println(expr.evaluate(context)); //false
	
	}
}
