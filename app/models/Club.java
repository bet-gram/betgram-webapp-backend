package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Meili on 5/11/15.
 */
@Entity
public class Club extends Model {

	@Id
	private String Id;
	
	/**
	 * fullName
	 */
	private String fullName;
	
	/**
	 * city
	 */
	private City city;
	
	/**
	 * country
	 */
	private Country country;
	
	/**
	 * nickname
	 */
	private ArrayList<String> nicknames;
	
	/**
	 * shortname
	 */
	private ArrayList<String> shortnames;
	
	/**
	 * founded
	 */
	private Date founded;
	
	/**
	 * ground
	 */
	private Ground ground;
	
	/**
	 * owner
	 */
	private String owner;
	
	/**
	 * chairman
	 */
	private Human chairman;
	
	/**
	 * manager
	 */
	private Manager manager; 
	
	/**
	 * league
	 */
	private League league;
	
	/**
	 * website
	 */
	private String website;

	/**
	 * @param fullName
	 * @param city
	 * @param country
	 * @param founded
	 * @param ground
	 * @param owner
	 * @param chairman
	 * @param manager
	 * @param league
	 * @param website
	 */
	public Club(String fullName, City city, Country country, Date founded, Ground ground, String owner, Human chairman,
			Manager manager, League league, String website) {
		this.fullName = fullName;
		this.city = city;
		this.country = country;
		this.founded = founded;
		this.ground = ground;
		this.owner = owner;
		this.chairman = chairman;
		this.manager = manager;
		this.league = league;
		this.website = website;
		this.shortnames = new ArrayList<String>();
		this.nicknames = new ArrayList<String>();
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @return the nickname
	 */
	public ArrayList<String> getNickname() {
		return nicknames;
	}
	
	/**
	 * @return true if is added, false otherwise
	 */
	public boolean addNickname(String nNickname) {
		return nicknames.add(nNickname);
	}

	/**
	 * @return true if is removed, false otherwise
	 */
	public boolean removeNockname(String nNickname) {
		return nicknames.remove(nNickname);
	}
	
	/**
	 * @return the shortname
	 */
	public ArrayList<String> getShortname() {
		return shortnames;
	}
	
	/**
	 * @return true if is added, false otherwise
	 */
	public boolean addShortname(String nShortname) {
		return shortnames.add(nShortname);
	}
	
	/**
	 * @return true if is removed, false otherwise
	 */
	public boolean removeShortname(String nShortname) {
		return shortnames.remove(nShortname);
	}

	/**
	 * @return the founded
	 */
	public Date getFounded() {
		return founded;
	}

	/**
	 * @return the ground
	 */
	public Ground getGround() {
		return ground;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @return the chairman
	 */
	public Human getChairman() {
		return chairman;
	}

	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * @return the league
	 */
	public League getLeague() {
		return league;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(ArrayList<String> nickname) {
		this.nicknames = nickname;
	}

	/**
	 * @param shortname the shortname to set
	 */
	public void setShortname(ArrayList<String> shortname) {
		this.shortnames = shortname;
	}

	/**
	 * @param founded the founded to set
	 */
	public void setFounded(Date founded) {
		this.founded = founded;
	}

	/**
	 * @param ground the ground to set
	 */
	public void setGround(Ground ground) {
		this.ground = ground;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @param chairman the chairman to set
	 */
	public void setChairman(Human chairman) {
		this.chairman = chairman;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/**
	 * @param league the league to set
	 */
	public void setLeague(League league) {
		this.league = league;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	
	

}
