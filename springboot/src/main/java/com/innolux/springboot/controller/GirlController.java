package com.innolux.springboot.controller;

import com.innolux.springboot.dao.GirlDao;
import com.innolux.springboot.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author liwei
 * @create 2018-01-31 17:28
 */

@RestController
public class GirlController {

    @Autowired
    private GirlDao girlDao;

    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> getGirlList(){
        return girlDao.findAll();
    }

    /**
     * 添加一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/addGirl")
    public Girl addGirl(@RequestParam("cupSize") String cupSize, @RequestParam("age") Integer age,@RequestParam("name")String name){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        girl.setName(name);
        return girlDao.save(girl);
    }

}
