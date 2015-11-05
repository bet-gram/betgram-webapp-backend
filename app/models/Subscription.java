package models;


import com.avaje.ebean.Model;

import java.util.Date;
/**
 * Created by Meili on 5/11/15.
 */
public class Subscription extends Model {
	
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
}
