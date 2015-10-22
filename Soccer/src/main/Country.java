package main;

public class Country {
	
	/**
	 * name
	 */
	private String name;

	/**
	 * capital
	 */
	private City capital;
	
	/**
	 * nationalLanguage
	 */
	private String nationalLanguage;
	
	/**
	 * currency
	 */
	private String currency;

	/**
	 * @param name
	 * @param capital
	 * @param nationalLanguage
	 * @param currency
	 */
	public Country(String name, City capital, String nationalLanguage, String currency) {
		this.name = name;
		this.capital = capital;
		this.nationalLanguage = nationalLanguage;
		this.currency = currency;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the capital
	 */
	public City getCapital() {
		return capital;
	}

	/**
	 * @return the nationalLanguage
	 */
	public String getNationalLanguage() {
		return nationalLanguage;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param capital the capital to set
	 */
	public void setCapital(City capital) {
		this.capital = capital;
	}

	/**
	 * @param nationalLanguage the nationalLanguage to set
	 */
	public void setNationalLanguage(String nationalLanguage) {
		this.nationalLanguage = nationalLanguage;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
