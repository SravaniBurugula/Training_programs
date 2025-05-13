package com.ibm.collections;

public class Point<T>{
	private T x;
	private T y;
    

public T getX() {
	return x;
    }

// Setter for x
public void setX(T x) {
	this.x = x;
}

public T getY() {
	return y;
    }

// Setter for y
public void setY(T y) {
	this.y = y;
    }
public String toString() {
	return x+ ", "+y;
			}

}

}


