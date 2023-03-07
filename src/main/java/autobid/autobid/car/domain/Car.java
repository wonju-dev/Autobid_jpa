package autobid.autobid.car.domain;

import autobid.autobid.user.domain.User;
import jakarta.persistence.*;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue
    @Column(name = "car_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_status")
    private CarStatus carStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "car_type")
    private CarType type;

    @Column(name = "car_driving_distance")
    private Long drivingDistance;

    @Column(name = "car_carId")
    private String carId;

    @Column(name = "car_name")
    private String name;

    @Column(name = "car_sellName")
    private String sellName;
}
