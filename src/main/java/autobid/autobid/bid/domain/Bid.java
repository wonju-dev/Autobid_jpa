package autobid.autobid.bid.domain;

import autobid.autobid.auction.domain.Auction;
import autobid.autobid.user.domain.User;
import jakarta.persistence.*;

@Entity
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bid_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;

    @Column(name = "bid_price")
    private Long price;
}
