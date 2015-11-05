package models;

import com.avaje.ebean.Model;

import java.util.Date;
/**
 * Created by Meili on 5/11/15.
 */
public class Human extends Model{
	
	/**
	 * name
	 */
	private String name;
	
	/**
	 * dateOfBirth
	 */
	private Date dateOfBirth;
	
	/**
	 * placeOfBirth
	 */
	private City placeOfBirth;

	/**
	 * @param name
	 * @param dateOfBirth
	 * @param placeOfBirth
	 */
	public Human(String name, Date dateOfBirth, City placeOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @return the placeOfBirth
	 */
	public City getPlaceOfBirth() {
		return placeOfBirth;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @param placeOfBirth the placeOfBirth to set
	 */
	public void setPlaceOfBirth(City placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	
}
