package jfitness.basal.metabolic.rate.activity.level;

/**
 * The Harris-Benedict formula's activity level.
 *
 * <p>
 * Once basal metabolic rate is calculated through Harris-Benedict equation, it
 * must be multiplied by a certain activity factor that varies regarding the
 * person's activity through a week period.
 * </p>
 * 
 * <p>
 * This is needed because basal metabolic rate only shows energy expenditure when
 * the body is at rest and only fulfills vital functions. But it does not take
 * into consideration activities like walking, doing exercise, etc.
 * </p>
 * 
 * @author Saúl Rodríguez Naranjo
 */
public enum HarrisBenedictActivityLevel
{
    /**
     * An sedentary activity level takes into consideration that the person
     * does not exercise in any way, only keeping a normal activity like walking,
     * standing still, etc.
     */
    SEDENTARY(1.2f),
    
    /**
     * A light activity level considers that the person exercises lightly one to
     * three times a week.
     */
    LIGHT_ACTIVITY(1.375f),
    
    /**
     * Moderate activity is considered when the person exercises three to five 
     * days per week.
     */
    MODERATE_ACTIVITY(1.55f),
    
    /**
     * Heavy activity is considered when the person exercises six or seven days
     * per week.
     */
    HEAVY_ACTIVITY(1.725f),
    
    /**
     * Extreme activity is for people that trains seven days a week and also have
     * a demanding job.
     * 
     * <p>
     * It could also stand for elite athletes that train all week round and even
     * multiple times a day.
     * </p>
     */
    EXTREME_ACTIVITY(1.9f);
    
    private final float activityLevelValue;

    private HarrisBenedictActivityLevel(float activityLevelValue)
    {
        this.activityLevelValue = activityLevelValue;
    }

    public float getActivityLevelValue()
    {
        return activityLevelValue;
    }
}
