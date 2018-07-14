package Resturunt;

import java.util.ArrayList;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    boolean newItem;

    public MenuItem(String name, double price, String description, String category, boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public MenuItem(String name, double price, String description, String category) {
        this(name, price, description, category, true);
    }

    public boolean isNewItem() {
        return newItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setNewItem(boolean aNewItem) {
        this.newItem = aNewItem;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                isNewItem() == menuItem.isNewItem() &&
                Objects.equals(getDescription(), menuItem.getDescription()) &&
                Objects.equals(getCategory(), menuItem.getCategory());
    }

    public void printMenuItem()
    {
        int line_length = 80;
        int num_dots = line_length - (this.name.length() + 7);
        String justify = "";
        String first_line = "";
        String desc_line;
        int line_break_index = 0;
        int space_index;
        int last_space_index = 1;
        ArrayList<String> new_description = new ArrayList<>();

        for (int i=0; i<num_dots; i++)
        {
            justify += ".";
        }

        first_line = this.name + " " + justify + " $" + this.price;

        System.out.println(first_line);
        System.out.println(this.category);

        space_index = this.description.indexOf(" ");


        while (space_index > -1)
        {
            if(space_index >= (line_length -4))
            {
                desc_line = this.description.substring(line_break_index, last_space_index - 1);
                new_description.add(desc_line);
                line_break_index = last_space_index + 1;
            }

            last_space_index = space_index;
            space_index = this.description.indexOf(" ", space_index + 1);
        }

        for (int j=0; j<new_description.size(); j++)
        {
            System.out.println("    " + new_description.get(j));
        }

        if (this.isNewItem())
        {
            System.out.println("NEW!!");
        }
    }
}
