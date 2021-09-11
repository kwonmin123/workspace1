package kakaocode;

public class HumanResource {

	String a;
	String b;
	String c;
	int score;
	String d;
	public HumanResource(String a, String b, String c, String d,int score ) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.score = score;
		this.d = d;
	}
	
	
	
}
//class Solution {
//    public int[] solution(String[] info, String[] query) {
//        int[] answer = {};
//       HumanResource[] hr=new HumanResource[info.length];
//        for(int i=0;i<info.length;i++ ) {
//        	
//        	hr[i] =new HumanResource(info[i].split(" ")[0], info[i].split(" ")[1], info[i].split(" ")[2], info[i].split(" ")[3], Integer.parseInt(info[i].split(" ")[4]));
//        	
//        }
//        
//        
//        return answer;
//    }
}

