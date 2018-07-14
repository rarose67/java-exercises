package fields;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class FieldTest {

    public static void main(String[] args) {

        HashMap<String, Field> fieldHashMap = new HashMap<>();

        NumberField num1 = new NumberField("num1", CompareType.LESS, 3.0);
        NumberField num2 = new NumberField("num2", CompareType.EQUAL, 3.0);
        GregorianCalendar date = new GregorianCalendar(2018, 6, 12);
        DateField date1 = new DateField("date", CompareType.GREATER, date);

        fieldHashMap.put("num1", num1);
        fieldHashMap.put("num2", num2);
        fieldHashMap.put("date1", date1);

        for (String key : fieldHashMap.keySet())
        {
            if(key.contains("num"))
            {
                NumberField field = (NumberField) fieldHashMap.get(key);
                System.out.println("Key: " + key +"\tValue:  " + field.getValue());
            }
            else if(key.contains("date"))
            {
                DateField field = (DateField) fieldHashMap.get(key);
                System.out.println("Key: " + field.getName() + "\tValue:  " + field.getDate());
            }

        }
    }
}
