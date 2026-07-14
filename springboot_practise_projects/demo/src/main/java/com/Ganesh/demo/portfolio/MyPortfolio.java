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
                <h1>Technical Skills</h1>
                <ul>
                <l1>Java</l1>
                <l1>C</l1>
                <l1>Java Script</l1>
                <l1>Spring Boot</l1>
                <l1>Spring mvc</l1>
                <l1>Spring Data Jpa</l1>
                <l1>React</l1>
                <l1>Sklearn</l1>
                <l1>Tensorflow</l1>
                <l1>Power Bi</l1>
                
                </ul>
                """;
    }
    @GetMapping("/edu")
    public String education(){
        return """
                <p>I Completed my class 10 and my intermediate in my home town which is in Tadipatri Ananthapur District AndhraPradesh
                </p>
                <p>Currently i am studying B Tech Final Year from Lovely Professional University Punjab</p>
                """;
    }
    @GetMapping("/Projects")
    public String projects(){
        return """
        <p>I Build Projects releated to data science and machine learning One of them is Crop Recommendation System 
        in which i trained machine learning and deep learining with around 5k records</p>
        <p>Another Project in which i created Notes Sharing website Complete website i used html css java script react is used to build froentend for backend i used spring frame work</p>
                """;
    }
}
