/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Passive {
    
    private String name;
    private String description;
    private String type;
    private static ArrayList<Passive> passiveRefList = new ArrayList();
    
    Passive(String n, String d, String t){
        name = n;
        description = d;
        type = t;
        
        passiveRefList.add(this);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the passiveRefList
     */
    public static ArrayList<Passive> getPassiveRefList() {
        return passiveRefList;
    }
    
}
