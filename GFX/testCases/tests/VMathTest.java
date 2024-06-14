package tests;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import VMath.VMath;
import junit.framework.TestCase;

public class VMathTest extends TestCase {
	
	public void testEMA() {
		double[][] vect = new double[][] {{1,2,3,0}, {4,5,6,0}, {7,8,9,0}, {0,1,2,0}};
		double[] result = VMath.EMA(vect, 4);
		for (int hh = 0; hh < result.length; hh++) {
			System.out.print(result[hh] + ", ");
		}
		
		List<double[]> inputList = new ArrayList<double[]>();
		for(int i=0;i<vect.length;i++) {
			inputList.add(vect[i]);
		}
		
		System.out.println("");
		
		result = VMath.EMA(inputList, 4);
		for (int hh = 0; hh < result.length; hh++) {
			System.out.print(result[hh] + ", ");
		}
	}

}
