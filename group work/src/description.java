import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class description {

	public static void main(String[] args) {
	int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a decimal number"));	
	ArrayList<Integer> remainderArray = new ArrayList<Integer>();

	
	
	while (input != 0){
		int result = input % 2;
		remainderArray.add(result);
		
		input = input / 2;
	
	}
	System.out.println(remainderArray);
	Collections.reverse(remainderArray);
	System.out.println(remainderArray);
	}

}