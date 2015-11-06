package models;


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


import java.util.Date;

/**
 * Created by Meili on 5/11/15.
 */
@Entity
public class Subscription extends Model {

	@Id
	private Long Id;

	/**
	 * user
	 */
	private User user;

	/**
	 * expirationDate
	 */
	private Date expirationDate;

	/**
	 * startDate
	 */
	private Date startDate;

	/**
	 * payment
	 */
	private Payment payment;

	/**
	 * active
	 */
	private boolean active;

	/**
	 * league
	 */
	private League league;

	public Subscription(Long id, User user, Date expirationDate, Date startDate, Payment payment, boolean active, League league) {
		Id = id;
		this.user = user;
		this.expirationDate = expirationDate;
		this.startDate = startDate;
		this.payment = payment;
		this.active = active;
		this.league = league;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public static Finder<Long, Subscription> find = new Finder<Long, Subscription>(
			Long.class, Subscription.class
	);

}
