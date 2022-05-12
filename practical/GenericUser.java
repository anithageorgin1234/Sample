package com.greatlearning.day3.practical;

import java.util.Arrays;

public class GenericUser<T> {
	
private Object[] genericArr;
	
GenericUser(int size)	
{
	genericArr=new Object[size];
}
	
	
private T obj;
public void set(int index,T element)
{
	genericArr[index]=element;
}
void add(T obj) {
	this.obj=obj;
}
T get(int index)
{
	return (T) genericArr[index];
}
@Override
public String toString()
{
	return Arrays.toString(genericArr);
}


}
