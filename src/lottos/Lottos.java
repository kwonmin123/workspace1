package lottos;

import java.util.HashSet;
import java.util.Set;

public class Lottos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	        int zerocount =0;
	        for(int a : lottos) {
	        	if(a==0) {zerocount++;}
	        }
	        
	    	int[] answer = new int[2];
	        Set<Integer> wins =new HashSet<Integer>();
	        for(int a :win_nums) {
	        	wins.add(a);
	        }
	        Set<Integer> mine =new HashSet<Integer>();
	        for(int a :lottos) {
	        	mine.add(a);
	        }
	        int origin =mine.size();
	        mine.removeAll(wins);
	        int oriremove=mine.size();
	        answer[1]=7-(origin-oriremove);
	        answer[0]=7-(origin-oriremove+zerocount);
	        if(origin-oriremove==0) {answer[1]=6;}
	        if(origin-oriremove+zerocount==0) {answer[0]=6;}
	        
	        //	       if(origin-oriremove+zerocount==6) {answer[0]=1;} 
	        
	        
	        return answer;
	    }
	}
}
