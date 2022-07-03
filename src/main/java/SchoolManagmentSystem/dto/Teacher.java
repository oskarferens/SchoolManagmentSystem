package SchoolManagmentSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private int phone_nr;

}
