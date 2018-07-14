package fields;

/**
 * Created by LaunchCode
 */
public enum CompareType {

    NONE ("None"),
    EQUAL ("Equal"),
    LESS ("Less"),
    GREATER ("Greater");


    private final String name;

    CompareType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
