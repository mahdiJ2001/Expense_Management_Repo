package com.expense_management.budget.mapper;

import com.expense_management.budget.dto.BudgetDto;
import com.expense_management.budget.entity.Budget;
import com.expense_management.category.mapper.CategoryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface BudgetMapper {
    @Mapping(target = "categoryId", source = "category.id")
    BudgetDto toDto(Budget entity);
    Budget toEntity(BudgetDto dto);
    List<BudgetDto> toDtoList(List<Budget> entities);
    List<Budget> toEntityList(List<BudgetDto> dtos);
}
