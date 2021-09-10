package excetionQuiz01;

import javafx.concurrent.WorkerStateEvent;

public class LoginEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			login("블루","12345");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","12346");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public static void login(String id, String password) throws WrongPasswordException,NotExistIDException {
		
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디를 찾을수 없음");
			
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("비밀번호가 틀림");
		}
		
		
	}
}
