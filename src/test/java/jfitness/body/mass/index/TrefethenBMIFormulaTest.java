package jfitness.body.mass.index;

import java.math.BigDecimal;
import java.math.RoundingMode;
import jfitness.body.mass.index.category.BMIPrimeCategoriser;
import jfitness.body.mass.index.category.BodyMassIndexCategoriser;
import jfitness.body.mass.index.category.WorldHealthOrganizationBMICategoriser;
import jfitness.body.mass.index.category.WorldHealthOrganizationBMICategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class for {@link TrefethenBMIFormula}.
 * 
 * @author Saúl Rodríguez Naranjo
 */
public class TrefethenBMIFormulaTest
{

    /**
     * Will test if {@link NullPointerException} is thrown when a null
     * {@link BodyMassIndexCategoriser} is passed as an argument to
     * {@link TrefethenBMIFormula} constructor.
     */
    @Test
    public void should_throwNullPointerException_when_nullBodyMassIndexCategoriserIsPassedToConstructor()
    {
        Assertions.assertThrows(NullPointerException.class, () ->
        {
            BodyMassIndexFormula trefethenBMIFormula = new TrefethenBMIFormula(null, 75, 175);

        }, NullPointerException.class.getName() + " was expected.");
    }

    /**
     * Will test if {@link IncompatibleBodyMassIndexCategoriserException} is
     * thrown when an incompatible {@link BodyMassIndexCategoriser} is passed as
     * an argument to {@link TrefethenBMIFormula} constructor.
     */
    @Test
    public void should_throwIncompatibleBodyMassIndexCategoriserException_when_incompatibleBodyMassIndexCategoriserIsPassedToConstructor()
    {
        BodyMassIndexCategoriser bmiPrimeCategoriser = new BMIPrimeCategoriser();

        Assertions.assertThrows(IncompatibleBodyMassIndexCategoriserException.class, () ->
        {
            BodyMassIndexFormula trefethenBMIFormula
                    = new TrefethenBMIFormula(bmiPrimeCategoriser, 75, 175);

        }, IncompatibleBodyMassIndexCategoriserException.class.getName() + " was expected.");
    }

    /**
     * Will test if {@link IllegalArgumentException} is thrown when 0 is passed
     * as the person's weight into {@link TrefethenBMIFormula} constructor.
     */
    @Test
    public void should_throwIllegalArgumentException_when_personWeightWithValue0IsPassedToConstructor()
    {
        BodyMassIndexCategoriser worldHealthOrganizationBMICategoriser
                = new WorldHealthOrganizationBMICategoriser();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            BodyMassIndexFormula trefethenBMIFormula
                    = new TrefethenBMIFormula(worldHealthOrganizationBMICategoriser, 0, 175);

        }, IllegalArgumentException.class.getName() + " was expected.");

    }

    /**
     * Will test if {@link IllegalArgumentException} is thrown when 0 is passed
     * as the person's height into {@link TrefethenBMIFormula} constructor.
     */
    @Test
    public void should_throwIllegalArgumentException_when_personHeightWithValue0IsPassedToConstructor()
    {
        BodyMassIndexCategoriser worldHealthOrganizationBMICategoriser
                = new WorldHealthOrganizationBMICategoriser();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            BodyMassIndexFormula trefethenBMIFormula
                    = new TrefethenBMIFormula(worldHealthOrganizationBMICategoriser, 75, 0);

        }, IllegalArgumentException.class.getName() + " was expected.");

    }

    /**
     * Will test if {@link IllegalArgumentException} is thrown when a negative
     * value is passed as the person's weight into {@link TrefethenBMIFormula}
     * constructor.
     */
    @Test
    public void should_throwIllegalArgumentException_when_personWeightWithNegativeValueIsPassedToConstructor()
    {
        BodyMassIndexCategoriser worldHealthOrganizationBMICategoriser
                = new WorldHealthOrganizationBMICategoriser();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            BodyMassIndexFormula trefethenBMIFormula
                    = new TrefethenBMIFormula(worldHealthOrganizationBMICategoriser, -1, 175);

        }, IllegalArgumentException.class.getName() + " was expected.");

    }

    /**
     * Will test if {@link IllegalArgumentException} is thrown when a negative
     * value is passed as the person's height into {@link TrefethenBMIFormula}
     * constructor.
     */
    @Test
    public void should_throwIllegalArgumentException_when_personHeightWithNegativeValueIsPassedToConstructor()
    {
        BodyMassIndexCategoriser worldHealthOrganizationBMICategoriser
                = new WorldHealthOrganizationBMICategoriser();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            BodyMassIndexFormula trefethenBMIFormula
                    = new TrefethenBMIFormula(worldHealthOrganizationBMICategoriser, 75, -1);

        }, IllegalArgumentException.class.getName() + " was expected.");

    }
    
    @Test
    public void calculateBodyMassIndex_returnsValidValues_withWeight75KgHeight175cm()
    {
        BodyMassIndexCategoriser worldHealthOrganizationBMICategoriser
                = new WorldHealthOrganizationBMICategoriser();
        
        BodyMassIndexFormula trefethenBMIFormula
                    = new TrefethenBMIFormula(worldHealthOrganizationBMICategoriser, 75, 175);
        
        BodyMassIndex bodyMassIndex = trefethenBMIFormula.calculateBodyMassIndex();
        
        BigDecimal bodyMassIndexValueRounded = new BigDecimal(bodyMassIndex.getBodyMassIndexValue()).setScale(2, RoundingMode.HALF_UP);
        
        Assertions.assertAll("Verify BodyMassIndex properties",
                () -> Assertions.assertEquals(worldHealthOrganizationBMICategoriser.getCategoriserName(),
                        bodyMassIndex.getBodyMassIndexCategoriserUsed()),
                
                () -> Assertions.assertEquals(trefethenBMIFormula.getFormulaName(), bodyMassIndex.getBodyMassIndexFormulaUsed()),
                
                () -> Assertions.assertEquals(24.07, bodyMassIndexValueRounded.doubleValue()),
                
                () -> Assertions.assertEquals(WorldHealthOrganizationBMICategory.NORMAL_RANGE.getCategoryName()
                        , bodyMassIndex.getBodyMassIndexCategory())
        );
    }
}
