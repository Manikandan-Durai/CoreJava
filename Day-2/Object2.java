package assign2;

public class Object2 
{
	String s="Object created";
	public static void main(String[] args) throws Exception
	{
		String s1="assign2.Object2";
		Class c=Class.forName(s1);
		Object2 obj=(Object2) c.newInstance();
		System.out.println(obj.s);
	}
}
