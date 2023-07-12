package tests.rest;
import hillel.rest.StoreController;
import hillel.rest.entities.Store;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
public class StoreRestTests {
    @Test (priority = 30)
    public void finedStatusInventory() throws IOException {
        StoreController storeController = new StoreController();
        storeController.finedStatusInventory();

    }

    @Test (priority = 10)
    public void placeNewOrder() throws IOException {
        StoreController storeController = new StoreController();
        storeController.placeNewOrder(77);
    }

    @Test (priority = 20)
    public void placeNewOrderWhitLOMBOK() throws IOException {
        Store ordersLOMBOK = new Store();
        ordersLOMBOK.setId(10);
        ordersLOMBOK.setPetId(1);
        ordersLOMBOK.setQuantity(2);
        ordersLOMBOK.setComplete(true);
        ordersLOMBOK.setStatus("approved");
        StoreController storeController = new StoreController();
        Store checkResult = storeController.placeNewOrderLOMBOK(ordersLOMBOK);
        Assert.assertEquals(checkResult, ordersLOMBOK);
    }

    @Test  (priority = 40)
    public void finedOrderByID() throws IOException {
        StoreController storeController = new StoreController();
        storeController.finedOrder(10);
    }

    @Test (priority = 50)
    public void deleteOrder() throws IOException {
        StoreController storeController = new StoreController();
        storeController.deleteOrder(10);
    }
}