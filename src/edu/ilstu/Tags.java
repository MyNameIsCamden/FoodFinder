package edu.ilstu;

public class Tags {
	private String type;
	private String description;

	
	public Tags(String type, String description){
		this.type = type;
		this.description = description; 
	}
	
	public Tags(String tagDescription){
		this.type = null;
		this.description = tagDescription; 
	}
	
	public String getType()	
	{
		return this.type;
	}
	
	public String getDesc()	
	{
		return this.description;
	}
	
	
	public void addType(String tagType){
		this.type = tagType;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String displayTag (){
		String str = (this.type) + ": " + (this.description);
		return str;
	}
	
	public void removeTag()
	{
		this.type = null;
		this.description = null;
	}
	
	public boolean equals(Tags inTag) {
		boolean result = false;
	    if (inTag == null) result = false;
	    else 
	    	if (inTag.getType() == this.getType())
	    	result = true;
	    return result;
	}

	
	
	
}
