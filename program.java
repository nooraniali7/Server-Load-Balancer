import java.util.*;

public class program {

	private static final int MAX_NUMBER = 1000;

	public static void main(String[] args) {
		
		//Initializing Variables
		int i = 0;
		int index = 0;
		int total = 0;
		int serverSize = 0;
		String serverName = "";
		int randomVal = 0;
		
		String[] serverArray = null;
		String[] indivServerName = new String[MAX_NUMBER];
		int [] indivServerVal = new int[MAX_NUMBER];
		
		ArrayList<String>probabilityArray = new ArrayList<String>();
		
		Random rand = new Random();
		
		//Get count of arguments and save in variable for total number of servers
		int numServers = args.length;
		
		//Split the arguments so the letters go into the indivServerName array 
		//Split the arguments so the numbers go into the indivServerVal array
		//Then calculate the total of all the individual numbers
		for(i=0;i<numServers;i++) {
			serverArray = args[i].split(":");
			indivServerName[i] = serverArray[0];
			indivServerVal[i] = Integer.parseInt(serverArray[1]);
			total = total + indivServerVal[i];
		}
		
		//Retrieve the name of each server and store in serverName
		//Retrieve the size of each server and store in serverSize
		for(i=0;i<numServers;i++) {
			serverName = indivServerName[i];
			serverSize = indivServerVal[i];
			
			//Add the correct number of letters to the
			//probabilityArray, which is an Array List
			for(index=0; index<serverSize; index++) {
				probabilityArray.add(serverName);
			}
		}
		//Generating random number between 0 and the total
		//number values in the probabilityArray, which will
		//be the index
		randomVal = rand.nextInt(total);
		
		//Retrieving server name using randomVal as the index
		System.out.println(probabilityArray.get(randomVal));
				
		System.out.println();
	}
}


