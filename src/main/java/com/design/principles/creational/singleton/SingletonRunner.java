package com.design.principles.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * The Singleton pattern is used when you need to ensure that a class has only
 * one instance, which is created once and reused throughout the application,
 * rather than creating new instances every time. This pattern restricts the
 * instantiation of the class to a single object and provides a global point of
 * access to that instance.
  Example : Creating Database connection or Object of log class to print the logs
 * 
 */
public class SingletonRunner {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
			breakSingleton(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	/**
	 * There are three common ways to break a Singleton pattern: 1) Reflection  2) Serialization   3) Cloning
	 * I have implemented the Double-Checked Locking method for the Singleton class as the primary approach.
	 * Additionally, I have applied fixes to prevent any of these potential vulnerabilities from breaking the Singleton.
	 * The methods provided here simulate the various ways a Singleton can be broken.
	 * 
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws CloneNotSupportedException
	 */
	static void breakSingleton() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {

//		1st way :
		DoubleCheckLocking singleInstance=DoubleCheckLocking.getInstance();
        Constructor<DoubleCheckLocking> constructor = DoubleCheckLocking.class.getDeclaredConstructor();
        constructor.setAccessible(true);  		
        
        DoubleCheckLocking singleInstance2 = constructor.newInstance();
        
        System.out.println("Using Reflection -> Hash code of first Instance : " + singleInstance.hashCode() + " Hash code of second instance : " + singleInstance2.hashCode() );
		
//        2nd way :
        /**
        Serialize the Singleton Instance: First, serialize the Singleton instance to a file.
        Deserialize the Singleton Instance: When you deserialize the Singleton object from the file, it will create a new instance, breaking the Singleton pattern.
        
        */
        DoubleCheckLocking singleton1 = DoubleCheckLocking.getInstance();
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"))) {
            out.writeObject(singleton1);  // Serialize the Singleton instance
        }

        // Deserialize the Singleton instance
        DoubleCheckLocking singleton2;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"))) {
            singleton2 = (DoubleCheckLocking) in.readObject();  // Deserialize the Singleton instance
        }


        // Verify if both references point to the same instance
        System.out.println("Using Serializable -> Are both instances the same? " + (singleton1 == singleton2)); // Should print false if not using readResolve()
        
        //3rd way :
        /** Using Cloneable Interface , Singleton class can be break.
         * 
         */
        DoubleCheckLocking clonedInstance = (DoubleCheckLocking) singleton1.clone();
        System.out.println("Using Cloneable -> Are the instances the same after cloning? " + (singleton1 == clonedInstance)); // Should print false


	}
}
