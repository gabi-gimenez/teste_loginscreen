package org.example;

import java.util.HashMap;
import java.util.Map;

/* Autenticar no banco de dados*/

public class LoginScreen {

    private static Map<String,String> userDatabase;

    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase = new HashMap<>();
        userDatabase.put("ana.laura","chocolate123");
        userDatabase.put("bruno.fernandes","bolacha456");
        userDatabase.put("carla.stenico","cerveja908");
        
    }
    /* Verificar usuario e senha*/

    public boolean login(String User, String password) 
    
        { if (userDatabase.containsKey(User)) {

            String storedPassword = userDatabase.get(User);

            if (storedPassword.equals(password)) {

                return true; 

               
            }
        }
        return false; 
        // Se falhar retorna False
    }
    /* Adiciona um novo usuario no banco de dados */
    public void addUser(String user, String password) {

        userDatabase.put(user, password);   
    }
}
