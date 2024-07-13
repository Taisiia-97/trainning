package com.example.training.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {


    @Schema(description = "id", example = "2")
    private Long id;
    @Schema(description = "first name", example = "Anna")
    private String firstName;
    @Schema(description = "last name", example = "Nowak")
    private String lastName;


}
