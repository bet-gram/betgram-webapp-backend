package main;

import java.util.Date;

public class Manager extends Human {
	
	/**
	 * currentClub
	 */
	private Club currentClub;
	
	/**
	 * height
	 */
	private Double height;

	/**
	 * @param name
	 * @param dateOfBirth
	 * @param placeOfBirth
	 * @param currentClub
	 * @param height
	 */
	public Manager(String name, Date dateOfBirth, City placeOfBirth, Club currentClub, Double height) {
		super(name, dateOfBirth, placeOfBirth);
		this.currentClub = currentClub;
		this.height = height;
	}

	/**
	 * @return the currentClub
	 */
	public Club getCurrentClub() {
		return currentClub;
	}

	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @param currentClub the currentClub to set
	 */
	public void setCurrentClub(Club currentClub) {
		this.currentClub = currentClub;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	
	

}
