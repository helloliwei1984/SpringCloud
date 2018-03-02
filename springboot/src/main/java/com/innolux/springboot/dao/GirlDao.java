package com.innolux.springboot.dao;

import com.innolux.springboot.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author liwei
 * @create 2018-01-31 17:29
 */

public interface GirlDao extends JpaRepository<Girl,Integer> {
}
