package kthNum;

import java.util.Arrays;

public class KthNum {


	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	       

	        for(int i=0;i<commands.length;i++) {
	       int [] temp = new int[commands[i][1]-commands[i][0]+1];
	       for(int j=0; j<temp.length;j++) {
	    	   temp[j]=array[commands[i][0]-1+j];
	       }

//	       Arrays.sort(temp);
	       for(int j=0;j<temp.length;j++) {
	    	   for(int k=1 ;j+k<temp.length;k++) {
	    		   temp[j]=Math.min(temp[j], temp[j+k]);
	    		   temp[j+k]=Math.max(temp[j], temp[j+k]);
	    	   
	    	   }
	       }
	       
	       answer[i]=temp[commands[i][2]-1];       	
	        	 }
	        return answer;
	    }
}
