package com.scode.controller;

import com.scode.entity.EmpEntity;
import com.scode.repository.EmpRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@Tag(name = "Employee API")
public class EmpController {

    private final EmpRepository empRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<EmpEntity> getAll() {
        return empRepository.findAll();
    }

    @GetMapping("/dept")
    @ResponseStatus(HttpStatus.OK)
    public List<EmpEntity> getByDept(@RequestParam("name") String deptName) {
        return empRepository.findAllByDeptContains(deptName);
    }
}
