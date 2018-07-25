package com.wind.web.dto;

public class BDto {

	int mId;
	String mName;
	String mContent;
	
	public BDto() { }

	public BDto(int mId, String mName, String mContent) {

		this.mId = mId;
		this.mName = mName;
		this.mContent = mContent;
	}

	public int getmId() {
		return mId;
	}

	public String getmName() {
		return mName;
	}

	public String getmContent() {
		return mContent;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}


}