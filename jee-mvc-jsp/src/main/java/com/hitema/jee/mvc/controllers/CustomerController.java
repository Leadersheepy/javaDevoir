package com.hitema.jee.mvc.controllers;

import com.hitema.jee.mvc.entities.Country;
import com.hitema.jee.mvc.entities.Customer;
import com.hitema.jee.mvc.services.CustomerService;
import jakarta.annotation.PostConstruct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;
@Controller
public class CustomerController {
    private static final Logger log = LogManager.getLogger(com.hitema.jee.mvc.controllers.CustomerController.class);

    private CustomerService service;

    public CustomerController(CustomerService service) {
            this.service = service;
        }
        @PostConstruct
        private void check() {
            log.info("Check postconstruct called service Up : "+(service!=null?"Yes":"No"));
        }


        @GetMapping("/customers")
        public ModelAndView getCustomers() {
            log.trace("Appel controlleur Customer");
            List<Customer> customers = service.readAll();
            return new ModelAndView("customers","customers",customers);
        }

    }


