package censusdataapp;
import java.util.*;

/**
 *
 * @author kcb
 */
public class CensusDataComp implements Comparator<CensusData>
{
    @Override
    public int compare(CensusData sd1, CensusData sd2)
    {
        if (sd1.getPopInMil() < sd2.getPopInMil())
            return -1;
        if (sd1.getPopInMil() > sd2.getPopInMil())
            return 1;
        if (sd1.getState().compareToIgnoreCase(sd2.getState()) < 0)
            return -1;
        if (sd1.getState().compareToIgnoreCase(sd2.getState()) > 0)
            return 1;
        return 0;
    }
}
