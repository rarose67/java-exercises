package Resturunt;

import java.util.ArrayList;
import java.util.Date;

public class Menu
{
    private Date dateUpdated;
    private String menuType;
    private ArrayList<MenuItem> items;

    public Menu(String menuType, ArrayList<MenuItem> items) {
        this.dateUpdated = dateUpdated = new Date();
        this.menuType = menuType;
        this.items = items;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String aMenuType) {
        this.menuType = aMenuType;
    }

    public void setItems(ArrayList<MenuItem> aItems) {
        this.items = aItems;
    }

    public void  addNewMenuItem(MenuItem item)
    {
        this.items.add(item);
        this.dateUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item)
    {
        this.items.remove(item);
        this.dateUpdated = new Date();
    }

    public void printMenu()
    {
        System.out.println(this.menuType.toUpperCase());
        System.out.println(this.getDateUpdated() + "\n\n");

        for (int i=0; i < this.items.size(); i++)
        {
            this.items.get(i).printMenuItem();
            System.out.println(" ");
        }

    }
}
