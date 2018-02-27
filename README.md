# Loan Calculator Project

It is a pure java application that is designed, implemented by using Eclipse IDE with Java 1.8 in Windows 7 System. No any other dependencies or third-party libs/tools are needed.

Of course, You can also use other Java IDE or even use command line to edit, compile and run it. 

Project basic package: com.ethoslending.calculator
There are total five java classes in this project as below structure:

com.ethoslending.calculator
                           |__ MainEntry.java 
com.ethoslending.calculator.model
                                 |__ Input.java
                                     Output.java
com.ethoslending.calculator.controller
                                     |__ InputParser.java
                                         Caluclator.java                                           

Loan-Calculator.jar is compiled and packaged by the about five java files in the project root folder.

Loan-Calculator.cmd in the same folder is also provided to help you to run this jar in Windows System without needing any arguments. You only need to modify JAVA_HOME path, based on the folder that your JDK or JRE are installed. The below is the DOS command script: 

D:\Java\jdk1.8.0_121\bin\java -cp Loan-Calculator.jar com.ethoslending.calculator.MainEntry

A Linux/Unix script file, load-calculator.sh is also written to run this jar in Lunix/Unix System. Its function is the same as Load-Calculator.cmd.  

The follow is the input & output dump information of running load-calculator.sh in Amazon Clouds EC2 (Linux System)  

[ec2-user@ip-172-30-2-64 ~]$ ./loan-calculator.sh

-- Loan Payment Calculator By Neil Zhao --

Please enter follow parameters one by one.

Enter Amount: 100000
Enter Interest: 5.5%
Enter Downpayment: 20000
Enter Term: 30
Your inputs are:Input [amount=100000.0, interest=0.055, downpayment=20000.0, term=30]

Just press [Enter] key to do payment calculation


Your payment information are calculated as below:
-------------------------------------------------

{
"monthly payment":454.23
"total interest":83523.23
"total payment":163523.23
}


