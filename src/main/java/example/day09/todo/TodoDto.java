package example.day09.todo;


import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TodoDto {

    private int tno;
    private String tcontent;
    private int tstate;

}
