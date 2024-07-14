package com.example.training.dto;


import io.swagger.v3.oas.annotations.media.Schema;


public record UserDto(@Schema(description = "id", example = "2")
                      Long id,
                      @Schema(description = "first name", example = "Anna")
                      String firstName,
                      @Schema(description = "last name", example = "Nowak")
                      String lastName
) {

}
