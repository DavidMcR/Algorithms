package org.dmcrob01.algo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.Connections;
import dto.QuickFindDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/quickfind", method = RequestMethod.GET)
	public String home(Model model) {
		
		int size = 100;
		int halfSize = (size/2);
		GenerateRandomArray gra = new GenerateRandomArray(size);
		QuickFindDTO qfd = new QuickFindDTO();
		QuickFind qf = new QuickFind(size);
		List<Integer[]> connecarray =new ArrayList<Integer[]>();
		for (int i = 0; i<(halfSize);i++){
			Integer[] qfArray = new Integer[2]; 
			int p = (gra.getIntList()).get(i*2);
			int q = (gra.getIntList()).get((i*2)+1);
			qfArray[0]=p;
			qfArray[1]=q;
			if(!qf.connected(p, q)){
				qf.union(p, q);
				//System.out.println(p+"...."+q);
			}
			connecarray.add(qfArray);
			/*if (!qf.connected(p, q)){
				qf.union(p, q);
				System.out.println(p+"      "+q);
			}*/
		}
		int[] output= qf.getId();
		for(int i = 0; i<output.length;i++){
		System.out.println(output[i]);}
		Connections c = new Connections();
		List<Integer> listInt = gra.getIntList();
		qfd.setConnec(connecarray);
		//c.setConnection(listInt);
		//System.out.println(listInt.get(0));
		System.out.print("test    "+(gra.getIntList()).size());
		model.addAttribute("randomArray", listInt);
		model.addAttribute("listint", connecarray);
		return "QuickFind";
	}
}
