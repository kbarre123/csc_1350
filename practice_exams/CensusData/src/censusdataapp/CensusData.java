package censusdataapp;

/**
 *
 * @author kcb
 */
public class CensusData implements Comparable<CensusData>
{
    /**
     * a two letter code for a U.S. State.
     */
    private String state;
    
    /**
     * population in millions
     */
    private double population;
    
    /**
     * creates an object of this class using the specified parameters
     * @param sCode a two character code for the state
     * @param pInMil the population in millions
     * @throws IllegalArgumentException when
     * 1. the state code is more than two characters long
     *    or both characters are not letters in the alphabet
     * 2. the population is not a positive number
     */
    public CensusData(String sCode, double pInMil)
    {
        if (sCode.toUpperCase().charAt(0) < 'A' || sCode.toUpperCase().charAt(0) > 'Z' ||
                sCode.toUpperCase().charAt(1) < 'A' || sCode.toUpperCase().charAt(1) > 'Z')
            throw new IllegalArgumentException("Invalid State abbreviation.");
        if (pInMil <= 0)
            throw new IllegalArgumentException("Population must be positive.");
        state = sCode;
        population = pInMil;
    }
    
    /**
     * return the two-character state abbreviation code
     * @return the two-character state abbreviation code
     */
    public String getState()
    {
        return state;
    }
    
    /**
     * return the population in millions
     * @return the population in millions
     */
    public double getPopInMil()
    {
        return population;
    }
    
    /**
     * compares the census data of this state and the specified state using the
     * state code as the primary key and the population in millions as the secondary
     * key (state+popInMil order)
     * @param s a CensusData object to compare this to
     * @return 1 when this state comes after the specified state; -1 when this state
     * comes before the specified state; otherwise, 0
     */
    @Override
    public int compareTo(CensusData s)
    {
        if (this.state.compareToIgnoreCase(s.state) < 0)
            return -1;
        if (this.state.compareToIgnoreCase(s.state) > 0)
            return 1;
        if (this.population < s.population)
            return -1;
        if (this.population > s.population)
            return 1;
        return 0;
    }
    
    /**
     * gives a string representation of the census data of a state in the for
     * [state-code-in-all-caps, pop to the thousandths of a million].
     * eg: [LA, 4.602M]
     * @return the census data for the state in the format [XX, 9.999M] where XX
     * represents the state code in all caps and the 9.999 represents the state
     * population to the nearest thousandths of a million.
     */
    @Override
    public String toString()
    {
        return String.format("[%s, %.3fM]", state, population);
    }
}
