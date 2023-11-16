package com.dslist.dslist.DTOS;


import com.dslist.dslist.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GameListDTO {
	
	private Long id;
	private String name;
	
	
	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
	
}
