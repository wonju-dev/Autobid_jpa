package autobid.autobid.user.domain;

import autobid.autobid.auction.domain.Auction;
import autobid.autobid.car.domain.Car;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<Car> cars = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Auction> auctions;

    @Column(name = "user_userId")
    private String userId;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_phone_number")
    private String phoneNumber;

    @Column(name = "user_refresh_token")
    private String refreshToken;
}
