import java.util.Calendar;

public class User {
    private String UserName;
    private String Password;
    private Calendar Subscription;
    public String getUserName(){
        return UserName;
    }
    public void setUserName(String UserName){
        this.UserName=UserName;
    }

    public String getPassword(){
        return Password;
    }
    public void setPassword(String UserName){
        this.Password=Password;
    }
    public Calendar getSubscription(){
        return Subscription;
    }
    public void setUserName(Calendar Subscription){
        this.Subscription=Subscription;
    }



}
