package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Meili on 5/11/15.
 */
@Entity
public class Position extends Model {

	@Id
	private Long Id;

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


	public Position(Long id, String name) {
		Id = id;
		this.name = name;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public static Finder<Long, Position> find = new Finder<Long, Position>(
			Long.class, Position.class
	);


}
