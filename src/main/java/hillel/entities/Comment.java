package hillel.entities;

import lombok.Data;

@Data
public class Comment {
    private String id;
    public String message;
    public String username;
    public String commentDate;
}
