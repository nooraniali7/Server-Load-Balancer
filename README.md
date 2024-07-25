# Server-Load-Balancer
Java Code to mimic server load balancer

# Problem
This java program takes in a server name and how much bigger it is in relation to the other servers passed in by the user.
The program should load balance the jobs across each server by assigning a job to a random server based off of its size.\

For example, if server A is four times bigger than server B then server A should be assigned four times as often. Server A should be assigned about 80% of the time and server B should be assigned about 20% of the time.

Program input: server names and sizes
Program output: random server name based on server sizes

## Sample inputs and outputs
bash% java program A:4 B:1\
A

bash% java program A:4 B:1\
A

bash% java program A:4 B:1\
B

bash% java program A:4 B:1\
A

bash% java program A:4 B:1\
A

