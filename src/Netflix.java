public class Netflix {
    private User[] list;
    private User[] users;
    private Series[]  series;

    public Netflix(){
        this.users=new User[0];

    }
    public addAccount(){

    }
    private boolean isUserExist(String userToCheck){
        boolean exists=false;
        for(int i=0; i<this.users.length; i++){
            User currentUser=this.users[i];
            if (currentUser.getUserName().equals(userToCheck)){
                exists=true;
                break;
            }
        }
    }

}
