/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hossam Khair
 */
public class Customer {

    private String name;
    private String email;
    private String passwd;
    private String address;
    private String phoneNumber;

    /**
     *
     */
    private Customer() {

    }

    /**
     *
     * @param cart
     */
    public Customer(ShoppingCart cart) {
        this();
    }

    /**
     *
     */
    public void login() {

    }

    /**
     *
     */
    public void register() {

    }

    /**
     *
     * @param product
     */
    public void buy(Product product) {

    }

    /**
     *
     * @param regex
     * @return
     */
    public java.util.List<Product> search(String regex) {
        return null;
    }

    /**
     *
     * @param cat
     * @return
     */
    public java.util.List<Product> browse(Category cat) {
        return null;
    }

}
