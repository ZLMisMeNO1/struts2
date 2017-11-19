package cn.osbullshit.struts2.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUpload  extends ActionSupport{

	
	private File pict;
	
	private String pictFileName ;
	
	private String pictContentType;
	

	public File getPict() {
		return pict;
	}

	public void setPict(File pict) {
		this.pict = pict;
	}

	public String getPictFileName() {
		return pictFileName;
	}

	public void setPictFileName(String pictFileName) {
		this.pictFileName = pictFileName;
	}

	public String getPictContentType() {
		return pictContentType;
	}

	public void setPictContentType(String pictContentType) {
		this.pictContentType = pictContentType;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		String pathName = ServletActionContext.getServletContext().getRealPath("/upload");
		File path = new File(pathName);
		if(!path.exists()) {
			path.mkdir();
		}
		String newFileName = UUID.randomUUID().toString() 
				+ pictFileName.substring(pictFileName.lastIndexOf("."));
		
		List<String> msgs = new ArrayList<String>();
		msgs.add("上传成功！");
		msgs.add("文件名称为:" + pictFileName);
		msgs.add("文件类型：" + pictContentType);
		msgs.add("文件重命名为：" + newFileName);
		msgs.add("文件路径为：" + (path + File.pathSeparator + newFileName ) );
		setActionMessages(msgs);
		
		FileInputStream fis = new FileInputStream(pict);
		
		FileOutputStream fos = new FileOutputStream(path + "/" + newFileName);
		
		
		byte[] bs = new byte[1024];
		int hasRead = -1;
		while ( (hasRead =  fis.read(bs) ) != -1) {
			fos.write(bs, 0, hasRead);
		}
		fis.close();
		fos.close();
		
		FileService fileService = new FileService();
		fileService.addPic(pictFileName, newFileName);
		
		return super.execute();
	}
	
	private List<FileBean> picts;
	
	
	public List<FileBean> getPicts() {
		return picts;
	}

	public void setPicts(List<FileBean> picts) {
		this.picts = picts;
	}

	public String listPicts() throws Exception{
		FileService fileService = new FileService();
		setPicts(fileService.getList());
		return SUCCESS;
	}
	

}
