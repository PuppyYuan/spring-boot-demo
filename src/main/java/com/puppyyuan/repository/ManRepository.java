package com.puppyyuan.repository;

import com.puppyyuan.domain.Man;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yuanpeng on 2017/9/25.
 */
public interface ManRepository extends JpaRepository<Man, Integer> {

    public List<Man> findByAge(Integer age);
}
