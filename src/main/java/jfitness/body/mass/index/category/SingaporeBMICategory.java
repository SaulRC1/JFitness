package jfitness.body.mass.index.category;

/**
 * Singapore body mass index categories revised in 2005 by the HPB (Health
 * Promotion Board).
 *
 * <p>
 * This revision was motivated by studies showing that many asian populations,
 * including Singapore population, have a higher proportion of body fat and
 * increased risk for cardiovascular diseases and diabetes mellitus, compared
 * with BMI recommendations in other countries.
 * </p>
 *
 * <p>
 * The body mass index ranges emphasise on health risk rather than weight
 * itself.
 * </p>
 *
 * @author Saúl Rodríguez Naranjo
 */
public enum SingaporeBMICategory
{
    /**
     * This category corresponds to a body mass index value lesser than 18.5
     * kg/m^2 (kilogram/square meter)
     */
    UNDERWEIGHT("Underweight"),
    
    /**
     * This category corresponds to a body mass index value between 18.5
     * (included) and 22.9 (included) kg/m^2 (kilogram/square meter)
     */
    NORMAL("Normal"),
    
    /**
     * This category corresponds to a body mass index value between 23
     * (included) and 27.4 (included) kg/m^2 (kilogram/square meter)
     */
    MILD_TO_MODERATE_OVERWEIGHT("Mild to moderate overweight"),
    
    /**
     * This category corresponds to a body mass index value equal or greater
     * than 27.5 kg/m^2 (kilogram/square meter)
     */
    VERY_OVERWEIGHT_TO_OBESE("Very overweight to obese");

    private final String categoryName;

    private SingaporeBMICategory(String categoryName)
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
