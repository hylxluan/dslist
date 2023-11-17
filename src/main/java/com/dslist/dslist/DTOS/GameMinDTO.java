package com.dslist.dslist.DTOS;

import org.springframework.beans.BeanUtils;

import com.dslist.dslist.entities.Game;
import com.dslist.dslist.projections.GameMinProjection;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class GameMinDTO {
	
	@NotBlank Long Id;
	@NotBlank String title; 
	@NotBlank Integer year; 
    @NotBlank String imgUrl; 
	@NotBlank String shortDescription;
	
	public GameMinDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public GameMinDTO(GameMinProjection projection) {
		Id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getGameYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
	}
	
}
