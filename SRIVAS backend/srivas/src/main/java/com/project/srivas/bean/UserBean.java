package com.project.srivas.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

@Getter
@Setter
@ToString
@CrossOrigin
@Document(collection = "Customer")
public class UserBean {
    @Id
    private String  _id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean subscriptionPlan;
    private int clicksLeft;
}
