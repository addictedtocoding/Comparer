/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparer;

/**
 *
 * @author xanatosducrion
 */
public class Item {
    
    public String name;
    public int count;
    
    Item()
    {
        count = 1;
    }
    
    Item(String n)
    {
        name = n;
        count = 1;
    }

    public void incrementCount()
    {
        count++;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int c)
    {
        count = c;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String aName)
    {
        name = aName;
    }

}
