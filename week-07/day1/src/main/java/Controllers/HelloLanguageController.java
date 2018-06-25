package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class HelloLanguageController {

  @RequestMapping("/language")
  public String  greeting(Model model){
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag",
                                                "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
              "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
            "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá",
            "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String language = hellos[(int) (Math.random() * hellos.length)];

    model.addAttribute("language", language );
    model.addAttribute("rgbR",(int)(Math.random() * 256));
    model.addAttribute("rgbG",(int)(Math.random() * 256));
    model.addAttribute("rgbB",(int)(Math.random() * 256));
    model.addAttribute("size",(int)(Math.random() * 100));

    return "language";
  }
}
