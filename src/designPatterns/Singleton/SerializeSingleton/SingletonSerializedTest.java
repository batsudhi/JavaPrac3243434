package designPatterns.Singleton.SerializeSingleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

	public static void main (String[] args) throws
	FileNotFoundException, IOException, ClassNotFoundException
	{

		SerializedSingleton inst1 = SerializedSingleton.getInstance();

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("//Resources/file.ser"));
		out.writeObject(inst1);
		out.close();
		
		//now deserialize
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("//Resources/file.ser"));
		 SerializedSingleton inst2 = (SerializedSingleton)in.readObject();
		 in.close();
		 
		 System.out.println("hashcode of inst1 ="+ inst1.hashCode());
		 System.out.println("hashcode of inst2 ="+ inst2.hashCode());
		

	}
}