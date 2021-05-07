
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hossam Khair
 */
public class Order {

    private Date orderDate;
    private Date deliveryDate;
    private long orderNumber;
    private String orderLine;
    private String orderStatus;

    private List<Product> listOfProducts;

    /**
     *
     */
    private Order() {

    }

    /**
     *
     * @param product
     */
    public Order(Product product) {
        this();
    }

    /**
     *
     */
    public void submitOrder() {

    }
}
