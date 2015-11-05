package models;

import com.avaje.ebean.Model;
/**
 * Created by Meili on 5/11/15.
 */

public class Country extends Model{
	
	/**
	 * name
	 */
	private String name;
	
	/**
	 * nationalLanguage
	 */
	private String nationalLanguage;
	
	/**
	 * currency
	 */
	private String currency;

	/**
	 * @param name
	 * @param capital
	 * @param nationalLanguage
	 * @param currency
	 */
	public Country(String name, City capital, String nationalLanguage, String currency) {
		this.name = name;
		this.nationalLanguage = nationalLanguage;
		this.currency = currency;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the nationalLanguage
	 */
	public String getNationalLanguage() {
		return nationalLanguage;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param nationalLanguage the nationalLanguage to set
	 */
	public void setNationalLanguage(String nationalLanguage) {
		this.nationalLanguage = nationalLanguage;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
