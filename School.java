import java.util.*
// Assignment: School.java
public class School { 
 // instance variables
 private String name1, city, state, zipCode;
 
 // constuct
 public Car(String cName1, String cCity, String cState, String cZipCode)
{ // ini
 name1 = cName1;
 city = cCity;
 state = cState;
 zipCode = cZipCode;
 }
 public void setCity (String city){
 city = cCity;
 }// end of set city
 public void setName1 (String name1){
 name1 = cName1;
 }// end of set name
 public void setState (String state){
 state = cState;
}// end of set state
 public void setZipCode (String zipCode){
 zipCode = ZipCode;
 }// end of set zipCode
public String toString(){
String result = name1 + "" + city + "" + state + "" + zipCode;
result += + getSchool() + "Create new school.";
return result;
}// end of toString
   }// end of class