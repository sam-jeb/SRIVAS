package com.project.srivas.controller;

import com.project.srivas.bean.PropertyBean;
import com.project.srivas.model.PropertyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class PropertyController {
    @Autowired
    private PropertyDAO DAO;
    @PostMapping("/addProperty")
    public String addData(@RequestBody PropertyBean property){
        DAO.save(property);
        return "Added property with id" + property.get_id();
    }
    @GetMapping("/getAllProperty")
    private List<PropertyBean> getProperty(){
        return DAO.findAll();
    }
    @GetMapping("/getPropertyById/{id}")
    private Optional<PropertyBean> getPropertyById(@PathVariable String id) {
        return DAO.findById(id);
    }
}
