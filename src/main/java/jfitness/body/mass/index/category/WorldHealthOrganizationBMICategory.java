package jfitness.body.mass.index.category;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public enum WorldHealthOrganizationBMICategory
{
    /**
     * 
     */
    UNDERWEIGHT_SEVERE_THINNESS("Underweight (severe thinness)"),
    
    /**
     * 
     */
    UNDERWEIGHT_MODERATE_THINNESS("Underweight (moderate thinness)"),
    
    /**
     * 
     */
    UNDERWEIGHT_MILD_THINNESS("Underweight (mild thinness)"),
    
    /**
     * 
     */
    NORMAL_RANGE("Normal range"),
    
    /**
     * 
     */
    OVERWEIGHT_PRE_OBESE("Overweight (pre-obese)"),
    
    /**
     * 
     */
    OBESE_CLASS_1("Obese (class I)"),
    
    /**
     * 
     */
    OBESE_CLASS_2("Obese (class II)"),
    
    /**
     * 
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
