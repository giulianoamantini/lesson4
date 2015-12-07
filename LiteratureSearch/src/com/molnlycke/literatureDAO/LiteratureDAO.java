package com.molnlycke.literatureDAO;
import java.util.List;

public interface LiteratureDAO {
	public List<Literature> searchKeywords();
	
	public List<Literature> searchCategory(String category);
	
	public List<Literature> getAllLiterature();
}
