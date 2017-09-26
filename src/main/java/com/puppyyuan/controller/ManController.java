package com.puppyyuan.controller;

import com.puppyyuan.domain.Result;
import com.puppyyuan.repository.ManRepository;
import com.puppyyuan.domain.Man;
import com.puppyyuan.service.ManService;
import com.puppyyuan.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by yuanpeng on 2017/9/25.
 */
@RestController
public class ManController {

    @Autowired
    private ManRepository manRepository;
    @Autowired
    private ManService manService;

    @GetMapping("/man")
    public List<Man> list(){
        return manRepository.findAll();
    }

    @PostMapping("/man")
    public Result<Man> create(@Valid Man man, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtils.error(1, bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtils.success(manRepository.save(man));

    }

    @GetMapping("/man/{id}")
    public Man get(@PathVariable Integer id){
        return manRepository.findOne(id);
    }

    @PutMapping("/man/{id}")
    public Man update(@PathVariable Integer id, @RequestParam String name, @RequestParam Integer age){

        Man man =  new Man();
        man.setId(id);
        man.setName(name);
        man.setAge(age);


        return manRepository.save(man);
    }

    @DeleteMapping("/man/{id}")
    public void delete(@PathVariable Integer id){
        manRepository.delete(id);
    }

    @GetMapping("/man/age/{age}")
    public List<Man> findByAge(@PathVariable Integer age){
        return manRepository.findByAge(age);
    }

    @GetMapping("/man/getAge/{id}")
    public void getAge(@PathVariable Integer id) throws Exception{
        manService.getAge(id);
    }
}
