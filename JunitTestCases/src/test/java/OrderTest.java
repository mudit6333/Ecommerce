import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    public static final int QUANTITY = 10;
    public static final int PRICE = 200000;
    public static final String ITEM_NAME = "laptop";
    public static final double PRICE_WITH_TEX = 214000.0;

    Order order=new Order();
    @Test
    void getQuantity() {
        order.setQuantity(QUANTITY);
        assertEquals(QUANTITY,order.getQuantity());
    }

    @Test
    void getItemName() {
        order.setItemName(ITEM_NAME);
        assertAll(
                ()->assertEquals(ITEM_NAME,order.getItemName()),
                ()->assertNotEquals("Mobile",order.getItemName())
        );
    }

    @Test
    void getPrice() {
        order.setPrice(PRICE);
        assertEquals(PRICE,order.getPrice());
    }


    @Test
    void getPriceWithTex() {
        order.setPriceWithTex(PRICE_WITH_TEX);
        assertAll(
                ()->assertEquals(PRICE_WITH_TEX,order.getPriceWithTex()),
                ()->assertNotEquals(200000,order.getPriceWithTex())
        );
    }
}