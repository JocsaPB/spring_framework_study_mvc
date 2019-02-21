package com.study.springframework.mvc.medium;

public class People {

	private String name;
	
	private int age;
	
	private char gender;
	
	private String country;
	
	private boolean eighteenAbove;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isEighteenAbove() {
		return eighteenAbove;
	}

	public void setEighteenAbove(boolean eighteenAbove) {
		this.eighteenAbove = eighteenAbove;
	}

}
