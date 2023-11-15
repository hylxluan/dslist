package com.dslist.dslist.DTOS;

import org.springframework.beans.BeanUtils;

import com.dslist.dslist.entities.Game;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class GameMinDTO {
	
	@NotBlank Long Id;
	@NotBlank String title; 
	@NotBlank Integer year;
    @NotBlank String genre; 
	@NotBlank String platforms; 
	@NotBlank Double score;
    @NotBlank String imgUrl; 
	@NotBlank String longDescription;
	@NotBlank String shortDescription;
	
	public GameMinDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}
}
