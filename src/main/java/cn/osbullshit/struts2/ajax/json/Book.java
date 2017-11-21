/** 
 * Project Name:struts2 
 * File Name:Book.java 
 * Package Name:cn.osbullshit.struts2.ajax.json 
 * Date:2017年11月21日上午11:32:18 
 * 
 */  
  
package cn.osbullshit.struts2.ajax.json;  
/** 
 * ClassName:Book 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月21日 上午11:32:18 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Book {

	private Integer id;
	
	private String bookName;
	
	private String author;
	
	private double price;

	public Book(Integer id, String bookName, String author, double price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
 