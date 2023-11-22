package com.dslist.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dslist.dslist.DTOS.GameListDTO;
import com.dslist.dslist.entities.GameList;
import com.dslist.dslist.projections.GameMinProjection;
import com.dslist.dslist.repositories.GameListRepository;
import com.dslist.dslist.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}
	
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		List<GameMinProjection> gameList = gameRepository.searchByList(listId);
		GameMinProjection game = gameList.remove(sourceIndex);
		gameList.add(destinationIndex, game);
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, gameList.get(i).getId(), i);
		}
	}
}
