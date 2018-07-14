package fields;

import java.util.GregorianCalendar;
import java.util.Objects;

public class DateField extends Field
{
    private CompareType compareType;

    private GregorianCalendar value;

    public DateField(String name, CompareType compareType, GregorianCalendar aValue) {

        super(name);
        this.compareType = compareType;
        this.value = aValue;
    }

    private static int compare(GregorianCalendar value, GregorianCalendar date) {
        int result;

        if (value.get(GregorianCalendar.YEAR) > date.get(GregorianCalendar.YEAR)) {
            result = 1;
        } else if (value.get(GregorianCalendar.YEAR) < date.get(GregorianCalendar.YEAR)) {
            result = -1;
        } else {
            result = 0;
        }

        if (result == 0) {
            if (value.get(GregorianCalendar.MONTH) > date.get(GregorianCalendar.MONTH)) {
                result = 1;
            } else if (value.get(GregorianCalendar.MONTH) < date.get(GregorianCalendar.MONTH)) {
                result = -1;
            } else {
                result = 0;
            }
        }

        if (result == 0) {
            if (value.get(GregorianCalendar.DAY_OF_MONTH) > date.get(GregorianCalendar.DAY_OF_MONTH)) {
                result = 1;
            } else if (value.get(GregorianCalendar.DAY_OF_MONTH) < date.get(GregorianCalendar.DAY_OF_MONTH)) {
                result = -1;
            } else {
                result = 0;
            }
        }

        return result;
    }

    public boolean compareDate(GregorianCalendar date)
    {
        int result = compare(this.getValue(), date);


        switch (this.compareType)
        {
            case EQUAL:
                return (result == 0);
            case LESS:
                return (result < 0);
            case GREATER:
                return (result > 0);

        }

        throw new IllegalArgumentException("Cannot get field of type " + this.compareType);
    }

    public String getName() {
        return super.getName();
    }

    public CompareType getCompareType() {
        return compareType;
    }

    public GregorianCalendar getValue() {
        return value;
    }

    public String getDate()

    {
        String date = value.get(GregorianCalendar.MONTH)+1 + "/" +
                value.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
                value.get(GregorianCalendar.YEAR);

        return date;
    }

    public void setCompareType(CompareType aType) {

        if ((aType == CompareType.EQUAL) || (aType == CompareType.LESS) || (aType == CompareType.GREATER))
        {
            this.compareType = aType;
        }
        else
        {
            this.compareType = CompareType.NONE;
        }
    }

    public void setValue(GregorianCalendar aValue) {
        this.value = aValue;
    }

    public void setValue(int month, int day, int year)
    {
        this.value = new GregorianCalendar(year, month-1, day);
    }
}
