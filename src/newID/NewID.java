package newID;

public class NewID {
	class Solution {
	    public String solution(String new_id) {
	    	String answer = "";
	    	answer+=new_id;
	    	answer=answer.toLowerCase();//1단계
	    	answer=answer.replaceAll("[^a-z1-9-_.]", "");//2단계
	    	answer=answer.replaceAll("[.]+", ".");//3단계
	    	if(answer.startsWith(".")) {answer=answer.substring(1);}//4단계
	    	if(answer.endsWith(".")) {answer=answer.substring(0,answer.length()-1);}//4단계
	        if(answer.length()==0) {answer="a";}//5단계
	    	
	    	if(answer.length()>15) answer=answer.substring(0,15);//6단계
	        if(answer.endsWith(".")) {answer=answer.substring(0,answer.length()-1);}

	        // 7단계: 2자 이하일 경우 끝 글자 늘리기
	        while(answer.length()<=2) {answer+=answer.charAt(answer.length()-1);}

	        return answer;
	       
	        
	    }
	}
}

//	        String step1 = new_id.toLowerCase();
//	        String step2 = step1.replaceAll("[^a-z1-9-_.]", "");
//	        String step3 = step2.replaceAll("[.]+", ".");
//	        String step4 = step3.replaceAll("^.|$.", "");
//	       
//	        String step5 = step4.length()==0 ? "a" : step4;
//	        String step6 = step5.length()>=16 ? step5.substring(0, 15) :step5;
//	        if(step6.endsWith(".")) {step6=step6.substring(0, 14);}
//	        String step7=step6;
// 6단계: 문자열 15자로 자르기 및 마지막 마침표 제거