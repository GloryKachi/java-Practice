package chapter3Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedAccountTest {
    ModifiedAccount modifiedAccount;

   @BeforeEach
    public void setUp(){
        modifiedAccount = new ModifiedAccount("Glory Kachi",4000);
    }

    @Test
    public void checkThatObjectExist(){
       assertNotNull(modifiedAccount);
    }

    @Test
    public void deposit(){

       assertEquals(4800,modifiedAccount.deposit(4000,800));
    }
    @Test
    public void withdraw(){
       //given i have money in the account
        //when i withdraw
        modifiedAccount.withdraw(2000);
        //check that balance has reduced

       assertEquals(2000,modifiedAccount.getBalance());
    }

}