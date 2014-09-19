import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class bitPositions {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		 File file = new File(args[0]);
		    BufferedReader in = new BufferedReader(new FileReader(file));
		    String line;
		    while ((line = in.readLine()) != null) {
		        String[] lineArray = line.split(",");
		        int theInts[] = new int[3];
		        for(int i = 0; i < 3; i++)
		        	theInts[i] = Integer.parseInt(lineArray[i]);
		        
		        System.out.println((((theInts[0] >> (theInts[1] - 1))&1) == ((theInts[0] >> (theInts[2] - 1))&1)? "true" : "false"));
		    }
		in.close(); 
	}
}
