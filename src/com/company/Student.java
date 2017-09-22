package com.company;

import java.io.Serializable;

public class Student implements Serializable{
  private short num;
  private String firstName;
  private String secondName;
  private String familyName;
  private final String birthDay;

  @Override
  public String toString() {
    return "id : " + num + "\n" +
            "firstName : " + firstName + "\n" +
            "secondName : " + secondName + "\n" +
            "familyName : " + familyName + "\n" +
            "birthday : " + birthDay + "\n" +
            "--------------------------------\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;

    if (num != student.num) return false;
    if (!firstName.equals(student.firstName)) return false;
    if (!secondName.equals(student.secondName)) return false;
    if (!familyName.equals(student.familyName)) return false;
    return birthDay.equals(student.birthDay);
  }

  @Override
  public int hashCode() {
    int result = (int) num;
    result = 31 * result + firstName.hashCode();
    result = 31 * result + secondName.hashCode();
    result = 31 * result + familyName.hashCode();
    result = 31 * result + birthDay.hashCode();
    return result;
  }

  public Student(short num, String fName, String sName,
                 String familyName, String birthDay) {
    this.num = num;
    this.firstName = fName;
    this.secondName = sName;
    this.familyName = familyName;
    this.birthDay = birthDay;
  }

  public short getNum() { return num; }

  public void setNum(short num) {
    this.num = num;
  }

  public String getBirthDay() {
    return birthDay;
  }
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }
}
