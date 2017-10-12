package Test;
//package is Thread
public class DaemonTest extends Thread {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//classes are the basics of opps(object oriented programming)
	public void run()
	//public : members which can access as public,public members are visible to all other classes.
	{
		if(Thread.currentThread().isDaemon())
//If thread is equal to daemon thread then it prints daemon thread otherwise user
		{
			System.out.println("Daemon thread:"+Thread.currentThread().getName());
		}
		else
		{
			System.out.println("User Thread:"+Thread.currentThread().getName());
		}
		//system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.

		// if else condtion is like true and false condition
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
			//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		DaemonTest test1=new DaemonTest();
		//creating the new object and printing with set method
		 test1.setName("Thread 1");
		DaemonTest test2=new DaemonTest();
		test2.setName("Thread 2");
		test1.setDaemon(true);//boolean for set method
		test1.start();//starts the thread condition
		test2.start();
		//here we are implementing the thread 1 as daemon  and thread 2 as user thread
	}

}
