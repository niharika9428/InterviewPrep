package com.stack;

public class StackArrImpl<T> {

	protected int top;
	protected int size;
	protected T[]  stack;
	protected int DEFAULT_CAPACITY = 10;
	
	public StackArrImpl(int size) {
		super();
		this.stack = (T[]) new Object[size];
	}
	
	public StackArrImpl() {
		super();
		this.stack = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	public T top() {
		if(size == 0) {
			System.out.println("The Stack is empty");
			return null;
		}
		top = size-1;
		return stack[top];
	}
	
	public boolean push(T element){
		if(null == element) {
			System.out.println("Null values cannot be inserted");
			return false;
	    }
		size++;
		top++;
		stack[size-1] = element;
		return true;
	}
	
	
	public T pop(){
		if(size == 0) {
			System.out.println("Stack is empty");
			return null;
	    }
		size--;
		return stack[top--];
	}
	
	public static void main(String[] args) {
		StackArrImpl s = new StackArrImpl<Integer>();
		System.out.println(s.top());
		System.out.println(s.size);
		System.out.println(s.pop());
		s.push(23);
		s.push(26);
		s.push(30);
		System.out.println(s.top());
		System.out.println("Top is :"+s.top);
		System.out.println(s.size);
		System.out.println(s.pop());
		System.out.println(s.top());
		System.out.println("Top is :"+s.top);
		System.out.println(s.size);
		
	}
	
}
