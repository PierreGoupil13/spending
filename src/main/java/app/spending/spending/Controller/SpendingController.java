package app.spending.spending.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.spending.spending.Entity.Category;
import app.spending.spending.Entity.Spending;
import app.spending.spending.Repository.SpendingRepository;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/spending")
public class SpendingController {
    @Autowired
    private SpendingRepository spendingRepository;

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("spending", new Spending());
        model.addAttribute("categories", Category.values());
        return "add-spending";
    }

    @PostMapping("/add")
    public String addSpending(@ModelAttribute Spending spending) {
        spendingRepository.save(spending);
        return "redirect:/spending/add?success";
    }

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("spendings", spendingRepository.findAll());
        return "list-spending";
    }
}
