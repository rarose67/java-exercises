package fields;

public class NumberField extends Field
{
    private String name;

    private CompareType compareType;

    private double field_value;

    public NumberField(String name, CompareType compareType, double aValue) {

        this.name=name;
        this.compareType = compareType;
        this.field_value = aValue;
    }



    public boolean compareNum(double value)
    {

        switch (this.compareType)
        {
            case EQUAL:
                return (this.field_value == value);
            case LESS:
                return (this.field_value < value);
            case GREATER:
                return (this.field_value > value);
        }

        throw new IllegalArgumentException("Cannot get field of type " + this.compareType);
    }

    public String getName() {
        return name;
    }

    public CompareType getCompareType() {
        return compareType;
    }

    public double getValue() {
        return field_value;
    }


    public void setName(String aName)
    {
        this.name = aName;

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

    public void setValue(double aValue) {
        this.field_value = aValue;
    }
}
