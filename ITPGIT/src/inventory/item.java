/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author Udeshika
 */
public class item {
    
    private String itemCode;
    private String itemName;
    private String desc;
    
    
    void setName(String n){
    
        itemName = n;
    
    }
    
    
    void setDesc(String d){
    
        desc=d;
        
    }
    
    
    void setcode(String d){
    
        itemCode=d;
        
    }
    
    String getName(){
    
        return itemName;
    
    }
    
    String getDesc(){
    
        return desc;
    
    }
    
     String getCode(){
    
        return itemCode;
    
    }
    
}
