package com.example.Lecia13.controller;

import com.example.Lecia13.controller.service.PhoneService;
import model.Phone;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyFirstController {

private  final PhoneService phoneService;

    public MyFirstController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }





    @GetMapping("/hello")
    public String sayHello (@RequestParam("name")String name){return "Hello" +name;}

    @PostMapping ("/create-phone/")
    public Phone CretePhone(@RequestBody Phone phone){
       phoneService.createPhone(phone);
        return phone;
    }

    @DeleteMapping ("/delete-phone/{phoneIndex}")
    public void deletePhone(@PathVariable ("phoneIndex") int index) {
        phoneService.deletePhone(index);
    }

    @PutMapping("/update-phone/{phoneIndex}")
    public Phone updatePhone(@PathVariable("phoneInex") Integer index, @RequestBody Phone phone) {
        return phoneService.updatePhone (index, phone);
        }

        @GetMapping("/get-phone/{phoneIndex}")
    public Phone getPhone(@PathVariable("phoneIndex") Integer phoneIndex) {
            return phoneService.getPhone(phoneIndex);
        }

    @GetMapping("/get-phone/")
    public  List<Phone> getPhone() {
        return phoneService.getPhones();
    }

}

