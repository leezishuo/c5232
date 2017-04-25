package pratice;

public enum Gender {
	Male("ÄÐ"),FeMale("Å®");
	
	Gender(){}
	
	Gender(String str){
		this.str = str;
	}
	
	private String str;

	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	
}
