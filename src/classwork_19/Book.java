package classwork_19;
public class Book {
	public static void main(String[] args) {
	String title;
	String author;
	int year;
	int pages; 

	Book(String title, String author, int year, int pages) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.pages = pages;
	}
	void info() {
		System.out.println(title + "" + author + "" + year + "" + pages);
	}
}
