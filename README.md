# Simple-Employee---creation-display-rise-salary
It is a simple java program, where we create employee details, display employee details, rise salary of all employees and finally exit.<br>
Here we have use do - while loop so that we can repeat creation, display, rise salary again and again as per user requirement.<br>
Inside do - while loop we have opted for switch, we can also use if - else -if, since switch has simplicity over if - else if, we opted switch.<br>
```java
do{
	System.out.println("1.Create\n2.Display\n3.Salary Increment\n4.Exit");
	System.out.println("Enter the number:");
  
  }while(i<4);
  ```
  The input to this program is to be given from the user, so we have user Scanner util class here.
  ```java
  Scanner sc = new Scanner(System.in);
  ```
  We must never forget to close the scanner class at the end of thr code, as it will lead to resource leak.
  ```java
  	sc.close();
 ```
This program has many errors to it, for example,<br>
case - 2 and case -3 can be run without case - 1, i.e., display and rise salary can be done without creation, this must not happen in actual scenario.<br>

![basicEmployee](https://user-images.githubusercontent.com/84003518/124358519-4940d200-dc3e-11eb-8d0b-f8ff85d29f5e.jpg)


Rise salary method has no individual implementation as to whom the salary has to be raised, instead it has a cumulative method.<br>

![finalbasic](https://user-images.githubusercontent.com/84003518/124358485-24e4f580-dc3e-11eb-87a9-439034858fc6.jpg)

At the end, all these will be over comed, so please wait for the update..
