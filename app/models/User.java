package models;



import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import play.data.format.Formats;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Meili on 5/11/15.
 */
@Entity
public class User extends Model {

	@Id
	private Long Id;

	/**
	 * username
	 */
	private String username;

	/**
	 * password
	 */
	private String password;

	/**
	 * firstName
	 */
	private String firstName;

	/**
	 * lastName
	 */
	private String lastName;

	/**
	 * email
	 */
	private String email;

	/**
	 * dateOfBirth
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YY")
	private Date dateOfBirth;

	/**
	 * Country
	 */
	private String country;

	/**
	 * City
	 */
	private String city;

	/**
	 * subscriptions
	 */
	private ArrayList<Subscription> subscriptions;

	/**
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param dateOfBirth
	 * @param country
	 * @param city
	 */
	public User(Long id, String username, String password, String firstName,
				String lastName, String email, Date dateOfBirth, String country,
				String city) {
		this.Id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.country = country;
		this.city = city;
		this.subscriptions = new ArrayList<Subscription>();
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the subscriptions
	 */
	public ArrayList<Subscription> getSubscriptions() {
		return subscriptions;
	}

	/**
	 * @param subscription
	 * @return
	 */
	public boolean addSubscription(Subscription subscription) {
		return subscriptions.add(subscription);
	}

	/**
	 * @param subscription
	 * @return
	 */
	public boolean removeSubscription(Subscription subscription) {
		return subscriptions.remove(subscription);
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param subscriptions the subscriptions to set
	 */
	public void setSubscriptions(ArrayList<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public static Finder<Long, User> find = new Finder<Long, User>(
			Long.class, User.class
	);


}
