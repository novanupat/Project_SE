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

public class EvaluateTest {

    private Evaluate evaluate = new Evaluate();

    @Test
    public void test(){
    	Evaluate a = new Evaluate();
    	a.setShipref("ABC1234");
    	a.persist();
    }
    
    @Test
    public void testSizemax(){
    	Evaluate a = new Evaluate();
    	a.setShipref("A12345678");
    	try{
    		a.persist();
    		fail(" Maximum");
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
}
