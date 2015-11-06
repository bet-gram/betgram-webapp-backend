package models;


import com.avaje.ebean.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Meili on 5/11/15.
 */
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
	public Manager(Long id, String name, Date dateOfBirth, City placeOfBirth, Club currentClub, Double height) {
		super(id, name, dateOfBirth, placeOfBirth);
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
