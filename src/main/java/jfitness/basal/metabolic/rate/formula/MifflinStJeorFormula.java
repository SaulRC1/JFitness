package jfitness.basal.metabolic.rate.formula;

import jfitness.basal.metabolic.rate.BasalMetabolicRate;
import jfitness.basal.metabolic.rate.BasalMetabolicRateHarrisBenedict;
import jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel;
import jfitness.person.fitness.data.BiologicalSex;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class MifflinStJeorFormula implements BMRFormula<HarrisBenedictActivityLevel>
{
    
    /**
     * The name of this formula.
     */
    public static final String FORMULA_NAME = "Mifflin and St Jeor Equation 1990";
    
    private double weight;
    private double height;
    private int age;
    private BiologicalSex biologicalSex;

    /**
     * Builds the Mifflin-St.Jeor formula with the following data related to a
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
    public MifflinStJeorFormula(double weight, double height, int age, BiologicalSex biologicalSex)
    {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.biologicalSex = biologicalSex;
    }
    
    @Override
    public BasalMetabolicRate<HarrisBenedictActivityLevel> calculateBasalMetabolicRate()
    {   
        double basalMetabolicRateValue = 0;
        
        if(biologicalSex == BiologicalSex.MAN)
        {
            basalMetabolicRateValue = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        }
        else if(biologicalSex == BiologicalSex.WOMAN)
        {
            basalMetabolicRateValue = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        }
        
        return new BasalMetabolicRateHarrisBenedict(basalMetabolicRateValue);
    }
    
    @Override
    public double calculateTotalCalorieExpenditurePerDay(HarrisBenedictActivityLevel activityLevel)
    {
        BasalMetabolicRate<HarrisBenedictActivityLevel> basalMetabolicRate =
                this.calculateBasalMetabolicRate();
        
        return basalMetabolicRate.getTotalCalorieExpenditurePerDay(activityLevel);
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
