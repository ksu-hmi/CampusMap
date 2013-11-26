package com.example.campusmap.db_object;

public class DB_Building {

	private int Bid;
	private String BuildingName;
	private String BuildingAddress;
	private double Location_lat;
	private double Location_lng;
	private int QueryTime;

	public DB_Building(){}
	
	public DB_Building(String BuildingName, int QueryTime){
		this.BuildingName = BuildingName;
		this.QueryTime = QueryTime;
	}
	
	public DB_Building(int Bid, String BuildingName, String BuildingAddress,
			double Location_lat, double Location_lng,int QueryTime) {

	}
	
	public String getBuildingName(){
		return this.BuildingName;
	}
	
	public int getQueryTime(){
		return this.QueryTime;
	}
	
	public void setQueryTime(int qt){
		this.QueryTime = qt;
	}
	
	public void incrementQueryTime(){
		this.QueryTime++;
	}
	
	@Override
	public String toString(){
		return this.BuildingName + " and " + this.QueryTime + " times";
		
	}
	
}
