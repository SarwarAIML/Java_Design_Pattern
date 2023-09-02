package com.gs.creational.builder.chain.userbuilder;

public class User {

    //All final attributes
    private  String firstName; // required
    private  String lastName; // required
    private  int age; // optional
    private  String phone; // optional
    private  String address; // optional

    private User (){

    }

    public static UserBuilder newBuilder(String firstName,String lastName) {
        return new User().new UserBuilder(firstName,lastName);
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }




    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

     class UserBuilder {

        private UserBuilder(String firstName,String lastName){
            User.this.firstName = firstName;
            User.this.lastName = lastName;
        }

        public UserBuilder setAge ( int age ){
            User.this.age = age;
            return this;
        }

        public UserBuilder setPhone ( String phone ){
            User.this.phone = phone;
            return this;
        }

        public UserBuilder setAddress ( String address ){
            User.this.address = address;
            return  this;
        }
        public User build() {
            validateUserObject(User.this);
            return User.this;
        }
        private void validateUserObject(User user) {
            //validate the field to checks all fields are set properly
        }
    }


}
