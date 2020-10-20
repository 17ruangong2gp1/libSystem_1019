package cn.gp1.pojo;

import javax.persistence.*;

@Entity
@Table(name="b_admin")
public class Admins {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer aid;
	@Column
	private String aname;
	@Column
	private String apwd;
	@Column
	private boolean state;
	
	
	public Admins() {
		super();
	}
	public Admins( String aname, String apwd, boolean state) {
		super();
	
		this.aname = aname;
		this.apwd = apwd;
		this.state = state;
	}
	
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApwd() {
		return apwd;
	}
	public void setApwd(String apwd) {
		this.apwd = apwd;
	}
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Admins [aname=" + aname + ", apwd=" + apwd + ", state=" + state + "]";
	}
	
	
}
