# Server-Load-Balancer
Java Code to mimic a load balancer for servers

# Problem
Create a program that takes in a server name and how much bigger it is in relation to the other servers.
The program should load balance the jobs across the server by assigning a job to a random server based off of its size. For example, if server X is three times bigger than server Y then server X should be assigned three times as often. Server X should then be assigned about 75% of the time and server Y should be assigned about 25% of the time.

Note: The program should output the name of the random server and the input can have any number of servers passed in as arguments.


## Example Input
bash program X:3 Y:1\
X

bash program X:3 Y:1\
X

bash program X:3 Y:1\
Y

bash program X:3 Y:1\
X

