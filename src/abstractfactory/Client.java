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

package abstractfactory;

public class Client {
	
	public Client() {
		UIFactory fac1 = new NormalUIFactory();
		createUI(fac1);	

		UIFactory fac2 = new MetalUIFactory();
		createUI(fac2);	
	}
	
	public void createUI(UIFactory p_factory) {
		Button b = p_factory.createButton("Open");
		Label l = p_factory.createLabel("Hello World");
	}
	
	/* output 
	   Normal Button Open
	   Normal Label Hello World
       Metal Button Open
       Metal Label Hello World
	 */
	public static void main(String[] args) {
		new Client();
	}

}
