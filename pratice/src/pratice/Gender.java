package pratice;

public enum Gender {
	Male("男"),FeMale("女");
	
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
