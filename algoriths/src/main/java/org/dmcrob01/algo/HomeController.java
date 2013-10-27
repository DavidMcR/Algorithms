package org.dmcrob01.algo;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import algorithms.BottomupMergesort;
import algorithms.InsertionSort;
import algorithms.QuickFind;
import algorithms.QuickUnion;
import algorithms.SelectionSort;
import algorithms.ShellSort;
import algorithms.MergeSort;
import dto.Connections;
import dto.ArrayListDTO;

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
	public String quickFind(Model model) {
		
		int size = 50;
		int halfSize = (size/2);
		GenerateRandomArray gra = new GenerateRandomArray(size);
		ArrayListDTO qfd = new ArrayListDTO();
		QuickFind qf = new QuickFind(size);
		List<Integer[]> connecarray =new ArrayList<Integer[]>();
		for (int i = 0; i<(size);i++){
			Integer[] qfArray = new Integer[3]; 
			int p = i;
			//int p = (gra.getIntList()).get(i*2);
			int q = (gra.getIntList()).get(i);//((i*2)+1);
			qfArray[0]=p;
			qfArray[1]=q;
			qfArray[2]=p;
			if(!qf.connected(p, q)){
				qf.union(p, q);

			}
			
			connecarray.add(qfArray);
			/*if (!qf.connected(p, q)){
				qf.union(p, q);
				System.out.println(p+"      "+q);
			}*/
		}
		int[] output= qf.getId();
		for(int i = 0; i<output.length;i++){
			Integer[] arrr = new Integer[3];
			arrr=connecarray.get(i);
		
		arrr[2]=output[i];
		connecarray.set(i,arrr);
		}
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
	@RequestMapping(value = "/quickunion", method = RequestMethod.GET)
	public String quickUnion(Model model) {
		int size = 50;
		GenerateRandomArray gra = new GenerateRandomArray(size);
		ArrayListDTO qfd = new ArrayListDTO();
		QuickUnion qu = new QuickUnion(size);
		
		List<Integer[]> connecarray =new ArrayList<Integer[]>();
		for (int i = 0; i<(size);i++){
			Integer[] qfArray = new Integer[3]; 
			int p = i;
			//int p = (gra.getIntList()).get(i*2);
			int q = (gra.getIntList()).get(i);//((i*2)+1);
			qfArray[0]=p;
			qfArray[1]=q;
			//qfArray[2]=p;
			if(!qu.connected(p, q)){
				qu.union(p, q);
				//System.out.println(p+"...."+q);
			}
			connecarray.add(qfArray);
			
		}
		
		int[] output= qu.getId();
		for(int i = 0; i<output.length;i++){
			Integer[] arrr = new Integer[3];
			arrr=connecarray.get(i);
		
		arrr[2]=qu.root(i);//output[i];
		connecarray.set(i,arrr);
		
		}
		qfd.setConnec(connecarray);
		model.addAttribute("helloworld", "Hello World");
		model.addAttribute("listint", connecarray);
		return "QuickUnion";
	}
	
	
	@RequestMapping(value = "/selectionsort", method = RequestMethod.GET)
	public String SelectionSortDispatch(Model model) {
		SelectionSort ss = new SelectionSort();
		//Integer[] unsorted = {3,5,2,9,0,6,1,4,7,8};
		//Integer[] sorted = new Integer[unsorted.length];
		
		GenerateRandomArray gra = new GenerateRandomArray();
		Random random = new Random();
		int[] a = new int[random.nextInt(2000)];
		gra.setIntArray(a);
		gra.Generate();
		//int[] unsorted = {3,5,2,9,0,6,1,4,7,8,101,-1};
		int[] unsorted = gra.getIntArray();
		int[] sorted = new int[unsorted.length];
		ss.setSort(unsorted);
		for(int i=0; i<unsorted.length;i++)sorted[i]=unsorted[i];
		model.addAttribute("unsorted",unsorted);
		ss.sort(sorted);
		
		//Integer[] sorted = ss.getSorted();
		model.addAttribute("sorted",sorted);
		return "SelectionSort";
	
	}
	@RequestMapping(value = "/insertionsort", method = RequestMethod.GET)
	public String InsertionSortDispatch(Model model) {
		int[] unsorted = {3,5,2,9,0,6,1,4,7,8,101,-1};
		int[] sorted = new int[unsorted.length];
		for(int z=0;z<unsorted.length;z++)sorted[z]=unsorted[z];
		model.addAttribute("unsorted",unsorted);
		InsertionSort is = new InsertionSort();
		is.setSort(sorted);
		is.sort(sorted);
		model.addAttribute("sorted", is.getInt());
		return "InsertionSort";
		
	}
	@RequestMapping(value = "/shellsort", method = RequestMethod.GET)
	public String ShellSort(Model model) {
		int[] unsorted = {3,5,2,637,0,6,1,201,7,8,101,-1};
		int[] sorted = new int[unsorted.length];
		for(int z=0;z<unsorted.length;z++)sorted[z]=unsorted[z];
		model.addAttribute("unsorted",unsorted);
		ShellSort ss = new ShellSort();
		ss.setSort(sorted);
		ss.sort(sorted);
		model.addAttribute("sorted", ss.getInt());
		return "ShellSort";
	}
	@RequestMapping(value = "/mergesort", method = RequestMethod.GET)
	public String MergeSort(Model model) {
		int[] unsorted = {3,5,2,637,0,6,1,201,7,8,101,-1};
		int[] sorted = new int[unsorted.length];
		for(int z=0;z<unsorted.length;z++)sorted[z]=unsorted[z];
		model.addAttribute("unsorted",unsorted);
		MergeSort ms = new MergeSort();
		ms.setSort(sorted);
		ms.sort(sorted);
		model.addAttribute("sorted", ms.getInt());
		return "Mergesort";
	}
	
	@RequestMapping(value = "/bottomupmergesort", method = RequestMethod.GET)
	public String BottomupMergeSort(Model model) {
		int[] unsorted = {3,5,2,637,0,6,1,201,7,8,101,-1};
		int[] sorted = new int[unsorted.length];
		for(int z=0;z<unsorted.length;z++)sorted[z]=unsorted[z];
		model.addAttribute("unsorted",unsorted);
		BottomupMergesort bm = new BottomupMergesort();
		bm.setSort(sorted);
		bm.sort(sorted);
		model.addAttribute("sorted", bm.getInt());
		return "BottomupMergesort";
	}
	
	@RequestMapping(value = "/quicksort", method = RequestMethod.GET)
	public String QuickSort(Model model) {
		int[] unsorted = {3,5,2,637,0,6,1,201,7,8,101,-1};
		int[] sorted = new int[unsorted.length];
		for(int z=0;z<unsorted.length;z++)sorted[z]=unsorted[z];
		model.addAttribute("unsorted",unsorted);
		BottomupMergesort bm = new BottomupMergesort();
		bm.setSort(sorted);
		bm.sort(sorted);
		model.addAttribute("sorted", bm.getInt());
		return "QuickSort";
	}
	
}
