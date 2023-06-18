### What is Multithreading
__________________________


1: Process-based Multitasking (Multiprocessing)

. Each process have its own address in memory i.e. each process allocates separate memory area.
. Process is heavyweight.
. Cost of communication between the process is high.
. Switching from one process to another require some time for saving 
and loading registers, memory maps, updating lists etc.


2: Thread-based Multitasking (Multithreading)

. Threads share the same address space.
. Thread is lightweight.
. Cost of communication between the thread is low.



### Ques 2 : Life Cycle of a thread in java
________________________________________

A thread can be in one of the five states. According to sun microSystem, there are
only 4 states in thread life cycle in java new, runnable, non-runnable and terminated.
There is no running state.

But for better understanding the threads, we are explaining it in the 5 states.
The life cycle of the thread in java is controlled by JVM. The java thread
states are as follows:

1. New
2. Runnable
3. Running
4. Non-Runnable (Blocked)
5. Terminated

### 1.  New State

When we create a thread object, the thread is born and said to be in newborn state. 
The thread is not yet scheduled for running. At this state we can do only one of 
the following things with it.

1. Schedule it for running using start() method.
2. Kill it using stop() method.
3. If scheduled, it moves to the runnable state. If we attempt to use any 
other method at this stage, an exception will be thrown.

### 2. Runnable State

The runnable state means that the thread is ready for execution and is waiting for 
the availability of the processor. That is, the thread has joined the queue of the 
threads that are waiting for the execution. If all the threads have equal priority, 
then they are given time slots for execution in round robin fashion i.e. first-come, 
first-serve manner. Thread that relinquishes control joins the queue at the end and 
again waits for its turns. This process of assigning time to threads is known as 
time-slicing. However, if we want a thread to relinquish control to another 
thread to equal priority its turn comes, we can do so by using the yield() method.


### 3. Running

The thread is in running state if the thread scheduler has selected it i.e. 
the processor has given its Time to the thread for its execution. Thread runs 
until it relinquishes control on its own or it is preempted by higher priority thread. 
A running thread may relinquishes its control in one the following situation:

1. It has been suspended using suspend() method. A suspended thread can be 
revived by using resume() method. This approach is useful.when we want to suspend a 
thread for some time due to certain reasons, but do not want to kill it.
2. It has been made to sleep. We can put a thread to sleep for a specified time period 
using the method sleep(time). Where time is in milliseconds. This means that the thread 
is out of the queue during this time period. The thread re-enters the runnable state 
as soon as time period is elapsed.
3. It has been told to wait until some event occurs. This is done using the wait() method. 
The thread can be scheduled to run again using the notify() method.

### 4. Non-Runnable (Blocked)

This is the state when the thread is still alive, but is currently not eligible to run.

### 5. Terminated
A thread is in terminated or dead state when its run() method exits.


Threads are implemented in the form of objects that contain a method run( ). 
The run( ) method is the heart and soul of any thread. It makes up the entire 
body of a thread and is the only method in which the thread's behavior can be implemented.


There are two ways to create a thread:
1. By extending Thread class
2. By implementing Runnable interface.


1. Extending Thread class:
Define a class that extends Thread class and override its run( ) method with the 
code required by the thread.
Thread class provide constructors and methods to create and perform operations on a thread.

#### Commonly used Constructors of Thread class:

1. Thread()
2. Thread(String name)
3. Thread(object name, String name);


#### Commonly used methods of Thread class:

public void run(): is used to perform action for a thread.

public void start(): starts the execution of the thread.JVM calls the run() method on the thread.

public void sleep(long miliSeconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.

public int getPriority(): returns the priority of the thread.

public int setPriority(int priority): changes the priority of the thread.

public String getName(): returns the name of the thread.

public void setName(String name): changes the name of the thread.

public Thread currentThread(): returns the reference of currently executing thread.

public boolean isAlive(): tests if the thread is alive.

public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.

public void suspend(): is used to suspend the thread(depricated).

public void resume(): is used to resume the suspended thread(depricated).

public void stop(): is used to stop the thread(depricated).

public boolean isDaemon(): tests if the thread is a daemon thread.

public void setDaemon(boolean b): marks the thread as daemon or user thread.



#### Ques : when we extends thread class and then use start method it shows multithreading but not when we directly call run method why ?

When you extend the `Thread` class in Java and override its `run` method, you are defining the code that will be executed in a separate thread when you call the `start` method. The `start` method is responsible for creating a new thread of execution and invoking the `run` method in that new thread.

On the other hand, if you directly call the `run` method on the instance of the `Thread` class, it will simply execute the `run` method in the same thread from which it was called. This means that there is no new thread created, and the code will be executed sequentially just like any other method call.

In summary, calling the `start` method creates a new thread and executes the `run` method in that new thread, enabling multithreading. Directly calling the `run` method will execute the code sequentially in the current thread, without any multithreading.