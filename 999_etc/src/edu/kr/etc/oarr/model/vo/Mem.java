package edu.kr.etc.oarr.model.vo;

public class Mem {
	
	private String memId;
	private String memPw;
	private int memAge;
	private String memName;
	private String region;
	
	public Mem() {
		
	}
	
	public Mem(String memId, String memPw, int memAge, String memName, String region) {
		this.memId = memId;
		this.memPw = memPw;
		this.memAge = memAge;
		this.memName = memName;
		this.region = region;
		
	}
	

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public int getMemAge() {
		return memAge;
	}

	public void setMemAge(int memAge) {
		this.memAge = memAge;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	
	
	
	
}
