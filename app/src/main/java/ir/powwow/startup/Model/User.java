package ir.powwow.startup.Model;

public class User {

  private String name;
  private String phone;
  private String address;
  private int age;

  public User() {
  }

  public User(String name, String phone, String address, int age) {
    this.name = name;
    this.phone = phone;
    this.address = address;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
