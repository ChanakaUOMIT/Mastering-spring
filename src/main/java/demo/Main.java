package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context
                = new AnnotationConfigApplicationContext(BeanConfig.class);
//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();
//
//        Nurse nurse =(Nurse)  context.getBean("nurse");
//        nurse.assist();

//        Doctor staff =context.getBean(Doctor.class);
//        staff.assist();
//
//        Nurse nurse =context.getBean(Nurse.class);
//        nurse.assist();

//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();
//        doctor.setQualification("MBBS");
//        System.out.println(doctor);
//
//        Doctor doctor1 = context.getBean(Doctor.class);
//        doctor1.assist();
//        System.out.println(doctor1);


        // ShoppingCart App

        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout();

    }
}
