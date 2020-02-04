package coin.coininventory;

import coin.coininventory.entity.*;
import coin.coininventory.repo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.List;
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

        userRepo.delete(user);

        Assert.isTrue(user.getUserName().equals(databaseUser.getUserName()), "Unable to look up user");

    }

    @Test
    void addVendor(){
        Vendor vendor = new Vendor();
        User user = new User();
        user.setUserName("test");
        user.setPassword("test");

        userRepo.save(user);

        vendor.setUser(user);
        vendor.setVendor("testvendor");

        vendorRepo.save(vendor);

        Vendor databaseVendor = vendorRepo.findById(vendor.getSourceid()).orElseThrow(() -> new IllegalArgumentException());
        vendorRepo.delete(vendor);
        userRepo.delete(user);


        Assert.isTrue(vendor.getVendor().equals(databaseVendor.getVendor()));

    }

    @Test
    void addTransaction(){
        User user = new User();
        user.setUserName("test1");
        user.setPassword("test1");

        userRepo.save(user);

        Vendor vendor = new Vendor();
        vendor.setUser(user);
        vendor.setVendor("testvendor");

        vendorRepo.save(vendor);

        CoinType coinType = new CoinType();
        coinType.setUser(user);
        coinType.setCointype("testcointype");

        coinTypeRepo.save(coinType);

        TransactionType transactionType = new TransactionType();
        transactionType.setTransaction("buy");
        transactionType.setUser(user);

        transactionTypeRepo.save(transactionType);

        Coin coin = new Coin();

        coin.setGrade("grade");
        coin.setMintmark("p");
        coin.setType(coinType);
        coin.setUser(user);
        coin.setYear(2014);

        coinRepo.save(coin);

        Transaction tran = new Transaction();
        tran.setCoin(coin);
        tran.setUser(user);
        tran.setVendor(vendor);
        tran.setTransactionType(transactionType);


        tran.setDate(LocalDate.now());
        transactionRepo.save(tran);

        Coin listfromserver = coinRepo.findById(coin.getCoindataid()).orElseThrow(()->new IllegalArgumentException());

        Assert.isTrue(!listfromserver.getTransactionList().isEmpty(),"");

    }
}
