package com.project.srivas.model;

import com.project.srivas.bean.UserBean;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAO extends MongoRepository<UserBean,String> {
}
