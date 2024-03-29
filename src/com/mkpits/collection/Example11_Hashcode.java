package com.mkpits.collection;

import java.lang.reflect.Method;

public class Example11_Hashcode {

	// create a Method name getSampleMethod
	public void getSampleMethod() {

	}

	// create main method
	public static void main(String[] args) {

		try {

			// create class object for class name GFG
			Class c = Example11_Hashcode.class;

			// get Method object of method name getSampleMethod
			Method method = c.getDeclaredMethod("getSampleMethod", null);

			// get hashcode of method object using hashCode() method
			int hashCode = method.hashCode();

			// Print hashCode with method name
			System.out.println("hashCode of method " + method.getName() + " is " + hashCode);
		} catch (Exception e) {
			// print if any exception occurs
			e.printStackTrace();
		}
	}
}
