package jfitness.body.mass.index.category;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public interface BodyMassIndexCategoriser
{
    public String categoriseBodyMassIndex(double bodyMassIndexValue);
    
    public String getCategoriserName();
}
