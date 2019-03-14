# JavaStudentProblem
Student Problem using priority list in java as an assignment for UpGrad.
	You’re out of storage space and will soon be unable to send or receive emails until you free up space or purchase additional storage.
1 of 804
(no subject)
Inbox
x

ANSH SAXENA <ansh.saxena.1999@gmail.com>
4:09 PM (1 minute ago)
to me

Hi,
Thanks for showing an interest in working with us. We are excited to take this candidature ahead.
As the next step of the process.Please find below the assignment for which you have to provide the solution.
Revert on the same mail in case of any queries. 
Please share the solution by 06:00 pm tomorrow
Thanks once again!
Looking forward! :)

Question- 
Prog lang: Java
In this problem, there are types of events: ENTER (a student enters the queue) or SERVED.
A unique token is assigned to any student entering the queue. The queue serves the students 
based on the following criteria:
The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending token order.
Given a sequence of  events, print the names of students who are yet to be served(based on above criteria). 
If the queue is empty, print EMPTY.
Input Format
The first line of input contains an integer, , denoting the total number of events. 
Each of the subsequent lines will be of the following two forms:
ENTER name CGPA token - The student to be inserted into the priority queue.
SERVED - The highest priority student in the queue was served.
Constraints
 where 
 where each token i is a unique integer.

Output Format
Print the names (based on the criteria) of the students who are not served at all after executing all  events; if every student in the queue was served, then print EMPTY.
Sample Input
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
Sample Output
Dan
Ashley
Shafaet
Maria
