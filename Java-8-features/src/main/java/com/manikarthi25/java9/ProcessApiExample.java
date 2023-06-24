package com.manikarthi25.java9;

public class ProcessApiExample {

	public static void main(String[] args) {
		ProcessHandle currentProcess = ProcessHandle.current(); // Current processhandle
		System.out.println("Process Id: " + currentProcess.pid()); // Process id
		System.out.println("Direct children: " + currentProcess.children()); // Direct children of the process
		System.out.println("Class name: " + currentProcess.getClass()); // Class name
		System.out.println("All processes: " + ProcessHandle.allProcesses()); // All current processes
		System.out.println("Process info: " + currentProcess.info()); // Process info
		System.out.println("Is process alive: " + currentProcess.isAlive());
		System.out.println("Process's parent " + currentProcess.parent()); // Parent of the process
	}

}


/*
Java has improved its process API in Java 9 version that helps to manage and control operating system processes.

In earlier versions, it was complex to manage and control operating system processes by using Java programming.

New methods are added to the java.lang.Process class that are tabled below.
*/

/*
output
-------
Process Id: 11876
Direct children: java.util.stream.ReferencePipeline$2@12bc6874
Class name: class java.lang.ProcessHandleImpl
All processes: java.util.stream.IntPipeline$1@4c75cab9
Process info: [user: Optional[MANI\Mani], cmd: C:\Users\Mani\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.7.v20230425-1502\jre\bin\javaw.exe, startTime: Optional[2023-06-22T17:02:59.762Z], totalTime: Optional[PT0.0625S]]
Is process alive: true
Process's parent Optional[28188]

*/