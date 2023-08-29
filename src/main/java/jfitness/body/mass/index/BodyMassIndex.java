package jfitness.body.mass.index;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class BodyMassIndex
{

    private double bodyMassIndexValue;
    private String bodyMassIndexCategory;
    private String bodyMassIndexFormulaUsed;
    private String bodyMassIndexCategoriserUsed;

    public BodyMassIndex()
    {
    }

    public BodyMassIndex(double bodyMassIndexValue, String bodyMassIndexCategory, String bodyMassIndexFormulaUsed, String bodyMassIndexCategoriserUsed)
    {
        this.bodyMassIndexValue = bodyMassIndexValue;
        this.bodyMassIndexCategory = bodyMassIndexCategory;
        this.bodyMassIndexFormulaUsed = bodyMassIndexFormulaUsed;
        this.bodyMassIndexCategoriserUsed = bodyMassIndexCategoriserUsed;
    }

    public double getBodyMassIndexValue()
    {
        return bodyMassIndexValue;
    }

    public void setBodyMassIndexValue(double bodyMassIndexValue)
    {
        this.bodyMassIndexValue = bodyMassIndexValue;
    }

    public String getBodyMassIndexCategory()
    {
        return bodyMassIndexCategory;
    }

    public void setBodyMassIndexCategory(String bodyMassIndexCategory)
    {
        this.bodyMassIndexCategory = bodyMassIndexCategory;
    }

    public String getBodyMassIndexFormulaUsed()
    {
        return bodyMassIndexFormulaUsed;
    }

    public void setBodyMassIndexFormulaUsed(String bodyMassIndexFormulaUsed)
    {
        this.bodyMassIndexFormulaUsed = bodyMassIndexFormulaUsed;
    }

    public String getBodyMassIndexCategoriserUsed()
    {
        return bodyMassIndexCategoriserUsed;
    }

    public void setBodyMassIndexCategoriserUsed(String bodyMassIndexCategoriserUsed)
    {
        this.bodyMassIndexCategoriserUsed = bodyMassIndexCategoriserUsed;
    }

    @Override
    public String toString()
    {
        return "BodyMassIndex{" + "bodyMassIndexValue=" + bodyMassIndexValue + ", bodyMassIndexCategory=" + bodyMassIndexCategory + ", bodyMassIndexFormulaUsed=" + bodyMassIndexFormulaUsed + ", bodyMassIndexCategoriserUsed=" + bodyMassIndexCategoriserUsed + '}';
    }

}
