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
public class Skill {

    private String name;
    private String description;
    private String type;
    private double dropRate;
    private int price;
    private int cost;
    private static ArrayList<Skill> skillRefList = new ArrayList(), generalSkillList = new ArrayList(), commonSkillList = new ArrayList(), uncommonSkillList = new ArrayList(), rareSkillList = new ArrayList(), epicSkillList = new ArrayList(), uniqueSkillList = new ArrayList();
    
    public Skill(String n, String d, int c, String t, double dr, int p){
        
        name = n;
        description = d;
        cost = c;
        type = t;
        dropRate = dr;
        price = p;
        switch(t){
            case "common":
                commonSkillList.add(this);
                break;
            case "uncommon":
                uncommonSkillList.add(this);
                break;
            case "rare":
                rareSkillList.add(this);
                break;
            case "epic":
                epicSkillList.add(this);
                break;
            case "unique":
                uniqueSkillList.add(this);
                break;
        }
        
    }
    
    public Skill(String n, String d, int c, String t, double dr, int p, String og){
        name = n;
        description = d;
        cost = c;
        type = t;
        dropRate = dr;
        price = p;
        switch(t){
            case "common":
                commonSkillList.add(this);
                break;
            case "uncommon":
                uncommonSkillList.add(this);
                break;
            case "rare":
                rareSkillList.add(this);
                break;
            case "epic":
                epicSkillList.add(this);
                break;
            case "unique":
                uniqueSkillList.add(this);
                break;
        }
        skillRefList.add(this);
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
     * @return the dropRate
     */
    public double getDropRate() {
        return dropRate;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @return the skillRefList
     */
    public static ArrayList<Skill> getSkillRefList() {
        return skillRefList;
    }

    /**
     * @return the generalSkillList
     */
    public static ArrayList<Skill> getGeneralSkillList() {
        return generalSkillList;
    }

    /**
     * @return the commonSkillList
     */
    public static ArrayList<Skill> getCommonSkillList() {
        return commonSkillList;
    }

    /**
     * @return the uncommonSkillList
     */
    public static ArrayList<Skill> getUncommonSkillList() {
        return uncommonSkillList;
    }

    /**
     * @return the rareSkillList
     */
    public static ArrayList<Skill> getRareSkillList() {
        return rareSkillList;
    }

    /**
     * @return the epicSkillList
     */
    public static ArrayList<Skill> getEpicSkillList() {
        return epicSkillList;
    }

    /**
     * @return the uniqueSkillList
     */
    public static ArrayList<Skill> getUniqueSkillList() {
        return uniqueSkillList;
    }
    
    public static Skill getSkillbyName(String n) throws NullPointerException{
        for(Skill s : skillRefList){
            if(s.getName().equalsIgnoreCase(n)) return s;
        }
        throw new NullPointerException();
    }
    //this should throw an exception when theres no skill with that name
    public static Skill makeSkill(String n){
        Skill copy = getSkillbyName(n);
        return new Skill(copy.getName(), copy.getDescription(), copy.getCost(), copy.getType(), copy.getDropRate(), copy.getPrice());
    }
    
    public void activate(Skill s){
        switch(s.getName()){
            case "En Garde":
                //do smth
                break;
        }
    }
    
    public void fuse(ArrayList<Skill> list, Skill s, Skill k){
        if(list.contains(s)&& list.contains(k)){
            if(s.getName().equals("Boom") && k.getName().equals("Pow")){
                // remove s and k and then add a new skill to the list
                list.remove(s);
                list.remove(k);
                list.add(makeSkill("geddit"));
            }
        } else {
            //exception babyyyy
        }
    }
}
