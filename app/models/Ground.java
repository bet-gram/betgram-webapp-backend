package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import javax.persistence.*;

/**
 * Created by scvalencia606 on 5/11/15.
 */

@Entity
public class Ground extends Model {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	/**
	 * name
	 */
	private String name;

	/**
	 * city
	 */
	private String city;

	/**
	 * latitude
	 */
	@Column(columnDefinition = "REAL")
	private double latitude;

	/**
	 * longitude
	 */
	@Column(columnDefinition = "REAL")
	private double longitude;

	/**
	 * capacity
	 */
	private int capacity;

    public static Finder<Long, Ground> find = new Finder<Long, Ground>(
            Long.class, Ground.class
    );

	public Ground() {
	}

	public static Ground create(String name, String city, double latitude, double longitude, int capacity) {
		Ground groundObject = new Ground();

		groundObject.name = name;
		groundObject.city = city;
		groundObject.latitude = latitude;
		groundObject.longitude = longitude;
		groundObject.capacity = capacity;

		return groundObject;
	}

    public Long getId() {
        return id;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
