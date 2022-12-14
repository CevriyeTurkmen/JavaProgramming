package day35_Encapsulation;

public class Credentials {
    private String username;
    private String password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isStrongPassword(String password){

boolean r1= password.length()==8&&!password.contains(" ");
boolean r2=false;
boolean r3=false;
boolean r4=false;
boolean r5=false;

       for (char each : password.toCharArray()) {
           if (Character.isUpperCase(each)){
               r2=true;
           } else if (Character.isLowerCase(each)) {
               r3=true;
           } else if (Character.isDigit(each)) {
               r4 = true;

           }else r5=true;

           }
return r1&&r2&&r3&&r4&&r5;


    }

    public void setPassword(String password){
        if (!isStrongPassword(password)){
            return;
        }
        this.password=password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
