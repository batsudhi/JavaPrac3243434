package BasicProg;

class EnumBasic {

			   enum EnumBasicSize{ SMALL, MEDIUM, LARGE }
			   EnumBasicSize size;
		}


		public class EnumBasicTest 
		
		{
		   public static void main(String args[]) 
		   
		   {
			   EnumBasic enum1 = new EnumBasic();
			   enum1.size = EnumBasic.EnumBasicSize.MEDIUM ;
		      System.out.println("Size: " + enum1.size);
		   }
		}