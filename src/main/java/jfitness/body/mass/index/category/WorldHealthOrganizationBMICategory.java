package jfitness.body.mass.index.category;

/**
 * The WHO (World Health Organization) body mass index categories stablished for
 * adults in their "Global Database on Body Mass Index"
 * (<a href="http://www.assessmentpsychology.com/icbmi.htm">
 * http://www.assessmentpsychology.com/icbmi.htm</a>).
 *
 * @author Saúl Rodríguez Naranjo
 */
public enum WorldHealthOrganizationBMICategory
{
    /**
     * This category corresponds to a body mass index value lesser than 16
     * kg/m^2 (kilogram/square meter)
     */
    UNDERWEIGHT_SEVERE_THINNESS("Underweight (severe thinness)"),
    
    /**
     * This category corresponds to a body mass index value between 16.0
     * (included) and 16.9 (included) kg/m^2 (kilogram/square meter)
     */
    UNDERWEIGHT_MODERATE_THINNESS("Underweight (moderate thinness)"),
    
    /**
     * This category corresponds to a body mass index value between 17
     * (included) and 18.4 (included) kg/m^2 (kilogram/square meter)
     */
    UNDERWEIGHT_MILD_THINNESS("Underweight (mild thinness)"),
    
    /**
     * This category corresponds to a body mass index value between 18.5
     * (included) and 24.9 (included) kg/m^2 (kilogram/square meter)
     */
    NORMAL_RANGE("Normal range"),
    
    /**
     * This category corresponds to a body mass index value between 25
     * (included) and 29.9 (included) kg/m^2 (kilogram/square meter)
     */
    OVERWEIGHT_PRE_OBESE("Overweight (pre-obese)"),
    
    /**
     * This category corresponds to a body mass index value between 30
     * (included) and 34.9 (included) kg/m^2 (kilogram/square meter)
     */
    OBESE_CLASS_1("Obese (class I)"),
    
    /**
     * This category corresponds to a body mass index value between 35
     * (included) and 39.9 (included) kg/m^2 (kilogram/square meter)
     */
    OBESE_CLASS_2("Obese (class II)"),
    
    /**
     * This category corresponds to a body mass index value equal or greather
     * than 40 kg/m^2 (kilogram/square meter)
     */
    OBESE_CLASS_3("Obese (class III)");

    private final String categoryName;

    private WorldHealthOrganizationBMICategory(String categoryName)
    {
        this.categoryName = categoryName;
    }

    /**
     * Will return this category's name.
     *
     * @return This category's name.
     */
    public String getCategoryName()
    {
        return categoryName;
    }

    @Override
    public String toString()
    {
        return this.getCategoryName();
    }

}
