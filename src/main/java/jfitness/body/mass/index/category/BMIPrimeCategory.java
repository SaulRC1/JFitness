package jfitness.body.mass.index.category;

/**
 * Body Mass Index Prime categories.
 *
 * @author Saúl Rodríguez Naranjo
 */
public enum BMIPrimeCategory
{
    /**
     * This category corresponds to a body mass index value lesser than 0.64
     * kg/m^2 (kilogram/square meter)
     */
    UNDERWEIGHT_SEVERE_THINNESS("Underweight (severe thinness)"),
    
    /**
     * This category corresponds to a body mass index value between 0.64
     * (included) and 0.67 (included) kg/m^2 (kilogram/square meter)
     */
    UNDERWEIGHT_MODERATE_THINNESS("Underweight (moderate thinness)"),
    
    /**
     * This category corresponds to a body mass index value between 0.68
     * (included) and 0.73 (included) kg/m^2 (kilogram/square meter)
     */
    UNDERWEIGHT_MILD_THINNESS("Underweight (mild thinness)"),
    
    /**
     * This category corresponds to a body mass index value between 0.74
     * (included) and 0.99 (included) kg/m^2 (kilogram/square meter)
     */
    NORMAL_RANGE("Normal range"),
    
    /**
     * This category corresponds to a body mass index value between 1
     * (included) and 1.19 (included) kg/m^2 (kilogram/square meter)
     */
    OVERWEIGHT_PRE_OBESE("Overweight (pre-obese)"),
    
    /**
     * This category corresponds to a body mass index value between 1.2
     * (included) and 1.39 (included) kg/m^2 (kilogram/square meter)
     */
    OBESE_CLASS_1("Obese (class I)"),
    
    /**
     * This category corresponds to a body mass index value between 1.4
     * (included) and 1.59 (included) kg/m^2 (kilogram/square meter)
     */
    OBESE_CLASS_2("Obese (class II)"),
    
    /**
     * This category corresponds to a body mass index value equal or greater
     * than 1.6 kg/m^2 (kilogram/square meter)
     */
    OBESE_CLASS_3("Obese (class III)");

    private final String categoryName;

    private BMIPrimeCategory(String categoryName)
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
