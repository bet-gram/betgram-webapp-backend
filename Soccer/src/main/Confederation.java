package main;

import java.util.Date;

public class Confederation {
	
	/**
	 * country
	 */
	private Country country;
	
	/**
	 * name
	 */
	private String name;
	
	/**
	 * founded
	 */
	private Date founded;
	
	/**
	 * currentChampion
	 */
	private Club currentChampion;
	
	/**
	 * mostChampionships
	 */
	private Club mostChampionships;
	
	/**
	 * website
	 */
	private String website;

	/**
	 * @param country
	 * @param name
	 * @param founded
	 * @param currentChampion
	 * @param mostChampionships
	 * @param website
	 */
	public Confederation(Country country, String name, Date founded, Club currentChampion, Club mostChampionships,
			String website) {
		this.country = country;
		this.name = name;
		this.founded = founded;
		this.currentChampion = currentChampion;
		this.mostChampionships = mostChampionships;
		this.website = website;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the founded
	 */
	public Date getFounded() {
		return founded;
	}

	/**
	 * @return the currentChampion
	 */
	public Club getCurrentChampion() {
		return currentChampion;
	}

	/**
	 * @return the mostChampionships
	 */
	public Club getMostChampionships() {
		return mostChampionships;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param founded the founded to set
	 */
	public void setFounded(Date founded) {
		this.founded = founded;
	}

	/**
	 * @param currentChampion the currentChampion to set
	 */
	public void setCurrentChampion(Club currentChampion) {
		this.currentChampion = currentChampion;
	}

	/**
	 * @param mostChampionships the mostChampionships to set
	 */
	public void setMostChampionships(Club mostChampionships) {
		this.mostChampionships = mostChampionships;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	
	

}
