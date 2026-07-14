package com.Ganesh.demo.portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {
    @GetMapping("/myself")
    public String Myself(){
        return """
         <h1>I am Ganesh</h1>
        <p>I am from Andhra Pradesh</p>
        <ul>
        <l1>Github Link: https://github.com/Ganesh9346</l1>
        <l1>LeethCode Link: https://leetcode.com/u/8oF2mvGWYZ/</l1>
        """;
    }
    @GetMapping("/skills")
    public String skills(){
        return """
                <h3>I am Good at Building Backend Developemnt using spring and spring boot framework</h3>
                <h3>I know Programming languages such as C,Java,Java Script</h3>
                <h3>Further more i am also good at building machine learning and deep learning models using sklearn tensorflow libraries</h3>
                """;
    }
}
