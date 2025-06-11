package oops;

import java.util.Date;

public class EncapsulationClass {
    private String email;
    private String username;
    private long mobile;
    private Date age;
    private char gender;
    private boolean graduate;
	
    //setter
   public void setEmail(String email) {
	   this.email = email;
   }
   //getter
   public String getEmail() {
	   return email;
   }
   public void setuSername(String username) {
	   this.username = username;
   }
   public String getUsername() {
	   return username;
   }
   public void setMobile(long mobile ) {
	   this.mobile = mobile;
   }
   public long getMobile() {
	   return mobile;
   }
   public void setAge(Date age) {
	   this.age =  age;
   }
   public Date getagel() {
	   return age;
   }
   public void setGender(char gender) {
	   this.gender=gender;
   }
   public char getgender() {
	   return gender;
   }
   public void setGraduate(boolean graduate) {
	   this.graduate=graduate;
   }
   public boolean getgraduate() {
	   return graduate;
}
public void setAge(String lowerCase) {
	
}
}


