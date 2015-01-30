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

public class Evaluate2Test {

    private Evaluate2 evaluate2 = new Evaluate2();

    @Test
    public void testcorrect(){
    	Evaluate2 e = new Evaluate2();
    	e.setRegular(20);
    	e.setExpress(100);
    	e.persist();
    }
}
