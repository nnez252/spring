package me.egor.budgetapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

 @Data
 @AllArgsConstructor
 public class Ingredients {
     private String name;
     private int volume;
     private String unitOfMeasurement;
     private int id;
}
