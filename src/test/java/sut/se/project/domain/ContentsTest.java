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

public class ContentsTest {

    private Contents contents = new Contents();
    
    @Test
    public void tetsCorrect(){
    	Contents contents = new Contents();
    	contents.setCo("Document");
    	contents.setHc("12");
    	contents.setLc("12");
    	contents.setWc("12");
    	contents.setWe("12");
    	contents.persist();
    }
    
    @Test
    public void testSizemax(){
    	Contents contents = new Contents();
    	contents.setHc("1234");
    	contents.setLc("1234");
    	contents.setWc("1234");
    	contents.setWe("1234");
    	try{
    		contents.persist();
    		fail(" Size max");
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    
    @Test
    public void testNotNumbet(){
    	Contents contents = new Contents();
    	contents.setHc("aaa");
    	contents.setLc("bbb");
    	contents.setWc("ccc");
    	contents.setWe("ddd");
    	try{
    		contents.persist();
    		fail(" Not number");
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    
    @Test
    public void testContentsSizemax(){
    	Contents contents = new Contents();
    	contents.setCo("Documents123456789101");
    	try{
    		contents.persist();
    		fail(" Not number");
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    
    @Test
    public void testNotNumbetSizemax(){
    	Contents contents = new Contents();
    	contents.setHc("aaaa");
    	contents.setLc("bbba");
    	contents.setWc("ccca");
    	contents.setWe("ddda");
    	try{
    		contents.persist();
    		fail(" Not number");
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    

}
