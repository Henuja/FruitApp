/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author henuj
 */
public class Fruit {
    private String fruitName;
    private String Color;
    private String type;
    private String path;

    public Fruit(String fruitName, String Color, String type, String path) {
        this.fruitName = fruitName;
        this.Color = Color;
        this.type = type;
        this.path = path;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return Color;
    }

    public String getPath() {
        return path;
    }
    
    
    public String printDetails(){
        return "Name: "+fruitName +"  " +"Color : "+Color+"  "+"Type: "+type;
    }
    
}