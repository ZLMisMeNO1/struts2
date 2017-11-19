package cn.osbullshit.struts2.file;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileService {

	private static  List<FileBean> picts;
	
	static {
		picts = new ArrayList<FileBean>();
	}
	
	public void addPic (String fileName,String newFileName) {
		picts.add(new FileBean(new Random().nextInt(9999),fileName,newFileName));
	}
	
	public List<FileBean> getList() {
		return picts;
	}
	
}
