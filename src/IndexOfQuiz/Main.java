package IndexOfQuiz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다.";

		// "공장"이 있는 index들을 출력
		String s = "공장";
		int i = 0; 

		boolean run = true;

		
		i=str.indexOf(s);
		System.out.println(i);
		while (run) {
			i = str.indexOf(s, i + s.length());

			if (i == -1) {
				break;
			}

			System.out.println(i);
		}

	}

}
