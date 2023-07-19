package jfitness.person.fitness.data;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public interface PersonFitnessData
{
    public double getBodyWeight();

    public double getHeight();

    public double getBodyWeightImperialSystem();

    public double getHeightImperialSystem();

    public BiologicalSex getBiologicalSex();

    public int getAge();

    public int getAgeInMonths();

    public int getAgeInDays();
}
