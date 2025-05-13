package com.ibm.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {// IO Intensive
	public static void main(String[] args) {
	 int vCPUs = Runtime.getRuntime().availableProcessors();
	 System.out.println(vCPUs);
	 ExecutorService service = Executors.newCachedThreadPool();
	}
	 }
	 static class Task implements Runnable{
	 int count;
	 Task(int count){
	 this.count=count;
	 }//

	 @Override
	 public void run() {
	 // TODO Auto-generated method stub
		 System.out.println("Task " + count 
				 + " is being executed by " + Thread.currentThread().getName());
	 }
	 
	 }
	 

	}
