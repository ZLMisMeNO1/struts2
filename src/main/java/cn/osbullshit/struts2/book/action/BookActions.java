/** 
 * Project Name:struts2 
 * File Name:AddBookAction.java 
 * Package Name:cn.osbullshit.struts2.book.action 
 * Date:2017年11月3日下午2:27:48 
 * 
 */  
  
package cn.osbullshit.struts2.book.action;  

import java.util.List;

import cn.osbullshit.struts2.book.domain.Book;
import cn.osbullshit.struts2.book.service.BookService;

import com.opensymphony.xwork2.Action;

/** 
 * ClassName:AddBookAction 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月3日 下午2:27:48 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class BookActions implements Action{

	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String execute() throws Exception {
		BookService bookService = new BookService();
		int i = bookService.add(book);
		if(i > 0 ) {
			return SUCCESS;
		} 
		return ERROR;
	}
	
	private List<Book> books ;
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String listBooks() {
		BookService bookService = new BookService();
		setBooks(bookService.listBooks());
		return SUCCESS;
	}
	
}
 