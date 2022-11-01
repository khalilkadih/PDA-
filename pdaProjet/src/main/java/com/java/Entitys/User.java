    package com.java.Entitys;

    import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table; 
    
	@Entity 
	@Table(name="User")   
	public class User{ 
		@Id   
	    @GeneratedValue(strategy = GenerationType.AUTO) 
		@Column(name="id") 
		private long id;
		@Column(name="name") 
		private String name;
		@Column(name="email") 
		private String email;
		@Column(name="password")  
		private String password;
		@Column(name="telephone") 
		private double telephone;
	   
		
		public User(String name, String email, String password, double telephone) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
			this.telephone = telephone;
			
		}
		
		public User() {
			super();
		}
		
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() { 
			return email;
		} 
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public double getTelephone() {
			return telephone;
		}
		public void setTelephone(double telephone) {
			this.telephone = telephone;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", telephone="
					+ telephone + "]";
		}
		
		
	} 
