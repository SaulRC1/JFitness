package jfitness.basal.metabolic.rate.formula;

import java.util.logging.Level;
import java.util.logging.Logger;
import jfitness.basal.metabolic.rate.BasalMetabolicRate;
import jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel;
import jfitness.person.fitness.data.BiologicalSex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class HarrisBenedictFormulaTest
{

    private double weightMaleSubject;
    private double heightMaleSubject;
    private int ageMaleSubject;
    private BiologicalSex biologicalSexMaleSubject;
    
    private double weightFemaleSubject;
    private double heightFemaleSubject;
    private int ageFemaleSubject;
    private BiologicalSex biologicalSexFemaleSubject;
    
    @BeforeEach
    public void initializeTestParameters()
    {
        Logger.getLogger(HarrisBenedictFormulaTest.class.getName()).log(Level.INFO, 
                "Initializing test parameters...");
        
        
        weightMaleSubject = 70;
        heightMaleSubject = 175;
        ageMaleSubject = 20;
        biologicalSexMaleSubject = BiologicalSex.MAN;
        
        weightFemaleSubject = 60;
        heightFemaleSubject = 165;
        ageFemaleSubject = 20;
        biologicalSexFemaleSubject = BiologicalSex.WOMAN;
    }

    /**
     * This method will test Harris-Benedict basal metabolic rate calculation on
     * the male subject.
     */
    @Test
    public void test1()
    {
        double expectedBasalMetabolicRate = 1769.5625;

        BasalMetabolicRate<HarrisBenedictActivityLevel> calculatedBasalMetabolicRate;

        BMRFormula<HarrisBenedictActivityLevel> harrisBenedictFormula
                = new HarrisBenedictFormula(weightMaleSubject, heightMaleSubject, ageMaleSubject, biologicalSexMaleSubject);

        calculatedBasalMetabolicRate = harrisBenedictFormula.calculateBasalMetabolicRate();
        
        Assertions.assertEquals(expectedBasalMetabolicRate, calculatedBasalMetabolicRate.getBasalMetabolicRateValue());
    }

    //@Test
    public void test2()
    {

    }
}
