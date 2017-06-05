/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpickerdesktop.lib;

/**
 *
 * @author appbenigno
 */
public class PCPart {
    private int partID = 0;
    private String partName = "";
    
    private String partDescription = "";
    private String partManufacturer = "";
    private String partBranch = "";
    private int partQuantity = 0;
    
    public PCPart()
    {}
    
    public PCPart(int id, String name, String description, String manufacturer, String branch, int quantity)
    {
        partID = id;
        partName = name;
        partDescription = description;
        partManufacturer = manufacturer;
        partBranch = branch;
        partQuantity = quantity;
    }
    
    public int ID()
    {
        return partID;
    }
    
    public String Name()
    {
        return partName;
    }
    
    public String Description()
    {
        return partDescription;
    }
    
    public String Manufacturer()
    {
        return partManufacturer;
    }
    
    public String Branch()
    {
        return partBranch;
    }
    
    public int Quantity()
    {
        return partQuantity;
    }
}
