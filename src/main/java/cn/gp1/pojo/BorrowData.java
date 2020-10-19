package cn.gp1.pojo;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="b_data")
public class BorrowData {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column
		private Integer did;
		
		@Column
		private Integer bid;
		@Column
		private String uname;
		@Column
		private String bname;
		@Column
		private Date ddate;
		
		/*@OneToOne(mappedBy="uname")
		private Users users;
		@OneToOne(mappedBy="bid")
		private Books books;*/
		public Integer getDid() {
			return did;
		}

		public void setDid(Integer did) {
			this.did = did;
		}



		public Integer getBid() {
			return bid;
		}

		public void setBid(Integer bid) {
			this.bid = bid;
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getBname() {
			return bname;
		}

		public void setBname(String bname) {
			this.bname = bname;
		}

		public Date getDdate() {
			return ddate;
		}

		public void setDdate(Date ddate) {
			this.ddate = ddate;
		}

		public BorrowData() {
			super();
		}

		public BorrowData(Integer did,  Integer bid, String uname, String bname, Date ddate) {
			super();
			this.did = did;
			this.bid = bid;
			this.uname = uname;
			this.bname = bname;
			this.ddate = ddate;
		}

		@Override
		public String toString() {
			return "BorrowData [did=" + did + ", bid=" + bid + ", uname=" + uname + ", bname=" + bname
					+ ", ddate=" + ddate + "]";
		}
		
		
}
