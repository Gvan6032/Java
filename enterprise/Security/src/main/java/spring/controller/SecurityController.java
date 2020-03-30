package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class SecurityController {
    @GetMapping("/")
    //@RequestMapping(value={"/"},method= RequestMethod.GET)
    public String welcome(){
    //public ModelAndView welcomePage(){
        //ModelAndView model = new ModelAndView();
        //model.setViewName("welcome");
        return "welcome";
    }
    @GetMapping("/home")
    public String home(Principal principal) {
    //@RequestMapping(value={"/home"},method = RequestMethod.GET)
    //public ModelAndView homePage(){
       // ModelAndView model = new ModelAndView();
      //  model.setViewName("home");
        return "home";
    }
    @GetMapping("/login")
    public String login(){
    //@RequestMapping(value={"/login"}, method = RequestMethod.GET)
    //public ModelAndView loginPage(@RequestParam(value = "error", required = false) String error,
   // @RequestParam(value="logout", required = false) String logout){
        //ModelAndView model = new ModelAndView();
       // if(error!=null){
        //    model.addObject("error", "Invalid Credentials provided.");
       // }
        //if(logout!=null){
        //    model.addObject("message", "Logged out from JournalDEV successfully.");
        //}
        //model.setViewName("login");
        return "login";
    }
}
