package dto;

import java.util.ArrayList;
import java.util.List;

public class QuickFindDTO {
	
	public List<Integer[]> connec =new ArrayList<Integer[]>();

	public List<Integer[]> getConnec() {
		return connec;
	}

	public void setConnec(List<Integer[]> connec) {
		this.connec = connec;
	}

}
