package app.controller;

import app.model.User;
import app.service.UserService;
import app.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    //Страница со всеми пользователями
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("users" , userService.getAll());
        return "users";
    }

    //Форма создания пользователя
    @GetMapping("/save")
    public String saveUser(Model model) {
        model.addAttribute("user", new User());
        return "save";
    }

    //Отправка формы
    @PostMapping()
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/users/";
    }

    //Обновление пользователя
    @GetMapping("/update")
    public String editUser(@RequestParam int id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "update";
    }

    //Отправка формы обновления
    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") User user, @RequestParam int id) {
        userService.update(user, id);
        return "redirect:/users/";
    }

    //Окно всплытия удаление пользователя
    @GetMapping("/delete")
    public String deleteUserWindow(@RequestParam int id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "delete";
    }

    //Удаление пользователя
    @PostMapping("/delete")
    public String deleteUser(@RequestParam int id) {
        userService.delete(id);
        return "redirect:/users/";
    }
}
