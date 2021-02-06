package com.mx.base.model;

public class Data {

	private Long id;
	private String description;
	private String timeStamp;

	public Data() {

	}

	public Data(Long id, String description, String timeStamp) {
		this.id = id;
		this.description = description;
		this.timeStamp = timeStamp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Data [id=" + this.id + ", description=" + this.description + ", timeStamp=" + this.timeStamp + "]";
	}

}
