package model;

import java.util.ArrayList;

import model.enums.Country;

public class Player {
	private String username;
	private String password;
	private int age;
	private boolean isFemale;
	private String description;
	private Country country;
	private ArrayList<String> topGames;
	private int points = 0;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFemale() {
		return isFemale;
	}
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public ArrayList<String> getTopGames() {
		return topGames;
	}
	public void setTopGames(ArrayList<String> topGames) {
		this.topGames = topGames;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Player(String username, String password, int age, boolean isFemale, String description, Country country,
			ArrayList<String> topGames) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.isFemale = isFemale;
		this.description = description;
		this.country = country;
		this.topGames = topGames;
	}
	public Player() {}
	@Override
	public String toString() {
		return "Player [username=" + username + ", password=" + password + ", age=" + age + ", isFemale=" + isFemale
				+ ", description=" + description + ", country=" + country + ", topGames=" + topGames + ", points="
				+ points + "]";
	}
	
	
	

}
