package interPet;

public interface Pet {
	void sit();
	default void roll() {//항상 퍼블릭
		System.out.println("구른다!!");
	}
}
