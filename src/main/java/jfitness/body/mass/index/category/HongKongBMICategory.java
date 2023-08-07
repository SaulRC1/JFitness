package jfitness.body.mass.index.category;

/**
 * The Hong Kong's Hospital Authority recommended body mass index categories.
 * 
 * @author Saúl Rodríguez Naranjo
 */
public enum HongKongBMICategory
{
    /**
     * This category corresponds to a body mass index value lesser than 18.5
     * kg/m^2 (kilogram/square meter)
     */
    UNDERWEIGHT_UNHEALTHY("Underweight (unhealthy)"),
    
    /**
     * This category corresponds to a body mass index value between 18.5
     * (included) and 22.9 (included) kg/m^2 (kilogram/square meter)
     */
    NORMAL_RANGE_HEALTHY("Normal range (healthy)"),
    
    /**
     * This category corresponds to a body mass index value between 23
     * (included) and between 24.9 (included) kg/m^2 (kilogram/square meter)
     */
    OVERWEIGHT_1_AT_RISK("Overweight I (at risk)"),
    
    /**
     * This category corresponds to a body mass index value between 25
     * (included) and 29.9 (included) kg/m^2 (kilogram/square meter)
     */
    OVERWEIGHT_2_MODERATELY_OBESE("Overweight II (moderately obese)"),
    
    /**
     * This category corresponds to a body mass index equal or greater than 30
     * kg/m^2 (kilogram/square meter)
     */
    OVERWEIGHT_3_SEVERELY_OBESE("Overweight III (severely obese)");

    private final String categoryName;

    private HongKongBMICategory(String categoryName)
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
