package com.dslist.dslist.records;

import jakarta.validation.constraints.NotBlank;

public record GameRecords(@NotBlank Long Id, @NotBlank String title, @NotBlank Integer year, 
		                  @NotBlank String genre, @NotBlank String platforms, @NotBlank Double score,
		                  @NotBlank String imgUrl, @NotBlank String longDescription, @NotBlank String shortDescription) {


}
