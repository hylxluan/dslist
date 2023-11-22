package com.dslist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dslist.dslist.DTOS.GameDTO;
import com.dslist.dslist.DTOS.GameMinDTO;
import com.dslist.dslist.entities.Game;
import com.dslist.dslist.projections.GameMinProjection;
import com.dslist.dslist.repositories.GameRepository;



@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> gameList = gameRepository.findAll();
		return gameList.stream().map(GameMinDTO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findByID(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(GameMinDTO::new).toList();
	}
}

