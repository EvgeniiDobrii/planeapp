package org.example.planeapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnivercityGroupDto {
    private int id;
    private String groupNumber;
    private int studentQuantity;
}
