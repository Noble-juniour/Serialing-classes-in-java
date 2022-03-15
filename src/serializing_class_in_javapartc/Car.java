package serializing_class_in_javapartc;

import java.io.*;

public class Car implements Serializable{
   public String vin;
   public String make;
   public String model;
   public String color;
   public int year;
   
   //constructor
   public Car(String vin,String make,String model,String color,int year)
   {
       this.vin = vin;
       this.make = make;
       this.model = model;
       this.color = color;
       this.year = year;
   }
   
   @Override
   public String toString()
   {
       return String.format("%d %s %s %s vin:%s", 
           year,color,model,make,vin);
   }   
}
