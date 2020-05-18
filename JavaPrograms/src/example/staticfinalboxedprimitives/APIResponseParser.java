package example.staticfinalboxedprimitives;

public class APIResponseParser {
    
    /**
	 * Parses the input text and returns a Book instance containing
	 * the parsed data. 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
    public static Book parse(String response) {
       Book book = new Book();
		String endRule = "<";
		
		String startRule = "<title>";		
		String title = parse(response, startRule, endRule); 
	    book.setTitle(title);
	    
	    startRule = "<name>";
	    String name = parse(response, startRule, endRule);
	    book.setAuthor(name);
	    
	    startRule = "<original_publication_year type=\"integer\">";
	    String publicationYear =  parse(response, startRule, endRule);
	    book.setPublicationYear(Integer.parseInt(publicationYear));
	    
	    
	    startRule = "<average_rating>";
	    String averageRating = parse(response, startRule, endRule);
	    book.setAverageRating(Double.parseDouble(averageRating));
	    
	    startRule = "<ratings_count type=\"integer\">";
	    String rating_count = parse(response, startRule, endRule);
	    String rating = rating_count.replaceAll(",", "");
	    book.setRatingsCount(Integer.parseInt(rating));
	    
	    
	    startRule = "<image_url>";
		String imageUrl = parse(response, startRule, endRule); 
	    book.setTitle(imageUrl);
		// Your code
		return book;
    }
    
    // write overloaded parse method with the 3 parameters response, startRule, endRule
    
    private static String parse(String response, String startRule, String endRule){
    	int startInd = response.indexOf(startRule);
    	int endInd = response.indexOf(endRule, startInd+1);
    	String result = response.substring(startInd + startRule.length(), endInd);
        return result;
    }
    
    
    public void APIParsing() {
		String response = "<work>" + 
	                            "<id type=\"integer\">2361393</id>" +
	                            "<books_count type=\"integer\">813</books_count>" +
	                            "<ratings_count type=\"integer\">1,16,315</ratings_count>" + 
	                            "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
	                            "<original_publication_year type=\"integer\">1854</original_publication_year>" +
								"<original_publication_month type=\"integer\" nil=\"true\"/>" +
								"<original_publication_day type=\"integer\" nil=\"true\"/>" +
								"<average_rating>3.79</average_rating>" +
								"<best_book type=\"Book\">" +
									"<id type=\"integer\">16902</id>" +
									"<title>Walden</title>" + 
									"<author>" +
										"<id type=\"integer\">10264</id>" + 
										"<name>Henry David Thoreau</name>" + 
									"</author>" +
									"<image_url>" + 
										"http://images.gr-assets.com/books/1465675526m/16902.jpg" +
									"</image_url>" +
									"<small_image_url>" + 
										"http://images.gr-assets.com/books/1465675526s/16902.jpg" +
									"</small_image_url>" +
								"</best_book>" +
							"</work>";
		
		APIResponseParser.parse(response);
	}
}
