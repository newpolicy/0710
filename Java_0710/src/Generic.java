import java.util.ArrayList;
import java.util.HashMap;

enum GENDER{ MAN, WOMAN }

public class Generic {

	public static void main(String[] args) {
		ArrayList <Integer> ge = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();

		int gender = 1;
		if(gender == 0) {}
		else {}   //이렇게 작성하기 보다는
		
		final int MAN= 0;
		final int WOMAN = 1;
		if (gender == MAN) {}
		else {}
	}

}
