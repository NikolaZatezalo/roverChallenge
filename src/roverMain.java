import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class roverMain {
	public static void main(String [] args) throws IOException {
		//BufferedReader Object to take in the inputs
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//receives input 	
		String [] splitInput = new String[3];
		System.out.println("input grid size (row & column) on same line seperateed by a space");
		String input = br.readLine();
		splitInput = input.split(" ");
		//initialize arrayList of rover objects
		ArrayList<rover> outputArr = new ArrayList<rover>();
		int [] plateauSize = new int[2];
		//sets the size of plateau
			for (int i =0;i<plateauSize.length;i++) {
			plateauSize[i]=Integer.parseInt(splitInput[i]);
		}
			//take in input to place the rover(s)
			System.out.println("input position of rover and direction seperateed by spaces OR -1 to stop input");
			input = br.readLine();
			splitInput = input.split(" ");
			
			//stops input when -1 is entered
			while (!splitInput[0].equals("-1")) {
			//initialize rover(s)
			rover r = new rover();
			r.setxCoOrd(Integer.parseInt(splitInput[0]));
			r.setyCoOrd(Integer.parseInt(splitInput[1]));
			r.setDirection(splitInput[2].charAt(0));
			//Uses the commands adjust rover's position and direction
			System.out.println("input the rovers commands with or without spaces");
			input = br.readLine();
			r.setComands(input);
			String comm = r.getComands();
			for (int i =0;i<comm.length();i++) {
				if (comm.charAt(i)=='L') {
					r.setDirection(rover.rotateLeft(r.getDirection()));
				}else if (comm.charAt(i)=='R') {
					r.setDirection(rover.rotateRight(r.getDirection()));
				}else if (comm.charAt(i)=='M') {
					rover.move(r);
				}
			}
			outputArr.add(r);
			System.out.println("input position of rover and direction seperateed by spaces OR -1 to stop input");
			input = br.readLine();
			splitInput = input.split(" ");
		}
		System.out.println(outputArr.toString());
		System.out.println("Mission Completed");
	
	}

}
