package com.dslist.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_game")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String title;
	@Column(name = "game_year", nullable = false)
	private Integer year;
	@Column(nullable = false)
	private String genre;
	@Column(nullable = false)
	private String platforms;
	@Column(nullable = false)
	private Double score;
	@Column(nullable = false)
	private String imgUrl;
	@Column(nullable = false, columnDefinition = "TEXT")
	private String shortDescription;
	@Column(nullable = false, columnDefinition = "TEXT")
	private String longDescription;
}
