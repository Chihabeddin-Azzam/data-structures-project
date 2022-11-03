import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class PatientsLogIn {
    public HashMap<String, String> map = new HashMap<>(){{
        put("rony", "1234");
    }};


    private static PatientsLogIn patientsLogIn;
    private PatientsLogIn(){}

    public static PatientsLogIn getInstance(){
        if (patientsLogIn == null){
            patientsLogIn = new PatientsLogIn();
        }
        return patientsLogIn;
    }
    public void register(String username, String pwd){
        map.put(username, pwd);
    }
    public boolean Log(String username, String password){
        boolean flag = map.get(username).equals(password);
        return flag;
    }

}
