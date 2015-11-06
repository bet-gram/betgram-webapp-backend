package models;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Meili on 5/11/15.
 */
public class Player extends Human {


	/**
	 * currentClub
	 */
	private Club currentClub;

	/**
	 * number
	 */
	private int number;

	/**
	 * height
	 */
	private Double height;

	/**
	 * playingPosition
	 */
	private Position playingPosition;

	/**
	 * @param name
	 * @param dateOfBirth
	 * @param placeOfBirth
	 * @param currentClub
	 * @param number
	 * @param height
	 * @param playingPosition
	 */
	public Player(Long id, String name, Date dateOfBirth, City placeOfBirth, Club currentClub, int number, Double height,
				  Position playingPosition) {
		super(id, name, dateOfBirth, placeOfBirth);
		this.currentClub = currentClub;
		this.number = number;
		this.height = height;
		this.playingPosition = playingPosition;
	}

	/**
	 * @return the currentClub
	 */
	public Club getCurrentClub() {
		return currentClub;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @return the playingPosition
	 */
	public Position getPlayingPosition() {
		return playingPosition;
	}

	/**
	 * @param currentClub the currentClub to set
	 */
	public void setCurrentClub(Club currentClub) {
		this.currentClub = currentClub;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}

	/**
	 * @param playingPosition the playingPosition to set
	 */
	public void setPlayingPosition(Position playingPosition) {
		this.playingPosition = playingPosition;
	}


}
