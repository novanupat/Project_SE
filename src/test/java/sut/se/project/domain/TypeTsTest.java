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

public class TypeTsTest {


    @Test
    public void TestPersist() {

        TypeTs t1 = new TypeTs();
        t1.setType("Train");
        t1.setExPrice("500");
        t1.persist();

    }

     @Test
    public void TestNoType() {

        TypeTs t1 = new TypeTs();
        t1.setExPrice("200");
        try{
            t1.persist();
            fail("Shoud not Type");
        }catch(javax.validation.ConstraintViolationException e){
            //
       }
   }

    @Test
    public void TestNoPrice() {

        TypeTs t1 = new TypeTs();
        t1.setType("Train");
        try{
            t1.persist();
            fail("Shoud not Type");
        }catch(javax.validation.ConstraintViolationException e){
            //
       }

    }
    
    @Test
    public void TestNull() {
        TypeTs t1 = new TypeTs();
        try{
            t1.persist();
            fail("Shoud not Null");
        }catch(javax.validation.ConstraintViolationException e){
            //
        }
    }

}
