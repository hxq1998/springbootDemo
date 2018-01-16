package org.hanxq.hock.abst;

public abstract class HockAbstr {
	
	
	public abstract String fileName();
	
	public String createFile(){
		return fileName();
	}

}
