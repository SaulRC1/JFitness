package jfitness.body.mass.index.category;

/**
 * Body mass index categories presented by the JASSO (Japan Society for the
 * Study of Obesity) in a study from the year 2000.
 *
 * @author Saúl Rodríguez Naranjo
 */
public enum JapanBMICategory
{
    /**
     * This category corresponds to a body mass index value lesser than 18.5
     * kg/m^2 (kilogram/square meter)
     */
    UNDERWEIGHT_THIN("Underweight (thin)"),
    
    /**
     * This category corresponds to a body mass index value between 18.5
     * (included) and 24.9 (included) kg/m^2 (kilogram/square meter)
     */
    NORMAL_WEIGHT("Normal weight"),
    
    /**
     * This category corresponds to a body mass index value between 25
     * (included) and 29.9 (included) kg/m^2 (kilogram/square meter)
     */
    OBESITY_CLASS_1("Obesity (class 1)"),
    
    /**
     * This category corresponds to a body mass index value between 30
     * (included) and 34.9 (included) kg/m^2 (kilogram/square meter)
     */
    OBESITY_CLASS_2("Obesity (class 2)"),
    
    /**
     * This category corresponds to a body mass index value between 35
     * (included) and 39.9 (included) kg/m^2 (kilogram/square meter)
     */
    OBESITY_CLASS_3("Obesity (class 3)"),
    
    /**
     * This category corresponds to a body mass index value equal or greater
     * than 40 kg/m^2 (kilogram/square meter)
     */
    OBESITY_CLASS_4("Obesity (class 4)");

    private final String categoryName;

    private JapanBMICategory(String categoryName)
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
