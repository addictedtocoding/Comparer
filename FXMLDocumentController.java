/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparer;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author xanatosducrion
 */
public class FXMLDocumentController implements Initializable {
    
    ArrayList <Item> listOneItems, listTwoItems;
    
    @FXML
    private Label label;
    @FXML
    Button addList1, addList2, compareButton;
    @FXML
    TextArea list1, list2, outputBox;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    public void sortListOne()
    {
        try{
        //iterate through the list and add the items to an array list
        String fullText = list1.getText();
        System.out.println(fullText);
        String [] itemNames = fullText.split("\n");
        
        Arrays.sort(itemNames);
        
        listOneItems = new ArrayList();
        System.out.println("hello");
        for(int index = 0; index < itemNames.length; index++)
        {System.out.println("hello");
            String currentItem = itemNames[index].trim();
            boolean alreadyExists = false;
            System.out.println("hello");
            /*if(listOneItems.size() < 1)
            {System.out.println("hello");
                Item item = new Item(currentItem);
                listOneItems.add(item);
            }*/
            if(listOneItems.size() >= 0)
            { System.out.println("hello");
                for(int c = 0; c < listOneItems.size(); c++)
                    {
                        Item listOneItem = listOneItems.get(c); 
                        
                        if(currentItem.equalsIgnoreCase(listOneItem.getName().trim()))
                        {
                            alreadyExists = true;
                            listOneItem.incrementCount();
                            break;
                            //break;/continue;
                        }
                        else
                        {
                            alreadyExists = false;    
                        }
                    }//n'' to list; id'ing and prot areas of exceptional ecological and/or ntl historic value; iogfn; now seemed intent on trg into/apart ev in his h. Ah, adol. G sd, 1; ppl w s t would have trouble w/ ykw (while they continue to do so)
                    //cl prvn soci; sftpooite (through acg for n p status and/or purchasing of the area), extension: iogfn
                    //sl imitation & conversion
            }
                    
            //if it already exists, increment the count
            /*if(alreadyExists == true)
            {
                for(int c = 0; c < listOneItems.size(); c++)
            {
                if(currentItem.equalsIgnoreCase(listOneItems.get(c).getClass().getName()))
                {
                    //currentItem.equalsIgnoreCase(listOneItems.get(c).getClass().incrementCount());
                    Item anItem = listOneItems.get(c);              //land rights, ordinances/land ordinacnces; nail-free carpen'ry 101, capentry the old fashioned way (without power tools)
                    anItem.incrementCount();                        //cacti      //cg is a l o l          //was pulled backwards into an e; he was quite pampered for a fond pet                          //she was now seemingly intent on tearing up everything in his house. G sighed. now resemled a teenage-wolf more than a pup.
                                                                    //he had little doubt that R would perpetuate into e-y
                    
                    //break;/continue;
                }//a fond pet, in every sense of the word. He was still awestruck that s like r would want h f a p/he was etlly gr.
            }
            }
            //since it does not exist, add it (the new item type) to the arraylist
            else
            {}*/
            
            if(alreadyExists == false)
            {
                Item anItem = new Item (currentItem);
                listOneItems.add(anItem);
            }
        }
        
            //check whether the current item matches with any of the other items in the array list--> if it does, increment the count of that item. if it doesn't, add the new item to the arraylist
            
            //carpentry 101, wood buying guide, traditional japanese carpentry tutorial- no nails


        //alphabetize the arraylist
        /*for()
        {
        
        }*/
        
        //print the items and the counts to the same box
        list1.clear();
        
        for(int z = 0; z < listOneItems.size(); z++)
        {
            String printThis = listOneItems.get(z).getName() + "              x" + listOneItems.get(z).getCount();
            list1.appendText(printThis + "\n");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void sortListTwo()
    {
                try{
        //iterate through the list and add the items to an array list
        String fullText = list2.getText();
        System.out.println(fullText);
        String [] itemNames = fullText.split("\n");
        
        Arrays.sort(itemNames);
        
        listTwoItems = new ArrayList();
        
        for(int index = 0; index < itemNames.length; index++)
        {
            String currentItem = itemNames[index].trim();
            boolean alreadyExists = false;
            System.out.println("hello");
            /*if(listOneItems.size() < 1)
            {System.out.println("hello");
                Item item = new Item(currentItem);
                listOneItems.add(item);
            }*/
            if(listTwoItems.size() >= 0)
            { System.out.println("hello");
                for(int c = 0; c < listTwoItems.size(); c++)
                    {
                        Item listTwoItem = listTwoItems.get(c); 
                        
                        if(currentItem.equalsIgnoreCase(listTwoItem.getName().trim()))
                        {
                            alreadyExists = true;
                            listTwoItem.incrementCount();
                            break;
                            //break;/continue;
                        }
                        else
                        {
                            alreadyExists = false;    
                        }
                    }//n'' to list; id'ing and prot areas of exceptional ecological and/or ntl historic value; iogfn; now seemed intent on trg into/apart ev in his h. Ah, adol. G sd, 1; ppl w s t would have trouble w/ ykw (while they continue to do so)
                    //cl prvn soci; sftpooite (through acg for n p status and/or purchasing of the area), extension: iogfn
                    //sl imitation & conversion
            }
                    
            //if it already exists, increment the count
            /*if(alreadyExists == true)
            {
                for(int c = 0; c < listOneItems.size(); c++)
            {
                if(currentItem.equalsIgnoreCase(listOneItems.get(c).getClass().getName()))
                {
                    //currentItem.equalsIgnoreCase(listOneItems.get(c).getClass().incrementCount());
                    Item anItem = listOneItems.get(c);              //land rights, ordinances/land ordinacnces; nail-free carpen'ry 101, capentry the old fashioned way (without power tools)
                    anItem.incrementCount();                        //cacti      //cg is a l o l          //was pulled backwards into an e; he was quite pampered for a fond pet                          //she was now seemingly intent on tearing up everything in his house. G sighed. now resemled a teenage-wolf more than a pup.
                                                                    //he had little doubt that R would perpetuate into e-y
                    
                    //break;/continue;
                }//a fond pet, in every sense of the word. He was still awestruck that s like r would want h f a p/he was etlly gr.
            }
            }
            //since it does not exist, add it (the new item type) to the arraylist
            else
            {}*/
            
            if(alreadyExists == false)
            {
                Item anItem = new Item (currentItem);
                listTwoItems.add(anItem);
            }
        }
        
            //check whether the current item matches with any of the other items in the array list--> if it does, increment the count of that item. if it doesn't, add the new item to the arraylist
            
            //carpentry 101, wood buying guide, traditional japanese carpentry tutorial- no nails


        //alphabetize the arraylist
        /*for()
        {
        
        }*/
        
        //print the items and the counts to the same box
        list2.clear();
        
        for(int z = 0; z < listTwoItems.size(); z++)
        {
            String printThis = listTwoItems.get(z).getName() + "              x" + listTwoItems.get(z).getCount();
            list2.appendText(printThis + "\n");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void makeComparison()
    {
        outputBox.clear();
        
        //list 2 is "our list"-- that is, if anything is missing in list 1 that's there in list 2, then we have a problem.
        //So every element in list 2 ("our list") should be compared to list one ("their list")
        
        for(int c = 0; c < listTwoItems.size(); c++)
        {
            Item listTwoItem = listTwoItems.get(c);
            
            String name2 = listTwoItem.getName();
            int count2 = listTwoItem.getCount();
            
            boolean itemExists = false;
            for(int d = 0; d < listOneItems.size(); d++)
            {
                Item listOneItem = listOneItems.get(d);
                
                String name1 = listOneItem.getName();
                int count1 = listOneItem.getCount();
                
                    if(name2.equalsIgnoreCase(name1))
                    {
                        if(count2 == count1)
                        {
                            //if the name AND the count matches DO NOTHING
                            itemExists = true;
                            break;
                        }
                        else
                        {
                            //if the name matches but the count does not- report the mismatch         "our list contains ____ ____'s, but their list contains _____ ______'s"
                            itemExists = true;
                            outputBox.appendText("Our list contains " + count2 + " of " + name2 + ". Their list contains " + count1 + " of " + name2 + ". \n\n");
                            break;
                        }
                    }
                    else
                    {
                        itemExists = false;
                    }
            }
            if(itemExists == false)
            {
                //if an item type does not exist in the list- report it                   "_____ (count: ) does not exist in their list"
                outputBox.appendText(name2 + "(count: " + count2 + "), is not an item type that exists in their list. \n\n");
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
}






//"She says I b o her   side"XD
