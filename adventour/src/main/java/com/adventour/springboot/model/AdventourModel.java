package com.adventour.springboot.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@CrossOrigin
@Table(name = "tours_packages")
public class AdventourModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "state_img")
	private String stateImg;
	
	@Column(name = "tour_title")
	private String tourTitle;
	
	@Column(name = "tour_img")
	private String tourImg;
	
	@Column(name = "cities")
	private String cities;
	
	@Column(name = "periods")
	private String periods;
	
	@Column(name = "cost")
	private int cost;
	
	@Column(name = "city_img")
	private String cityImg;
	
	@Column(name = "overview",length=10000 )
	private String overview;
	
	@Column(name = "trip_highlights", length=6000)
	private String[] tripHighlights;
	
	@Column(name = "tour_routes" , length=10000)
	private String[] tourRoutes;

	
	
	public AdventourModel() {
		super();
	}

	public AdventourModel(long id, String state, String stateImg, String tourTitle, String tourImg, String cities,
			String periods, int cost, String cityImg, String overview, String[] tripHighlights, String[] tourRoutes) {
		super();
		this.id = id;
		this.state = state;
		this.stateImg = stateImg;
		this.tourTitle = tourTitle;
		this.tourImg = tourImg;
		this.cities = cities;
		this.periods = periods;
		this.cost = cost;
		this.cityImg = cityImg;
		this.overview = overview;
		this.tripHighlights = tripHighlights;
		this.tourRoutes = tourRoutes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateImg() {
		return stateImg;
	}

	public void setStateImg(String stateImg) {
		this.stateImg = stateImg;
	}

	public String getTourTitle() {
		return tourTitle;
	}

	public void setTourTitle(String tourTitle) {
		this.tourTitle = tourTitle;
	}

	public String getTourImg() {
		return tourImg;
	}

	public void setTourImg(String tourImg) {
		this.tourImg = tourImg;
	}

	public String getCities() {
		return cities;
	}

	public void setCities(String cities) {
		this.cities = cities;
	}

	public String getPeriods() {
		return periods;
	}

	public void setPeriods(String periods) {
		this.periods = periods;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getCityImg() {
		return cityImg;
	}

	public void setCityImg(String cityImg) {
		this.cityImg = cityImg;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String[] getTripHighlights() {
		return tripHighlights;
	}

	public void setTripHighlights(String[] tripHighlights) {
		this.tripHighlights = tripHighlights;
	}

	public String[] getTourRoutes() {
		return tourRoutes;
	}

	public void setTourRoutes(String[] tourRoutes) {
		this.tourRoutes = tourRoutes;
	}

	
	
	
	
 	
	
	
	
}
