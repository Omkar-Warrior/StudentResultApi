package com.oj.WecomeApi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String Welcome(){
        int a=10;
        int b=34;
        int c=a+b;
        return "Hello Students,Welcome To Ro Institute and Your addition is : "+c;
    }

    @GetMapping("/omkar")

    public String Marks(){
        String name="Omkar Rajendra Jaykar";
        String rn="CS4153";
        String college="DIEMS";
        String prn="2221141242056";
        int math=100,physics=67,bio=88,hindi=45,english=98,chemistry=99;
        int per=(math+physics+bio+hindi+english+chemistry)/6;

        return "Name : "+name+", "+"Roll Number : "+rn+", "+"College Name : "+college+", "+"PRN : "+prn+", "
                +"Mathematics Marks = "+math+", "
                +"BioLogy Marks = "+bio+", "
                +"Physics Marks = "+physics+", "
                +"Chemistry Marks = "+chemistry+", "
                +"Hindi Marks = "+hindi+", "
                +"English Marks = "+english+", "
                +"Percentage = "+per+"%"+" "+" "+"Omkar Jaykar is Pass";

    }

}
