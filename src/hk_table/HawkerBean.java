package hk_table;

public class HawkerBean {
	public String hname;
	String mobile;
	String alloareas;
	String doj;
		
	public HawkerBean(String hname, String mobile, String alloareas, String doj) {
		super();
		System.out.println("bean->"+alloareas);
		this.hname = hname;
		this.mobile = mobile;
		this.alloareas = alloareas;
		
		this.doj = doj;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAlloareas() {
		return alloareas;
	}
	public void setAlloareas(String alloareas) {
		this.alloareas = alloareas;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	
	
}
