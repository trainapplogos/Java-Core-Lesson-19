package trainapplogos;

import java.io.Serializable;
import java.util.List;

public class ListOfEmployee implements Serializable {
	private List<Employee> list;

	public ListOfEmployee(List<Employee> list) {
		super();
		this.list = list;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ListOfEmployee [list=" + list + "]";
	}
}
