package hillel.Api;


import com.google.gson.Gson;
import hillel.entities.Auth;
import hillel.entities.Comment;
import okhttp3.*;


import java.io.IOException;

public class CommentController {

    //post/api/comment/jobId/create
    public Comment createComment(Auth auth, Comment comment, String jobId) throws IOException {
        Gson gson = new Gson();
        RequestBody body = RequestBody.create(gson.toJson(comment), MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .post(body)
                .url("https://freelance.lsrv.in.ua/api/comment/" + jobId + "/create")
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        assert response.body() != null;
        Comment newComment = new Gson().fromJson(response.body().string(), Comment.class);
        return newComment;
    }

    //  get/api/comment/jobId/all
    public Comment[] getCommentAll(Auth auth, String jobId) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/comment/" + jobId + "/all")
                .header("Authorization", auth.getToken())
                .build();
        Response response = new OkHttpClient().newCall(request).execute();
        assert response.body() != null;
        Comment[] comments = new Gson().fromJson(response.body().string(), Comment[].class);
        return comments;
    }

}
