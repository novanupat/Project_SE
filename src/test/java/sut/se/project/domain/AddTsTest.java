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


public class AddTsTest {

    @Test
    public void TestPersist() {

        AddTs a1 = new AddTs();
        a1.setTypeN("Train");
        a1.setPriceT("500");
        a1.persist();

    }

    @Test
    public void TestNoType() {

        AddTs a1 = new AddTs();
        a1.setPriceT("200");
        try{
            a1.persist();
            fail("Shoud not Type");
        }catch(javax.validation.ConstraintViolationException e){
            //
       }

    }

     @Test
    public void TestNoPrice() {

        AddTs a1 = new AddTs();
        a1.setPriceT("Train");
        try{
            a1.persist();
            fail("Shoud not Type");
        }catch(javax.validation.ConstraintViolationException e){
            //
       }

    }

    @Test
    public void TestNull() {
        AddTs a1 = new AddTs();
        try{
            a1.persist();
            fail("Shoud not Null");
        }catch(javax.validation.ConstraintViolationException e){
            //
        }
    }

    @Test
    public void TestLongNumber() {
        AddTs a1 = new AddTs();
        a1.setTypeN("Train");
        a1.setPriceT("20000000");
        try{
            a1.persist();
            fail("Shoud not Long");
        }catch(javax.validation.ConstraintViolationException e){
           //
        }
    }
}
