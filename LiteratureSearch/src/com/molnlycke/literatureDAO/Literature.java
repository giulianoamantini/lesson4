package com.molnlycke.literatureDAO;

public class Literature {
	
	private Integer id;
	private String name;
	private String category;
	private String keywords;
	private String photoname;
	private Integer boxNumber;
	
	public Literature(
			Integer id, 
			String name, 
			String category,
			String keywords,
			String photoname,
			Integer boxNumber){
		this.id = id;
		this.name = name;
		this.category = category;
		this.keywords = keywords;
		this.photoname = photoname;
		this.boxNumber = boxNumber;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public String getKeywords() {
		return keywords;
	}

	public Integer getBoxNumber() {
		return boxNumber;
	}

	public String getPhotoname() {
		return photoname;
	}
}
