package main.model.utils;

public enum Notification {

	CHANTER_SELECTED("CHANTER_SELECTED"),
	READING_TONE_SELECTED("READING_TONE_SELECTED");
	
	private String name;
	
	private Notification(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
