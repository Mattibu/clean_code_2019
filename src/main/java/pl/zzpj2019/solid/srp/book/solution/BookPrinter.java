package pl.zzpj2019.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter {
	
	private Book readingBook;
	private int currentPage = 0;
	
	 public void turnPage() {
	        currentPage ++;
	    }

	    /**
	     * Prints the current page.
	     */
	    public void printCurrentPage() {
	        System.out.println(readingBook.getPageContents(currentPage));
	    }

	   
	    /**
	     * Prints all pages
	     * @return
	     */
	    public String printAllPages() {

	        String allPages = new String();
	        for(Map.Entry<Integer, String> page : readingBook.getAllPagesContents()) {
	            allPages += (page.getKey() + " " + page.getValue());
	        }
	        return  allPages;
	    }

}
