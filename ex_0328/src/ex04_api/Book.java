package ex04_api;

public class Book {
	private String BookName;
	private String Writer;
	
	public Book(String BookName, String Writer) {
		this.BookName = BookName;
		this.Writer = Writer;
	}
	@Override
	public String toString() {
		String str = "책 제목 : "+BookName +", 저자 : "+Writer;
		return str;
	}
}
