package hillel.entities;


import lombok.Data;

@Data
public class Job {
    private String id;
    private String title;
    private String description;
    private String price;
    private String user;
    private String noOfComments;
}
