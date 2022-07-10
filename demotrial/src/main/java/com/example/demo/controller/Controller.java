package com.example.demo.controller;

import org.springframework.web.bind.annotation.*; //spring mvc annotation.

import java.util.Arrays;
import java.util.List;

/**very basic rest api**/

@RestController //annotates that this file is the controller.
 //first line of path after the end point api url.
                                     //ours is "localhost:4321"
@RequestMapping(path  = "/FirstDemo")
public class Controller {

    @RequestMapping(path = "/students")
    public @ResponseBody List<Student> listOfStudents(){
        //List<Student> gets automatically converted to an array of json when we hit the url
        // "localhost:4321/FirsDemo/students"
        return Arrays.asList(
                new Student("dhruv" , 35 , "bciit" , 21),
                new Student("rohan" , 37 , "jims" , 21),
                new Student("chirag" , 36 , "vips" , 23)
        );
    }


    @GetMapping(path = "/get") //@GetMapping is to tell that this function is going to be used for get http request.
    public @ResponseBody //return type/body of the get method is a string.
    String getString(@RequestBody String str){ //@requestbody tells that the input to our get method will be string
        System.out.println("get print statement " + str);
        return str + " get method is called";

    }


    @PostMapping(path = "/post") //@postmapping is to tell that it'll be used for post request.
    public @ResponseBody
    String postString(@RequestBody String str){
        System.out.println("post print statement " +str);
        return str + " post method is called";
    }
}
