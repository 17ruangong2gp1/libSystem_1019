package cn.gp1.pojo;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Books {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer bid;
	
	@Column
	private String bname;
	
	@Column
	private String auther;
	
	@Column
	private String phouse;
	
	@Column
	private int borrowed;
	
	/*@OneToOne
	@JoinColumn(name="bid")
	private BorrowData bd;*/


	public Books(Integer bid, String bname, String auther, String phouse, int borrowed) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.auther = auther;
		this.phouse = phouse;
		this.borrowed = borrowed;
	}

	public Books() {
		super();
	}

	@Override
	public String toString() {
		return "Users [bid=" + bid + ", bname=" + bname + ", auther=" + auther + ", phouse=" + phouse
				+ ", borrowed=" + borrowed + "]";
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPhouse() {
		return phouse;
	}

	public void setPhouse(String phouse) {
		this.phouse = phouse;
	}

	public int getBorrowed() {
		return borrowed;
	}

	public void setBorrowed(int borrowed) {
		this.borrowed = borrowed;
	}
}
