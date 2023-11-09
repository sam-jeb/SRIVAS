package com.project.srivas.model;

import com.project.srivas.bean.PropertyBean;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PropertyDAO extends MongoRepository<PropertyBean,String> {
}
