/** 
 * Project Name:struts2 
 * File Name:BookAction.java 
 * Package Name:cn.osbullshit.struts2.ajax.json 
 * Date:2017年11月21日上午11:37:13 
 * 
 */  
  
package cn.osbullshit.struts2.ajax.json;  

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:BookAction 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月21日 上午11:37:13 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class BookAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cate;
	
	private List<Book> bookList;
	
	public String getCate() {
		return cate;
	}

	public void setCate(String cate) {
		this.cate = cate;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	private Book book;
	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String execute() throws Exception {
		BookService service = new BookService();
		setBookList(service.listByCate(cate));
		return SUCCESS;
	}
	
	public String getOneBook() {
		BookService service = new BookService();
		setBook(service.getBook());
		return SUCCESS;
	}
	
	public String listAllBooks() {
		BookService service = new BookService();
		setBookList(service.getAllBooks());
		return SUCCESS;
	}
}
 