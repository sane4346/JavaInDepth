package example.streams;

import java.util.ArrayList;
import java.util.List;

import example.streams.StreamOperations.Book;

public class StreamDemo {
	
	
	public void executeExamples()
	{
		StreamOperations operator = new StreamOperations();	
		List<Book> books = new ArrayList<>();
		
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		
		operator.slice(books);
		operator.match(books);
		operator.find(books);
		System.out.println("Exit from Stream operations");
	}

}
