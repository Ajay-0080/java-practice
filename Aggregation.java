class Author {
	String authorName;
	int age;
	public Author(String authorName, int age) {
		this.authorName = authorName;
		this.age = age;
	}
}
class Book {
		String bookName;
		float price;
		Author author;
		public Book(String bookName, float price, Author author) {
			this.bookName = bookName;
			this.price = price;
			this.author = author;
		}
				
}
 class Aggregation {

	public static void main(String[] args) {
        Author objOne = new Author("ajay",25);
        Book objTwo= new Book("story",45.5f,objOne);
        System.out.println("author name= "+objOne.authorName );
        System.out.println("author age= "+objOne.age );
        System.out.println("book name= "+objTwo.bookName );
        System.out.println("book price= "+objTwo.price );
        System.out.println("author name= "+objTwo.author.authorName );

	}

}
