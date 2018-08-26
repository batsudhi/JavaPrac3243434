package CollectionsClasses;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector v = new Vector();
		
		for (int i=0; i<=10; i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v);
		Enumeration e  = v.elements();
		
		while (e.hasMoreElements())
		{
			Integer i = (Integer) e.nextElement();
			if (i%2 ==0)
				System.out.println(i);
		}
		
		
		 	Vector<String> lang = new Vector<String>();
	        Enumeration<String> en = null;
	        lang.add("JAVA");
	        lang.add("JSP");
	        lang.add("SERVLET");
	        lang.add("EJB");
	        lang.add("PHP");
	        lang.add("PERL");
	        en = lang.elements();
	        while(en.hasMoreElements()){
	            System.out.println(en.nextElement());
	        }
		
		
	}

}
