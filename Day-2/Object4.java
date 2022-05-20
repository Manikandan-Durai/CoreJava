package assign2;

public class Object4 implements Cloneable
{
	String s="Object created";
	public static void main(String[] args) throws Exception
	{
		Object4 obj = new Object4();
		Object4 obj1 =(Object4) obj.clone();
		System.out.println(obj1.s);
	}
}
