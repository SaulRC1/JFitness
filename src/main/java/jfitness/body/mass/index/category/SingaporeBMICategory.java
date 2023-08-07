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
     *
     */
    UNDERWEIGHT("Underweight"),
    /**
     *
     */
    NORMAL("Normal"),
    /**
     *
     */
    MILD_TO_MODERATE_OVERWEIGHT("Mild to moderate overweight"),
    /**
     *
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
