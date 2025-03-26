package app.controller;

import app.dao.UserDaoHibernate;
import app.dao.UserDaoHibernateImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @Autowired
    private UserDaoHibernate userDao;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("users" , userDao.getAll());
        return "index";
    }
}
