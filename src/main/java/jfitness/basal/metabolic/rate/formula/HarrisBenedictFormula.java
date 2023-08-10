package jfitness.basal.metabolic.rate.formula;

import jfitness.basal.metabolic.rate.BasalMetabolicRate;
import jfitness.basal.metabolic.rate.BasalMetabolicRateHarrisBenedict;
import jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel;
import jfitness.person.fitness.data.BiologicalSex;
import jfitness.person.fitness.data.PersonFitnessData;

/**
 * This class represents the Harris-Benedict equation to calculate an
 * individual's basal metabolic rate (BMR).
 *
 * <p>
 * The Harris-Benedict equation also called Harris-Benedict principle is a
 * method used to estimate a person's basal metabolic rate (BMR). This basal
 * metabolic rate may be multipliead by a number corresponding to the
 * individual's activity level, leaving as a result the daily kilocalorie intake
 * to maintain current body weight.
 * </p>
 *
 * <p>
 * Please, check more information about Harris-Benedict's activity level here
 * {@link jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel}
 * </p>
 *
 * <p>
 * The original equations were released in 1918 and 1919, created by James
 * Arthur Harris and Francis Gano Benedict and published by the Carnegie
 * Institution of Washington in the monograph
 * <a href="https://archive.org/details/biometricstudyof00harruoft">A Biometric
 * Study of Basal Metabolism in Man</a>.
 * </p>
 *
 * <p>
 * In 1984 a revision from Allan M. Roza and Harry M. Shizgal improved its
 * accuracy {@link RozaShizgalFormula}. Also during 1990 there was a second
 * revision by Mifflin et al. which published an equation more predictive for
 * modern lifestyle. check {@link MifflinStJeorFormula}. Future articles
 * produced BMR estimators that used lean body mass, instead of traditional
 * parameters. check {@link KatchMcardleFormula}.
 * </p>
 *
 * <p>
 * Different equations are used for both men and women since the calorie
 * requirements per sex are not the same.
 * </p>
 *
 * <p>
 * For Men --> <code>BMR (kcal/day) = (13.7516 * weight in kg) + (5.0033 * height in cm) -
 * (6.755 * age in years) + 66.473</code>
 * </p>
 *
 * <p>
 * For Women --> <code>BMR (kcal/day) = (9.5634 * weight in kg) + (1.8496 * height in cm) -
 * (4.6756 * age in years) + 655.0955</code>
 * </p>
 *
 * <p>
 * A common issue with this formula is that the calculation of the basal
 * metabolic rate does not take into account body composition, producing similar
 * results for a very muscular person and an overweight person who both share
 * the same age, height, age, weight and gender. Since muscle and fat require
 * different amount of calories to maintain, this formula will not be precise
 * for such cases.
 * </p>
 *
 * <p>
 * The paper behind the last update of this formula (Mifflin et al), states that
 * all participants in the study are within the 'normal' and 'overweight' body
 * mass index (BMI) categories. Hence the results do not necessarily apply to
 * those who fall in the 'obese' or 'underweight' BMI categories.
 * </p>
 *
 * @author Saúl Rodríguez Naranjo
 * @see BMRFormula
 * @see RozaShizgalFormula
 * @see MifflinStJeorFormula
 * @see KatchMcardleFormula
 * @see jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel
 */
public class HarrisBenedictFormula implements BMRFormula<HarrisBenedictActivityLevel>
{

    /**
     * The name of this formula.
     */
    public static final String FORMULA_NAME = "Harris-Benedict Equation 1918/1919";

    private double weight;
    private double height;
    private int age;
    private BiologicalSex biologicalSex;

    /**
     * Builds the Harris-Benedict formula with the following data related to a
     * person:
     * 
     * <ul>
     *  <li>Weight: The person's weight expressed in kilograms.</li>
     *  <li>Height: The person's height expressed in centimeters.</li>
     *  <li>Age: The person's age expressed in years.</li>
     *  <li>Biological Sex: The person's biological sex, either man or woman.</li>
     * </ul>
     *
     * @param weight The person's weight expressed in kilograms.
     * @param height The person's height expressed in centimeters.
     * @param age The person's age expressed in years.
     * @param biologicalSex The person's biological sex.
     */
    public HarrisBenedictFormula(double weight, double height, int age, BiologicalSex biologicalSex)
    {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.biologicalSex = biologicalSex;
    }

    @Override
    public double calculateTotalCalorieExpenditurePerDay(BasalMetabolicRate<HarrisBenedictActivityLevel> basalMetabolicRate, HarrisBenedictActivityLevel activityLevel)
    {
        return basalMetabolicRate.getTotalCalorieExpenditurePerDay(activityLevel);
    }

    @Override
    public String getFormulaName()
    {
        return FORMULA_NAME;
    }

    @Override
    public BasalMetabolicRate<HarrisBenedictActivityLevel> calculateBasalMetabolicRate()
    {
        BasalMetabolicRate<HarrisBenedictActivityLevel> basalMetabolicRate = null;

        double basalMetabolicRateValue = 0;

        if (biologicalSex == BiologicalSex.MAN)
        {
            basalMetabolicRateValue = (13.7516 * weight) + (5.0033 * height)
                    - (6.755 * age) + 66.473;
        } else if (biologicalSex == BiologicalSex.WOMAN)
        {
            basalMetabolicRateValue = (9.5634 * weight) + (1.8496 * height)
                    - (4.6756 * age) + 655.0955;
        }

        basalMetabolicRate = new BasalMetabolicRateHarrisBenedict(basalMetabolicRateValue);

        return basalMetabolicRate;
    }

    @Override
    public double calculateTotalCalorieExpenditurePerDay(HarrisBenedictActivityLevel activityLevel)
    {
        BasalMetabolicRate<HarrisBenedictActivityLevel> basalMetabolicRate
                = this.calculateBasalMetabolicRate();

        return basalMetabolicRate.getTotalCalorieExpenditurePerDay(activityLevel);
    }

    /**
     * Returns the person's weight in kilograms that the formula is currently
     * using for calculations.
     * 
     * @return The currently used person's weight in kilograms.
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Will set the person's weight that the formula will use for calculations.
     * 
     * <p>
     * Weight must be set in kilograms.
     * </p>
     * 
     * @param weight The person's weight in kilograms.
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     * Will return the person's height in centimeters that the formula is 
     * currently using for calculations.
     * 
     * @return The currently used person's height in centimeters.
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Will set the person's height that the formula will use for calculations.
     * 
     * <p>
     * Height must be set in centimeters.
     * </p>
     * 
     * @param height The person's height in centimeters.
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * Will return the person's age in years that the formula is currently using 
     * for calculations.
     * 
     * @return The currently used person's age in years.
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Will set the person's age that the formula will use for calculations.
     * 
     * <p>
     * Age must be set in years.
     * </p>
     * 
     * @param age The person's age in years.
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * Will return the person's biological sex that the formula is currently using 
     * for calculations.
     * 
     * @return The currently used person's biological sex.
     * @see BiologicalSex
     */
    public BiologicalSex getBiologicalSex()
    {
        return biologicalSex;
    }

    /**
     * Will set the person's biological sex that the formula will use for 
     * calculations.
     * 
     * @param biologicalSex The person's biological sex.
     * @see BiologicalSex
     */
    public void setBiologicalSex(BiologicalSex biologicalSex)
    {
        this.biologicalSex = biologicalSex;
    }
    
}
