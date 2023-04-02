package org.studyeasy;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.DAO.usersDAO;
import org.studyeasy.Model.Model;
@Controller
public class homeController {

	@GetMapping(value = "/")
	public ModelAndView welcome() {
		usersDAO dao=new usersDAO();
		ModelAndView modelandview = new ModelAndView("hello");
		List<Model> list=dao.getUsersList();
		modelandview.addObject("list", list);
		return modelandview;
	}

	@GetMapping(value = "welcome")
	public String about() {
		return "welcome";
	}
}
