package jfitness.basal.metabolic.rate;

import jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class BasalMetabolicRateHarrisBenedict implements BasalMetabolicRate<HarrisBenedictActivityLevel> 
{
    private double basalMetabolicRateValue;
    
    public BasalMetabolicRateHarrisBenedict(double basalMetabolicRateValue)
    {
        this.basalMetabolicRateValue = basalMetabolicRateValue;
    }
    
    @Override
    public double getTotalCalorieExpenditurePerDay(HarrisBenedictActivityLevel activityLevel)
    {
        return (basalMetabolicRateValue * activityLevel.getActivityLevelValue());
    }

    @Override
    public double getBasalMetabolicRateValue()
    {
        return basalMetabolicRateValue;
    }

    public void setBasalMetabolicRateValue(double basalMetabolicRateValue)
    {
        this.basalMetabolicRateValue = basalMetabolicRateValue;
    }
}
