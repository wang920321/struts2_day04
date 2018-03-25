package cn.itcast.a_interceptor;

import com.opensymphony.xwork2.ActionSupport;

public class Demo1Action extends ActionSupport {
    
	
	@Override
	public String execute() throws Exception {
		System.out.println("Demo1Action");
		return SUCCESS;
	}

	public String add() throws Exception {
		System.out.println("Demo1Action_add!");
		return SUCCESS;
	}
	
	public String delete() throws Exception {
		System.out.println("Demo1Action_delete!");
		return SUCCESS;
	}
	
	public String update() throws Exception {
		System.out.println("Demo1Action_update!");
		return SUCCESS;
	}
	
	public String find() throws Exception {
		System.out.println("Demo1Action_find!");
		return SUCCESS;
	}
	
	
}
