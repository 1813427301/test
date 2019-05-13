package com.oaec.how.entity;

import lombok.Data;
import org.hibernate.annotations.CacheConcurrencyStrategy;


import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "t_users")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)//配置缓存策略（二级需要配置）
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username",length = 32,unique = true,nullable = false)
	private String userName;

	@Column(name = "password",length = 45,nullable = false)
	private String password;

	@Column(name = "gender",nullable = false)
	private String gender;
	private String headLike;

	@Column(name = "phone",length = 11)
	private String phone;
	private String email;
	private int type;
	private int status;
	private Date date;

}
