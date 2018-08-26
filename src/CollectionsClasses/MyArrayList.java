package CollectionsClasses;

import java.util.Arrays;
public class MyArrayList {

	public static void main(String[] args) {
		
		private Object[] myStore;
		int actsize = 0;
		
		
		public MyArrayList(){
			myStore = new Object[10];
		}
		
		public Object getindex(int index)
		{
			if (index < actsize)
				return myStore[index];
			else 
			{
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		
		public void add(Object object) {
			if (myStore.length-actsize <= 5)
			{
				increasListSize();
			}
			myStore[actsize++] = object;
		}
		
		public Object remove(int index)
		{
			if (index < actsize)
			{
				Object obj = myStore[index];
				myStore[index] = null;
				int temp = index;
				while (temp<actsize)
				{
					myStore[temp]= myStore[temp +1];
					myStore[temp+1] = null;
					temp++;
				}
				actsize--;
				return obj;
			}
			else new ArrayIndexOutOfBoundsException();
		}
		public int size()
		{
			return actsize;
		}

		 private void increasListSize() {
			 myStore =  Arrays.copyOf(myStore, myStore.length *2);
		}


		MyArrayList mal = new MyArrayList();
		mal.add(new Integer(2));
		mal.add(new Integer(5));
		mal.add(new Integer(1));
		mal.add(new Integer(23));
		mal.add(new Integer(14));

	}



}
