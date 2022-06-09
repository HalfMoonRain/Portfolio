package com.ezen.project;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.project.service.DisplayActMapper;
import com.ezen.project.service.DisplayHotelMapper;
 
@Controller
public class MainController {
	
	@Autowired
	DisplayHotelMapper displayHotelMapper;
	
	@Autowired
	DisplayActMapper displayActMapper;
	 
	@RequestMapping("/")
	public String main() {
	  
		return "portfolio";
	}
	
	@RequestMapping("/main")
	public String main2(HttpServletRequest req) {
		HttpSession session = req.getSession();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String today = sdf.format(time);

		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DATE, 1);
		Date date = cal.getTime();
		String tmr = sdf.format(date);
        
		session.setAttribute("inwon", 2);
		
		if((String)session.getAttribute("indate") == null && (String)session.getAttribute("outdate") == null) {
			session.setAttribute("indate", today);
			session.setAttribute("outdate", tmr);
		}
		
		Map<String, Integer> map = displayHotelMapper.hotelList();
		req.setAttribute("map", map);
		
		displayHotelMapper.checkToday(today);
		
		return "user_main";
	}
	
	@RequestMapping("/company_main")
	public String companyMain() {
		return "company/company_main";
	}
	
	@RequestMapping("/portfolio")
	public String portfolio() {
		return "portfolio";
	}
	
	@RequestMapping("/portfolio_about")
	public String about() {
		return "about";
	}   
	  
	@RequestMapping("/portfolio_work")
	public String work() { 
		return "work";
	}

	@RequestMapping("/activity_usermain")
	public String activityUserMain(HttpServletRequest req) {
		HttpSession session = req.getSession();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String today = sdf.format(time);
		
//		자동완성
		List<String> allActOptions = displayActMapper.allActOptions();
		session.setAttribute("allActOptions", allActOptions);
		
		if((String)session.getAttribute("bookdate") == null) {
			session.setAttribute("bookdate", today);
		}

		req.setAttribute("sport", displayActMapper.countSport());
		req.setAttribute("study", displayActMapper.countStudy());
		req.setAttribute("cooking", displayActMapper.countCooking());
		req.setAttribute("culture", displayActMapper.countCulture());
		req.setAttribute("ent", displayActMapper.countEnt());
		req.setAttribute("music", displayActMapper.countMusic());
		
		return "activitymain/activity_main";
	}
}
