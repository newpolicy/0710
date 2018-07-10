package arrays;

//public class Naver implements Comparable{
public class Naver{	
	private String page;
	private int member;
	private String news;
	private String cafe;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public String getCafe() {
		return cafe;
	}
	public void setCafe(String cafe) {
		this.cafe = cafe;
	}
	@Override
	public String toString() {
		return "Naver [page=" + page + ", member=" + member + ", news=" + news + ", cafe=" + cafe + "]";
	}
	/*
	@Override
	public int compareTo(Object o) { //숫자 데이터의 크기를 비교하는 메소드
		Naver other = (Naver)o;
		return this.member - other.member;
		//return this.cafe.compareTo(other.cafe); //문자를 비교하는 메소드.
		/*==if(this.member > other.member)
		{return 1;}
		else if(this.member > other.member)
		{return 0;}
		else 
		{return -1;}*/
	}
	

