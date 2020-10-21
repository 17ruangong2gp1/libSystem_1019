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
		private Date ddate;
		
		@OneToOne
		@JoinColumn(name="uid")
		private Users user;
		
		
		@OneToOne
		@JoinColumn(name="bid")
		private Books book;
		
		@Column
		private String uname;
		
		@Column
		private String bname;
		
		
		public Integer getDid() {
			return did;
		}

		public void setDid(Integer did) {
			this.did = did;
		}

		public Users getUser() {
			return user;
		}

		public void setUser(Users user) {
			this.user = user;
		}

		public Books getBook() {
			return book;
		}

		public void setBook(Books book) {
			this.book = book;
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

		public BorrowData(Date ddate, Users user, Books book, String uname, String bname) {
			super();
			this.ddate = ddate;
			this.user = user;
			this.book = book;
			this.uname = uname;
			this.bname = bname;
		}

		
		
		
		
}
