package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Meili on 5/11/15.
 */
@Entity
public class Payment extends Model {

	@Id
	private Long Id;

	private Double amount;



	public static Finder<Long, Payment> find = new Finder<Long, Payment>(
			Long.class, Payment.class
	);

}
