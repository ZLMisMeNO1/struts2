/** 
 * Project Name:struts2 
 * File Name:BookService.java 
 * Package Name:cn.osbullshit.struts2.book.service 
 * Date:2017年11月3日下午2:30:09 
 * 
 */  
  
package cn.osbullshit.struts2.book.service;  

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cn.osbullshit.struts2.book.domain.Book;

/** 
 * ClassName:BookService 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月3日 下午2:30:09 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class BookService {

	private static List<Book> books = new ArrayList<Book>();
	
	static {
		for(int i=0;i<10;i++) {
			books.add(new Book(new Random().nextInt(9999999),"name"+i,"author"+i));
		}
	}
	
	public int add(Book book) {
		boolean f = books.add(book);
		if(f) {
			return 1;
		}
		return -1;
	}
	
	public List<Book> listBooks() {
		return books;
	}
}
 