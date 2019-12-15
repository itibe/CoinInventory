package coin.coininventory;

import coin.coininventory.entity.Coin;
import coin.coininventory.entity.User;
import coin.coininventory.entity.Vendor;
import coin.coininventory.repo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Optional;

@SpringBootTest
public class DatabaseTest {

    @Autowired
    CoinLocationRepo coinLocationRepo;
    @Autowired
    CoinRepo coinRepo;
    @Autowired
    CoinTypeRepo coinTypeRepo;
    @Autowired
    ImageRepo imageRepo;
    @Autowired
    LocationDependencyRepo locationDependencyRepo;
    @Autowired
    LocationRepo locationRepo;
    @Autowired
    SubLocationRepo subLocationRepo;
    @Autowired
    TransactionRepo transactionRepo;
    @Autowired
    TransactionTypeRepo transactionTypeRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    VendorRepo vendorRepo;





    @Test
    void addUser(){
        User user = new User();
        user.setUserName("test");
        user.setPassword("test");

        userRepo.save(user);

        User databaseUser = userRepo.findById(user.getUserid()).orElseThrow(() -> new IllegalArgumentException("Unable to find user id" + user.getUserid()));

        Assert.isTrue(user.getUserName() == databaseUser.getUserName(), "Unable to look up user");

    }
}
