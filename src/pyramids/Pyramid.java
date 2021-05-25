/**
 * 
 */
package pyramids;

/**
 * Pyramid
 * 
 * @author Hossam Khair
 */
public class Pyramid {

    private String pharaoh;
    private String modern_name;
    private String site;
    private double height;

    /**
     * 
     */
    private Pyramid() {

    }

    /**
     * 
     * @param pharaoh
     * @param modern_name
     * @param site
     * @param height
     */
    public Pyramid(String pharaoh, String modern_name, String site, double height) {
        this();
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;
    }

    /**
     * 
     * @return
     */
    public String getPharaoh() {
        return pharaoh;
    }

    /**
     * 
     * @param pharaoh
     */
    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    /**
     * 
     * @return
     */
    public String getModern_name() {
        return modern_name;
    }

    /**
     * 
     * @param modern_name
     */
    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    /**
     * 
     * @return
     */
    public String getSite() {
        return site;
    }

    /**
     * 
     * @param site
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{\n\t\"pharaoh\": \"" + this.pharaoh + "\",\n\t\"modern_name\": \"" + this.modern_name
                + "\",\n\t\"site\": \"" + this.site + "\",\n\t\"height\": \"" + this.height + "\"\n}";
    }
}