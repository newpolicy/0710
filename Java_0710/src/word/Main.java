package word;

public class Main {

	public static void main(String[] args) {
		String a = "hi i am java";
		System.out.println(a);
		String c = a.substring(2,7);
		System.out.println(c);
		int size= a.length();
		
		
		
		
		int x = 200;
		int y = 100;
		String str = String.format("x:%d y:%d", x, y);
		System.out.println(str);
		
		int idx = a.toLowerCase().indexOf("java".toLowerCase());
		if(idx >= 0) {System.out.println("java가 존재합니다.");}
		else {System.out.println("java가 없습니다.");}
		
		String [] e = a.split(" ");
		for(int i=0; i<e.length; i++)
		{
			System.out.println(e[i]);
			
		}
	}

}
