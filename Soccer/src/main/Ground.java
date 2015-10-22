package main;

import java.util.Date;

public class Ground {
	
	/**
	 * name
	 */
	private String name;
	
	/**
	 * city
	 */
	private City city;
	
	/**
	 * owner
	 */
	private Club owner;
	
	/**
	 * operator
	 */
	private Club operator;
	
	/**
	 * capacity
	 */
	private int capacity;
	
	/**
	 * recordAttendance
	 */
	private int recordAttendance;
	
	/**
	 * opened
	 */
	private Date opened;

	/**
	 * @param name
	 * @param city
	 * @param owner
	 * @param operator
	 * @param capacity
	 * @param recordAttendance
	 * @param opened
	 */
	public Ground(String name, City city, Club owner, Club operator, int capacity, int recordAttendance, Date opened) {
		this.name = name;
		this.city = city;
		this.owner = owner;
		this.operator = operator;
		this.capacity = capacity;
		this.recordAttendance = recordAttendance;
		this.opened = opened;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @return the owner
	 */
	public Club getOwner() {
		return owner;
	}

	/**
	 * @return the operator
	 */
	public Club getOperator() {
		return operator;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @return the recordAttendance
	 */
	public int getRecordAttendance() {
		return recordAttendance;
	}

	/**
	 * @return the opened
	 */
	public Date getOpened() {
		return opened;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Club owner) {
		this.owner = owner;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(Club operator) {
		this.operator = operator;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @param recordAttendance the recordAttendance to set
	 */
	public void setRecordAttendance(int recordAttendance) {
		this.recordAttendance = recordAttendance;
	}

	/**
	 * @param opened the opened to set
	 */
	public void setOpened(Date opened) {
		this.opened = opened;
	}

	
}
