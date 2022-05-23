package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){
        // Logging
        // Authentication and Authorization
        // Sanitize the data
        System.out.println("Checkout Method from ShoppingCard Called");
    }

    public int quantity(){
        return 2;
    }
}
