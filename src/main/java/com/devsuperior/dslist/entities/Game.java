package com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long    id;
	private String  title;
	@Column(name = "game_year")
	private Integer year;
	private String  genre;
	private String  platforms;
	private Double  score;
	private String  imgUrl;
	@Column(columnDefinition = "TEXT")
	private String  shortDescription;
	@Column(columnDefinition = "TEXT")
	private String  longDescription;
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getGenre() {
		return genre;
	}
	public String getPlatforms() {
		return platforms;
	}
	public Double getScore() {
		return score;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	
	

}
