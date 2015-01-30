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

public class RegisterformTest {

    @Test
    public void trueCompanyPhone() {
        Registerform register = new Registerform();
        register.setCompanyphone("0441234561");
        register.persist();
    }

    @Test
    public void trueCompanyPhone2() {
        Registerform register = new Registerform();
        register.setCompanyphone("0911372909");
        register.persist();
    }

    @Test
    public void falseCompanyPhone() {
        Registerform register = new Registerform();
        register.setCompanyphone("333333333");

        try{
            register.persist();
            fail("Please Enter CompanyPhone again. Ex:0987654321");
        }catch(Exception n){
           System.out.println(n.getClass());
        }
    }

    @Test
    public void falseCompanyPhone2() {
        Registerform register = new Registerform();
        register.setCompanyphone("11223344");
        try{
            register.persist();
            fail("Please Enter CompanyPhone again. Ex:0987654321");
        }catch(javax.validation.ConstraintViolationException n){
           
        }
    }

    @Test
    public void truePostcode() {
        Registerform register = new Registerform();
        register.setPostcode("21120");
        register.persist();
    }

    @Test
    public void truePostcode2() {
        Registerform register = new Registerform();
        register.setPostcode("30000");
        register.persist();
    }

    @Test
    public void falsePostcode() {
        Registerform register = new Registerform();
        register.setPostcode("1");
        try{
            register.persist();
            fail("Please Enter Postcode again. Ex:22222");
        }catch(javax.validation.ConstraintViolationException n){
           
        }
    }

    @Test
    public void falsePostcode2() {
        Registerform register = new Registerform();
        register.setPostcode("0000");
        try{
            register.persist();
            fail("Please Enter Postcode again. Ex:22222");
        }catch(javax.validation.ConstraintViolationException n){
           
        }
    }
    
}
