package app.controller;

import app.dao.UserDaoHibernate;
import app.dao.UserDaoHibernateImpl;
import app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SaveUserController {

    @GetMapping("/save")
    public String saveUser() {
        UserDaoHibernate userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.save(new User("hello", "hellos", "hello@gmail.com", "hello1"));
        return "save";
    }
}
