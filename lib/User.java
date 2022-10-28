package lib;

import java.io.*;

abstract public class User implements Serializable
{
    static int idNumber = 1;
    private String id;
    private String username;
    private String password;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    User(String username, String password)
    {
        this.username = username;
        this.password = password;
        generateId();
    }

    void generateId()
    {
        this.id = String.valueOf(idNumber);
        idNumber += 1;
    }

    void accountInfo()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Account Info: ");
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("-------------------------------------------------------------");
    }
}
