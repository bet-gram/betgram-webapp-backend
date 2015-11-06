package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Meili on 5/11/15.
 */
@Entity
public class City extends Model {

	@Id
	private Long Id;

	private String name;

	private Country country;

	private String website;

	/**
	 * @param name
	 * @param country
	 * @param website
	 */
	public City(String name, Country country, String website) {
		this.name = name;
		this.country = country;
		this.website = website;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}


	public static Finder<Long, City> find = new Finder<Long, City>(
			Long.class, City.class
	);

}
