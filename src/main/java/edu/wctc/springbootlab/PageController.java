package edu.wctc.springbootlab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class PageController {
    @GetMapping("view-cart")
    public String showCart() { return "/orders/cart"; }

    @PostMapping("place-order")
    public String redirectOrder() {return "redirect:/"; }

    @RequestMapping("/product/detail")
    public String showProductPage() { return "/catalog/product-detail"; }

    @RequestMapping("search")
    public String redirectGoogle() { return "redirect:http://www.google.com";}

    @RequestMapping("/")
    public String showHomePage() { return "index"; }

}
