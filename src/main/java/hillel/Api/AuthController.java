package hillel.Api;

import com.google.gson.Gson;
import hillel.entities.Auth;
import okhttp3.*;
import java.io.IOException;




//post/api/auth/signup  in  BaseTestApi
//post/api/auth/signin
public class AuthController {
    public Auth signIn(Auth auth) throws IOException {
        Gson gson = new Gson();
        RequestBody body = RequestBody.create(gson.toJson(auth), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://freelance.lsrv.in.ua/api/auth/signin")
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        assert response.body() != null;
        Auth authResp = gson.fromJson(response.body().string(), Auth.class);
        auth.setToken(authResp.getToken());
        return auth;
    }

}
