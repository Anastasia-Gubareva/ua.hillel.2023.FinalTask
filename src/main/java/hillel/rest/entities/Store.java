package hillel.rest.entities;
import lombok.*;

@Data
public class Store {

    private Integer id;
    private Integer petId;
    private Integer quantity;
    private String shipDate;
    private String status;
    private Boolean complete;

}