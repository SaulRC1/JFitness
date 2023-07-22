package jfitness.basal.metabolic.rate.formula;

import java.util.logging.Level;
import java.util.logging.Logger;
import jfitness.basal.metabolic.rate.BasalMetabolicRate;
import jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel;
import jfitness.person.fitness.data.BiologicalSex;
import jfitness.person.fitness.data.PersonFitnessData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class HarrisBenedictFormulaTest
{

    private PersonFitnessData testFitnessDataMale;
    private PersonFitnessData testFitnessDataFemale;

    @BeforeEach
    public void initializeTestParameters()
    {
        Logger.getLogger(HarrisBenedictFormulaTest.class.getName()).log(Level.INFO, 
                "Initializing test parameters...");
        
        testFitnessDataMale = new PersonFitnessData();

        testFitnessDataMale.setAge(20);
        testFitnessDataMale.setHeight(175);
        testFitnessDataMale.setWeight(70);
        testFitnessDataMale.setBiologicalSex(BiologicalSex.MAN);

        testFitnessDataFemale = new PersonFitnessData();

        testFitnessDataFemale.setAge(20);
        testFitnessDataFemale.setHeight(165);
        testFitnessDataFemale.setWeight(60);
        testFitnessDataFemale.setBiologicalSex(BiologicalSex.WOMAN);
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
                = new HarrisBenedictFormula();

        calculatedBasalMetabolicRate = harrisBenedictFormula.calculateBasalMetabolicRate(testFitnessDataMale);
        
        Assertions.assertEquals(expectedBasalMetabolicRate, calculatedBasalMetabolicRate.getBasalMetabolicRateValue());
    }

    //@Test
    public void test2()
    {

    }
}
