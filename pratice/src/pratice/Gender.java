package pratice;

public enum Gender {
	Male("��"),FeMale("Ů");
	
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
