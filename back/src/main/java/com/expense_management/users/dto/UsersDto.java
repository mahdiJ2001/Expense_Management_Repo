package com.expense_management.users.dto;

import com.expense_management.category.dto.CategoryDto;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private List<CategoryDto> categories;
}