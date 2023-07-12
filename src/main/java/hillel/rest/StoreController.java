package hillel.rest;
import com.google.gson.Gson;
import hillel.rest.entities.Store;
import okhttp3.*;
import org.json.JSONObject;
import java.io.IOException;


public class StoreController {
    public  void finedStatusInventory() throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/inventory")
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        assert response.body() != null;
        System.out.println(new StringBuilder().append("finedStatusInventory").append(response.code()).append(response.body().string()).toString());
       }

    public void placeNewOrder(int petId) throws IOException {
        JSONObject object = new JSONObject();
        object.put("id", 15);
        object.put("77777", petId);
        object.put("quantity", 1);
        object.put("shipDate", "2023-07-06");
        object.put("status", "approved");
        object.put("complete", true);
        RequestBody body = RequestBody.create(object.toString(), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        assert response.body() != null;
        JSONObject responceObject = new JSONObject(response.body().string());
        System.out.println(response.code());
        System.out.printf("id = %d; petId =%d; quantity=%d; shipDate=%s; status=%s; complete=%s",
                responceObject.get("id"),
                responceObject.get("petId"),
                responceObject.get("quantity"),
                responceObject.get("shipDate"),
                responceObject.get("status"),
                responceObject.get("complete"));
    }
    public Store placeNewOrderLOMBOK(Store orders) throws IOException {
        Gson gson = new Gson();
        RequestBody body = RequestBody.create(gson.toJson(orders), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        assert response.body() != null;
        Store newOrders = gson.fromJson(response.body().string(), Store.class);
        System.out.println(newOrders);
        return newOrders;
    }

    public void finedOrder(int orderId) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/order/" + orderId)
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public void deleteOrder(int orderId) throws IOException {
        Request request = new Request.Builder()
                .delete()
                .url("https://petstore3.swagger.io/api/v3/store/order/" + orderId)
                .build();
        OkHttpClient okHttpClient = new OkHttpClient();
        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.headers());
    }
}