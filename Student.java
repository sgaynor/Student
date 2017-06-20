import java.util.*
// Assignment:Student.java
public class Student { 
 // instance variables
 private String name, grade, age, school;
 
 // constuct
 public Car(String cName, String cGrade, String cAge, String cSchool,)
{ // ini
 name = cName;
 grade = cGrade;
 age = cAge;
 school = cSchool;
 
 }
 public void setGrade (String grade){
 grade = cGrade;
 }// end of set grade
 public void setName (int firstName)( int lastName){
 name = firstName + lastName;
 }// end of set name
 public void setAge (String age){
 }// end of set age
 public void setSchool (String school){
 }// end of set school
public String toString(){
String result = name + "" + grade + "" + age + "" + school;
result += getStudent() + " Create new student";
return result;
}// end of toString
   }// end of class