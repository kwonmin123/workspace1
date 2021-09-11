package kakaocode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanResource[] hr= new HumanResource[100000000];
		
		
		
		counte(hr,"java","backend","junior","pizza",100);
	}
	
	public static int counte(HumanResource[] hr,String a, String b, String c,String d, int score) {
		int result =0;
		//hr은 저장된 class들의 값이고 a,b,c,d,score는 입력받는 조건값이다
		
		for(HumanResource h: hr) {
			if(h.score>=score&&
				(a.equals(h.a)||a.equals("-"))&&
				(b.equals(h.a)||b.equals("-"))&&
				(c.equals(h.a)||c.equals("-"))&&
				(d.equals(h.a)||d.equals("-"))
			){
				result++;
			}
		}
		
		
		
		return result;
		
	}

}
