package models;

import com.avaje.ebean.Model;

/**
 * Created by Meili on 5/11/15.
 */
public class Position extends Model{
	
	/**
	 * name
	 */
	private String name;

	/**
	 * @param name
	 */
	public Position(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
