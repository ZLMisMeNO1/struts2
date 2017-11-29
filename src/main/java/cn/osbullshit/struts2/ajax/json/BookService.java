/** 
 * Project Name:struts2 
 * File Name:BookService.java 
 * Package Name:cn.osbullshit.struts2.ajax.json 
 * Date:2017年11月21日上午11:33:24 
 * 
 */  
  
package cn.osbullshit.struts2.ajax.json;  

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
 * ClassName:BookService 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月21日 上午11:33:24 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class BookService {

	private static Map<String,List<Book>> bookDb;
	
	static {
		bookDb = new HashMap<String,List<Book>>();
		
		List<Book> list1 = new ArrayList<Book>();
		list1.add(new Book(1,"java","zhang",89.3));
		list1.add(new Book(2,"php","bao",55.65));
		list1.add(new Book(3,"c#","qi",39.3));
		bookDb.put("计算机类", list1);
		
		List<Book> list2 = new ArrayList<Book>();
		list2.add(new Book(1,"水浒传","zhang",89.3));
		list2.add(new Book(2,"西游记","bao",55.65));
		list2.add(new Book(3,"钢铁","qi",39.3));
		bookDb.put("小说类", list2);
	}
	public Book getBook() {
		Book b = new Book(99,"struts2","zhangbaoqi",100.3);
		return b;
	}
	public List<String> listCates() {
		List<String> list = new ArrayList<String>();
		
		for(String key : bookDb.keySet()) {
			list.add(key);
		}
		
		return list;
	}
	public List<Book> listByCate(String cate) {
		return bookDb.get(cate);
	}
	public Map<String,List<Book>> getBooks() {
		return bookDb;
	}
	
	public List<Book> getAllBooks() {
		
		return bookDb.get("计算机类");
	}
}
 