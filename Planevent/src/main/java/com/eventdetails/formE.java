package com.eventdetails;

public class formE {
	
	private int id;
	private String username;
	private String foodm;
	private String decorationt;
	private String entertainment;
	private String transport;
	private String tmethod;
	private String pcount;
	private String concerns;
	
	public formE(int id,String username, String foodm, String decorationt, String entertainment, String transport, String tmethod,
			String pcount, String concerns) {
		
		this.id = id;
		this.username=username;
		this.foodm = foodm;
		this.decorationt = decorationt;
		this.entertainment = entertainment;
		this.transport = transport;
		this.tmethod = tmethod;
		this.pcount = pcount;
		this.concerns = concerns;
	}

	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}

	public String getFoodm() {
		return foodm;
	}

	public String getDecorationt() {
		return decorationt;
	}

	public String getEntertainment() {
		return entertainment;
	}

	public String getTransport() {
		return transport;
	}

	public String getTmethod() {
		return tmethod;
	}

	public String getPcount() {
		return pcount;
	}

	public String getConcerns() {
		return concerns;
	}

	

}
