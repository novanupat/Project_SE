package sut.se.project.domain;

import org.junit.Test;

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

public class StatusTest {

    private Status status = new Status();


    @Test
    public void Statustest() {
       Status s = new Status();
       s.setPay("paid");
       s.setPos("To Do");
      // s.persist
       
    }

      @Test
    public void testNotPay() {
       Status s = new Status();
       s.setPay("");
       s.setPos("To Do");
       
        try {
            s.persist();
            fail("Should not Status of pay");
        }catch(javax.validation.ConstraintViolationException e) {
        
        }
      }


      @Test
    public void testNotPos(){
       Status s = new Status();
       s.setPay("paid");
       s.setPos("");

       try{
        s.persist();
        fail("Should not Position");
       }catch(javax.validation.ConstraintViolationException e){
        //System.out.println(e.getClass());
       }
     }
    
    @Test
    public void testNotPosPay(){
       Status s = new Status();
       s.setPay("");
       s.setPos("");

       try{
        s.persist();
        fail("Should not Position and Status of pay");
       }catch(javax.validation.ConstraintViolationException e){
        //System.out.println(e.getClass());
       }
     }


    }