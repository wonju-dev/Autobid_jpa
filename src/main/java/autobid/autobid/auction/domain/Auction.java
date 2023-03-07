package autobid.autobid.auction.domain;

import autobid.autobid.bid.domain.Bid;
import autobid.autobid.car.domain.Car;
import autobid.autobid.user.domain.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auction_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @OneToMany(mappedBy = "auction")
    private List<Bid> bids;

    @OneToMany(mappedBy = "auction")
    private List<Image> images;

    @Column(name = "auction_start_at")
    private LocalDateTime startAt;

    @Column(name = "auction_end_at")
    private LocalDateTime endAt;

    @Column(name = "auction_start_price")
    private Long startPrice;

    @Column(name = "auction_end_price")
    private Long endPrice;
}
