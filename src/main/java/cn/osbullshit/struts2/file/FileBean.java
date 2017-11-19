package cn.osbullshit.struts2.file;

public class FileBean {

	private String fileName;
	
	private String newFileName;
	
	private Integer id;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public FileBean() {
		super();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNewFileName() {
		return newFileName;
	}

	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	public FileBean( Integer id,String fileName, String newFileName) {
		super();
		this.fileName = fileName;
		this.newFileName = newFileName;
		this.id = id;
	}
	
	
}
