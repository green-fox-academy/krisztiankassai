package Controllers;

import Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.provider.NativePRNG;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

  private List<BankAccount> accounts;

@GetMapping("/show")
  public String show(Model model){
  BankAccount bankAccount = new BankAccount("Symba", 2000, "lion", true, true);
  model.addAttribute("animal", bankAccount);
  return "show";
}
@GetMapping("/test")
  public String test(Model model){
  model.addAttribute("test", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
  return "test";
}
@GetMapping("/list")
  public String list(Model model){
  accounts = new ArrayList<>();
  accounts.add(new BankAccount("Zazu", 100, "bird",false, true));
  accounts.add(new BankAccount("Mufasa", 100000, "lion",true, true));
  accounts.add(new BankAccount("Symba", 5000, "lion",true, true));
  accounts.add(new BankAccount("Timon", 50, "meerkat", false, true));
  accounts.add(new BankAccount("Scar", 0, "warthog", false, false));
  model.addAttribute("accounts", accounts);
  model.addAttribute("King","King");
  model.addAttribute("notKing", "Not King");
  model.addAttribute("isGood","Good Guy");
  model.addAttribute("notGood", "Bad Guy");
  return "list";
}
  @PostMapping("list")
  public String register(@ModelAttribute BankAccount account) {
    accounts.add(account);
    return "list";
  }
 public void raise(BankAccount bankAccount){
  if (bankAccount.isKing()){
    bankAccount.setBalance(bankAccount.getBalance() + 100);
  }else{
    bankAccount.setBalance(bankAccount.getBalance() + 10);
  }
 }
}
