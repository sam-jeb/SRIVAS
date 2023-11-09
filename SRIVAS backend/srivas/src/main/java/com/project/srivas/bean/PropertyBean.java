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
@Document(collection = "Property")
public class PropertyBean {
    @Id
    private String _id;

    private String cityName;
    private String locality;
    private String streetName;
    private String propertyType;
    private String houseType;
    private String totalFloors;
    private String propertyFloor;
    private String ageOfProperty;
    private String areaOfHouse;
    private String possessionTime;
    private String parkingSpace;
    private String rentAmount;
    private String depositAmount;
    private  String furnishingType;
    private  String description;
    private String noOfViews;
    private String userId;
    private String imgSrc;

    /*
    * >Address
>House type (Independent, apartment)
>BHK type(1bhk,2bhk)
>apartment floor and total number of floors
>age of property
>sq feet of house
>Possession
>Parking
>Number of Views
>Rent Details
> Advance Details

    * */
}
