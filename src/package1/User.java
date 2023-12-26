package package1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String country;
}
