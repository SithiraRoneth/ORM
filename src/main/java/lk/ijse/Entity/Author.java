/* Created By Sithira Roneth
 * Date :2/13/24
 * Time :11:51
 * Project Name :ORM _Supplementary
 * */
package lk.ijse.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table

public class Author {
    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Book>bookList;
}
