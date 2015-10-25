
public class Profile {
  
  private String Name;
  private String userName;
  private String billingAddress;
  private String shippingAddress;
  private String email;
  private int creditCard;
  
  
    private Profile(name, userName, billingAddress, shippingAddress, email, creditCard ){
      
      this.Name = name;
      this.userName = userName;
      this.billingAddress = billingAddress;
      this.shippingAddress = shippingAddress;
      this.email = email;
      this.creditCard = creditCard;
      
      
      
      
      public String getName(){
        
        return Name;
      }
      
      public String getUserName(){
        
        return userName;
      }
      
     public String getBillingAddress(){
       
       return billingAddress;
     }
     
     public String getShippingAddress(){
       
       return shippingAddress;
     }
     
     public String getEmail(){
       
       
       return email;
     }
     
     public int returnCC(){
       
       return creditCard;
     }
      
      
      
      
    }
  
  
  

}
