package softeer.tenten.entity.area;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import softeer.tenten.entity.popup.Popup;
import softeer.tenten.entity.vote.Vote;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "option")
public class Option {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "popup_id")
    private Popup popup;

    @OneToMany(mappedBy = "option", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Vote> votes = new ArrayList<>();
}
