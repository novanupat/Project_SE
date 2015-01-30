package sut.se.project.domain;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.junit.runner.RunWith;
import javax.persistence.TypedQuery;
import static org.junit.Assert.*;
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext*.xml")

public class ReceiverTest {

    @Test
    public void truePhonenumber() {
        Receiver receiver = new Receiver();
        receiver.setPhonenumber("0812345678");
        receiver.persist();
    }

    @Test
    public void truePhonenumber2() {
        Receiver receiver = new Receiver();
        receiver.setPhonenumber("0901234567");
        receiver.persist();
    }

    @Test
    public void falsePhonenumber() {
        Receiver receiver = new Receiver();
        receiver.setPhonenumber("99999");

        try{
            receiver.persist();
            fail("Please Enter Phonenumber again. Ex:0912345678");
        }catch(javax.validation.ConstraintViolationException n){
           
        }
    }

    @Test
    public void falsePhonenumber2() {
        Receiver receiver = new Receiver();
        receiver.setPhonenumber("123456789");

        try{
            receiver.persist();
            fail("Please Enter Phonenumber again. Ex:0912345678");
        }catch(javax.validation.ConstraintViolationException n){
           
        }
    }

    @Test
    public void truePostcode(){
        Receiver receiver = new Receiver();
        receiver.setPostcode("30000");
        receiver.persist();
    }

    @Test
    public void truePostcode2(){
        Receiver receiver = new Receiver();
        receiver.setPostcode("41220");
        receiver.persist();
    }

    @Test
    public void falsePostcode(){
        Receiver receiver = new Receiver();
        receiver.setPostcode("123456");

        try{
            receiver.persist();
            fail("Please Enter Postcode again. Ex:12345 ");
        }catch(javax.validation.ConstraintViolationException n){
           

        }      
    }

    @Test
    public void falsePostcode2(){
        Receiver receiver = new Receiver();
        receiver.setPostcode("16");

        try{
            receiver.persist();
            fail("Please Enter Postcode again. Ex:12345 ");
        }catch(javax.validation.ConstraintViolationException n){
           

        }      
    }
}
