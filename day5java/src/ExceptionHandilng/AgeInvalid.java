package ExceptionHandilng;

   class AgeInvalid extends Exception {
       AgeInvalid(){
    	   
       }
        AgeInvalid(String msg){
    	   super(msg);
       }
}
