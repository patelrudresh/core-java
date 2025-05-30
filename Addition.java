package com.java8;

public interface Addition {
	void add(int a ,int b);
}



@FunctionalInterface
interface Mul{
	void mul(int a,int b);
} 
@FunctionalInterface
interface Sub{
	void sub(int a,int b);
} 
@FunctionalInterface
interface Div{
	void div(int a,int b);
} 

@FunctionalInterface
interface AOG<T> {
	void ao(T t1, T t2);
}
@FunctionalInterface
interface AOR<T, R> {
	R ao(T t1, T t2);
}

@FunctionalInterface
interface AO {
	void ao(int a, int b);
}

interface Calculate{
	void cal(int a,int b);
}