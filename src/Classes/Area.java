/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Pc
 */
public class Area {

    protected String name, description;
    private static ArrayList<Area> areaList = new ArrayList();
    protected Image image;

    Area(String n, String d, String src){
        name = n;
        description = d;
        image = new Image(getClass().getResourceAsStream("../Assets/Images/Area/" + src + ".png"));
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
     * @return the areaList
     */
    public static ArrayList<Area> getAreaList() {
        return areaList;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }
}
