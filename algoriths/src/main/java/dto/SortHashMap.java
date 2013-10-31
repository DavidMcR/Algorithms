package dto;

import java.util.HashMap;
import java.util.Map;

public class SortHashMap {
	Map <String,String> sortType = new HashMap();

	public Map<String, String> getSortType() {
		sortType.put("Insertion Sort","Insertion Sort" );
		sortType.put("Shell Sort","Shell Sort" );
		sortType.put("Selection Sort","Selection Sort" );
		sortType.put("Merge Sort","Merge Sort" );
		sortType.put("Bottumup Merge Sort","Bottumup Merge Sort" );
		
		return sortType;
	}

	public void setSortType(Map<String, String> sortType) {
		this.sortType = sortType;
	}
	

}
