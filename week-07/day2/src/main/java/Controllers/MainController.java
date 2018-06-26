package Controllers;

import Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

@GetMapping("/show")
  public String show(Model model){
  BankAccount bankAccount = new BankAccount("Symba", 2000, "lion");
  model.addAttribute("animal", bankAccount);
  return "show";
}
}
