package kakaocode;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] aa={"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] bb={"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		
		
		System.out.println(bb.length);
		System.out.println(Arrays.toString(counte(aa,bb)));
		System.out.println(Arrays.toString(counte(aa,bb)));
	}
	
	public static int[] counte(String[] info,String[] query) {
		//info 크기만큼의 HumanResource 배열 생성, info 배열의 원소 하나당 인스턴스 하나라고 생각	
		HumanResource[] hhr = new HumanResource[info.length];
		
		// hhr 배열에 info 넣어주기
		for(int i=0;i<info.length;i++) {
			hhr[i]= new HumanResource(info[i]);
			
		}
		
		
		
		//결과는 query의 길이의 int 배열 result배열에 카운트들을 넣을거임
		int[] result= new int[query.length];

		
		//본격적으로 카운트 샘
		 
		for(int i=0;i<query.length;i++) {
			//카운트 초기화 생성
			int count =0;
		
			
			//query에서 and제거후
			query[i]=query[i].replaceAll("and", "");
			
			//temp에 조각내서 집어넣음 (언어 ,직무, 경력, 음식, 점수) 5조각이남
			String[] temp=query[i].split("[ ]+");
			
			//System.out.println(Arrays.toString(temp)); 주석 풀면 잘쪼개지는지 테스트
			
			//아까만들었던 HumanResource인스턴스 배열에서 검사함 (모든 info를 담고있음)
			for(HumanResource h: hhr) {

				if(h.score>=Integer.parseInt(temp[4]) //5번째조각(점수)이 저장된 값보다 높은가
						&&
						
						(temp[0].equals(h.a)||temp[0].equals("-"))&&//첫번째 조각이 h의 값과 같거나 -인가
						(temp[1].equals(h.b)||temp[1].equals("-"))&&//두번째 조각이 h의 값과 같거나 -인가
						(temp[2].equals(h.c)||temp[2].equals("-"))&&//세번째 조각이 h의 값과 같거나 -인가
						(temp[3].equals(h.d)||temp[3].equals("-"))//네번쨰 조각이 h의 값과 같거나 -인가
				)
				{
					count++; //위모든 조건을 통과한다면 카운트 증가
				}
			
			}
		
			result[i]=count;
		
		
		 
		
		}
		
		
		
		return result;
		
	}

}
