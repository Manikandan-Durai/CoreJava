package assign2;

import java.lang.reflect.Constructor;

public class Object3 
{
	String s="Object created";
	public static void main(String[] args) throws Exception	
	{
		Constructor<Object3>constructor;
		constructor =Object3.class.getConstructor();
		Object3 obj= constructor.newInstance();
		System.out.println(obj.s);
	}
}
