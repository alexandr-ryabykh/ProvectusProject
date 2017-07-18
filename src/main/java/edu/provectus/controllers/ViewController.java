package edu.provectus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    private static final String USER_LIBRARY_URL_NAME = "/user/library";
    private static final String USER_ORDER_URL_NAME = "/user/order";
    private static final String ADMIN_CONTROL_URL_NAME = "/admin/interface";

    @GetMapping(value = "/")
    public String viewMainPage() {
        return "redirect:/user/library";
    }

    @GetMapping(value = "/user/library")
    public String viewUserLibraryPage() {
        return "library";
    }

    @GetMapping(value = "/user/order")
    public String viewUserOrderPage() {
        return "order";
    }

    @GetMapping(value = "/admin/interface")
    public String viewAdminControlPage() {
        return "admin";
    }

}
