/** 
 * Project Name:struts2 
 * File Name:Book.java 
 * Package Name:cn.osbullshit.struts2.book.domain 
 * Date:2017年11月3日下午2:28:32 
 * 
 */  
  
package cn.osbullshit.struts2.book.domain;  
/** 
 * ClassName:Book 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月3日 下午2:28:32 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Book {

	public Book(Integer id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public Book() {
		super();
	}

	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String name;
	
	private String author;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
 