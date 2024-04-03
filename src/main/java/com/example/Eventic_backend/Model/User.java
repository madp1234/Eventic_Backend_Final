package com.example.Eventic_backend.Model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@ToString

@Document("attendee")
@Getter
@Setter
public class User {
   

   public User(byte[] p,String name,String email,String phone,String password) 
   {
    this.profilePic = p;
    this.userName   = name;
    this.email = email;
    this.phoneNo = phone;
    this.password = password;
   }
   @Id
   @GeneratedValue
String userId;

    //  @Id
     String userName;


// @Indexed(unique = true)
byte[] profilePic;

    // @Indexed(unique = true)
     String phoneNo;

     String password;

  
    // @Indexed(unique = true)
    String email;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public byte[] getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(byte[] profilePic) {
        this.profilePic = profilePic;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
