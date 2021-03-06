package com.example.App.domain;

import java.util.Date;
import java.util.ArrayList;
import javax.validation.constraints.NotBlank;


  
public class Order {
 	private long id;
	@NotBlank(message = "name not blank")
	private String name;
	@NotBlank(message = "street not blank")

	private String street;
	@NotBlank(message = " zipCode not blank")

	private String zipCode;
	@NotBlank(message = "state not blank")

	private String state;
	@NotBlank(message = "city not blank")

	private String city;
	@NotBlank(message = "credit card number not blank")

	private String creditCard;
	@NotBlank(message = "cvv not blank")

	private String cvv;
	private Date placedAt;
    private ArrayList<Integer> pancakes ; 
    private int id_users ; 
    public Order (long id , String name, String street , String zipCode , String state , String city , String creditCard , 
    		String cvv , Date placedAt) { 
     	
    	this.id= id ; 
    	this.name=name; 
    	this.street = street ; 
    	this.zipCode= zipCode; 
    	this.state = state; 
    	this.city = city; 
    	this.creditCard= creditCard; 
    	this.cvv= cvv; 
    	this.placedAt = placedAt; 
    }
    public Order () {

    	
    }
	public long getid() {
		return this.id;
	}
   
	public void setid(long id) {
		this.id = id;
	}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getstreet() {
		return this.street;
	}

	public void setstreet(String street) {
		this.street = street;
	}

	public String getstate() {
		return this.state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public String getcity() {
		return this.city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getcreditCard() {
		return this.creditCard;
	}

	public void setcreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getcvv() {
		return this.cvv;
	}

	public void setcvv(String cvv) {
		this.cvv = cvv;
	}

	public String getzipCode() {
		return this.zipCode;
	}

	public void setzipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Date getplacedAt() {
		return this.placedAt;
	}

	public void setplacedAt(Date placedAt) {
		this.placedAt= placedAt;
	}
	
	public void setPancake(ArrayList<Integer> pancake) { // in order to make several pancake designs
 		this.pancakes=  pancake;
           // to the same order
	}
	
	public ArrayList<Integer> getPancake(){ 
		return this.pancakes; 
	}
	public int  getid_users() {
		return id_users;
	}
	public void setid_users(int user) {
		this.id_users = user;
	}

}
