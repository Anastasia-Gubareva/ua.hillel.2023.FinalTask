package tests.Api;

import hillel.Api.CommentController;
import hillel.Api.JobController;
import hillel.Api.UserController;
import hillel.entities.Comment;
import hillel.entities.Job;
import hillel.entities.User;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Arrays;

public class ApiTest extends BaseTestApi {
    private static String jobId = String.valueOf(1);
    @Test(priority = 10)
    public void SingIn() throws IOException {
        Assert.assertFalse(StringUtils.isEmpty(auth.getToken()), "Token missing");
    }
    @Test (priority = 20)
    public void postUserUpdate() throws IOException {
        UserController userController = new UserController();
        User user = new User();
        user.setId("555");
        user.setName("My test");
        user.setUsername("Nastya");
        user.setLastname("Nastya test");
        Response response = userController.updateUser(auth, user);
        Assert.assertEquals(response.code(), 200);
        System.out.println("postUserUpdate " + response.code() );
    }
    @Test (priority = 30)
    public void getUserInfo() throws IOException {
        UserController userController = new UserController();
        Response response = userController.userInfo(auth);
        System.out.println("getUserInfo  "  + response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test (priority = 40)
    public void getFindUserId() throws IOException {
        UserController userController = new UserController();
        Response response = userController.finedUserId(auth, 20);
        System.out.println("getFindUserId  " + response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test(priority = 50)
    public void createJob() throws IOException {
        JobController jobController = new JobController();
        Job job = new Job();
        job.setTitle("My new jod QA");
        job.setDescription("manual testing, automation ui and app");
        job.setPrice("55555.0");
        Job newJob = jobController.createJob(auth, job);
        job.setId(newJob.getId());
        jobId = newJob.getId();
        Assert.assertEquals(job.getDescription(), newJob.getDescription());
        Assert.assertEquals(job.getTitle(), newJob.getTitle());
        Assert.assertEquals(job.getPrice(), newJob.getPrice());
        System.out.println("createJob " );
    }
    @Test(priority = 51)
    public void deleteJob() throws IOException{
        JobController jobController = new JobController();
        Job job = new Job();
        job.setDescription("manual testing, automation ui and app");
        job.setTitle("My new jod QA");
        Response response = jobController.deleteJobId(auth, jobId);
        System.out.println("deleteJob " + response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test(priority = 60)
    public void getId() throws IOException {
        JobController jobController = new JobController();
        Response response = jobController.getJobId(auth, 3);
        System.out.println("getId  " + response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test (priority = 70)
    public void getUserJobs() throws IOException {
        JobController jobController = new JobController();
        Response response = jobController.getUserJobs(auth);
        System.out.println("getUserJobs " + response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test (priority = 80)
    public void getJobsAll() throws IOException {
        JobController jobController = new JobController();
        Response response = jobController.getJobsAll(auth);
        System.out.println("getJobsAll " + response.code());
        Assert.assertEquals(response.code(), 200);
    }
    @Test (priority = 11)
    public void createComment() throws IOException {
        CommentController commentController = new CommentController();
        Comment comment = new Comment();
        comment.setUsername("Nastya");
        comment.setMessage("Create comment for job");
        Comment newComment = commentController.createComment(auth, comment, jobId);
        Assert.assertEquals(newComment.getMessage(), comment.getMessage());
    }
    @Test (priority = 12)
    public void getCommentAll() throws IOException {
        CommentController commentController = new CommentController();
        Comment[] comments = commentController.getCommentAll(auth, jobId);
        Assert.assertTrue(comments.length > 0, "no comments at the moment");
        System.out.println(Arrays.toString(comments));
    }
}
