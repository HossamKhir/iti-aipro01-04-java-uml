/**
 * 
 */
package pyramids;

import java.util.List;

/**
 * PyramidDao
 * 
 * @author Hossam Khair
 */
public interface PyramidDao {

    /**
     * 
     * @return
     */
    public List<Pyramid> getAllPyramids();

    /**
     * 
     * @param modern_name
     * @return
     */
    public Pyramid getPyramid(String modern_name);

    /**
     * 
     * @param pharaoh
     * @return
     */
    public List<Pyramid> getPyramidsOfPharaoh(String pharaoh);

    /**
     * 
     * @param site
     * @return
     */
    public List<Pyramid> getPyramidsBySite(String site);

}