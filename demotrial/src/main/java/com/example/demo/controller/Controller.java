package com.example.demo.controller;

import org.springframework.web.bind.annotation.*; //spring mvc annotation.
/**very basic rest api**/

@RestController //annotates that this file is the controller.
@RequestMapping(path = "/FirstDemo") //first line of path after the end point api url.
                                     //ours is "localhost:4321"

public class Controller {
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
