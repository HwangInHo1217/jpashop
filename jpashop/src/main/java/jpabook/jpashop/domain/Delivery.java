package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Delivery {
    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;
    @Embedded
    private Adress adress;
    @Enumerated(EnumType.STRING)
    private DelivertStatus status;
}
