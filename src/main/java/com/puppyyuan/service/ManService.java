package com.puppyyuan.service;

import com.puppyyuan.enums.ResultEnum;
import com.puppyyuan.exception.ManException;
import com.puppyyuan.repository.ManRepository;
import com.puppyyuan.domain.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by yuanpeng on 2017/9/26.
 */
@Service
public class ManService {

    @Autowired
    private ManRepository manRepository;

    @Transactional
    public void addManByTransaction(){
        Man jack = new Man();
        jack.setName("jack");
        jack.setAge(12);
        manRepository.save(jack);

        Man mary = new Man();
        mary.setName("mary");
        mary.setAge(22);
        manRepository.save(mary);


    }

    public void getAge(Integer id) throws Exception{

        Man man = manRepository.findOne(id);
        Integer age = man.getAge();

        if(age < 10){
            throw new ManException(ResultEnum.PRIMARY_SCHOOL);
        } else if(age >= 10 && age < 16){
            throw new ManException(ResultEnum.MIDDLE_SCHOOL);
        } else {
            throw new ManException(ResultEnum.SUCCESS);
        }
    }
}
