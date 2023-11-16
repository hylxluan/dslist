package com.dslist.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dslist.dslist.DTOS.GameDTO;
import com.dslist.dslist.DTOS.GameMinDTO;
import com.dslist.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> gameList = gameService.findAll();
		return gameList;
	}
	
	@GetMapping(value = "{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameService.findByID(id);
		return result;
	}
}
