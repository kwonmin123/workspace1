package kakaocode;

public class HumanResource {

	String a;// java,cpp,phython
	String b;//backend, frontend
	String c;//junior ,senior
	String d;//chicken ,pizza
	int score;
	
	//쪼개주지 않는 불친절한 생성자
	public HumanResource(String a, String b, String c, String d,int score ) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.score = score;
		this.d = d;
	}
	//스스로 쪼개주는 친절한 생성자
	public HumanResource(String indiInfo) {
		super();
		
		this.a = indiInfo.split(" ")[0];
		this.b = indiInfo.split(" ")[1];
		this.c = indiInfo.split(" ")[2];
		this.d = indiInfo.split(" ")[3];
		this.score = Integer.parseInt(indiInfo.split(" ")[4]);
	}
	
	
	
}

