package com.controller;

import com.domain.Order;
import com.service.OrderService;
import com.service.OrderServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ejb.Local;
import java.util.List;
import java.util.Locale;

@Controller
public class OrderController {

    private OrderService orderService = new OrderServiceImplementation();
    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getOrderPage(Locale locale, Model model)
    {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orderList",orders);
        String homePageWelcomeMessage = messageSource.getMessage("order.welcome", null,locale);
        model.addAttribute("message", homePageWelcomeMessage);

        // obtain locale from LocaleContextHolder
        Locale currentLocale = LocaleContextHolder.getLocale();
        model.addAttribute("locale", currentLocale);
        return "order";
    }

    @RequestMapping(value = "/addNewOrder", method = RequestMethod.GET)
    public String addNewOrderPage(){
        return "addOrder";
    }

    @RequestMapping(value = "/addNewOrder", method = RequestMethod.POST)
    public String addNewOrder(@RequestParam(value = "title") String title,
                              @RequestParam(value = "price") Double price){
        Order order = new Order();
        order.setTitle(title);
        order.setPrice(price);
        orderService.save(order);
        return "redirect:/";

    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id){
        Order order = orderService.getById(id);
        orderService.delete(order);
        return "redirect:/";
    }

}