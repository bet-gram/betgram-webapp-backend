package models;

import com.avaje.ebean.Model;

import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Meili on 5/11/15.
 */
public class League extends Model{
	
	/**
	 * country
	 */
	private Country country;
	
	/**
	 * confederation
	 */
	private Confederation confederation;
	
	/**
	 * founded
	 */
	private Date founded;
	
	/**
	 * name
	 */
	private String name;
	
	/**
	 * clubs
	 */
	private ArrayList<Club> clubs;
	
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
	 * @param confederation
	 * @param founded
	 * @param name
	 * @param clubs
	 * @param currentChampion
	 * @param mostChampionships
	 * @param website
	 */
	public League(Country country, Confederation confederation, Date founded, String name, ArrayList<Club> clubs,
			Club currentChampion, Club mostChampionships, String website) {
		this.country = country;
		this.confederation = confederation;
		this.founded = founded;
		this.name = name;
		this.clubs = clubs;
		this.currentChampion = currentChampion;
		this.mostChampionships = mostChampionships;
		this.website = website;
		this.clubs = new ArrayList<Club>();
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @return the confederation
	 */
	public Confederation getConfederation() {
		return confederation;
	}

	/**
	 * @return the founded
	 */
	public Date getFounded() {
		return founded;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the clubs
	 */
	public ArrayList<Club> getClubs() {
		return clubs;
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
	 * Add a club
	 * @param club
	 * @return
	 */
	public boolean addClub(Club club){
		return clubs.add(club);
	}
	
	/**
	 * Remove a club
	 * @param club
	 * @return
	 */
	public boolean removeClub(Club club){
		return clubs.remove(club);
	}
	
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @param confederation the confederation to set
	 */
	public void setConfederation(Confederation confederation) {
		this.confederation = confederation;
	}

	/**
	 * @param founded the founded to set
	 */
	public void setFounded(Date founded) {
		this.founded = founded;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param clubs the clubs to set
	 */
	public void setClubs(ArrayList<Club> clubs) {
		this.clubs = clubs;
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
