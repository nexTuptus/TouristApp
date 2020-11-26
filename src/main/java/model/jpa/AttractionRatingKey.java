package model.jpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class AttractionRatingKey implements Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "attraction_id")
    private Long attractionId;

    public AttractionRatingKey() {
    }

    public AttractionRatingKey(Long studentId, Long attractionId) {
        this.userId = studentId;
        this.attractionId = attractionId;
    }
}
