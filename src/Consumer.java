/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hossam Khair
 */
public class Consumer extends Customer {

    /**
     *
     * @param cart
     */
    public Consumer(ShoppingCart cart) {
        super(cart);
    }

    @Override
    public void buy(Product product) {
        super.buy(product); //To change body of generated methods, choose Tools | Templates.
    }

}
