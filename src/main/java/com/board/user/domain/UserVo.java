package com.board.user.domain;

import lombok.Data;


// @Data : @Getter, @Setter, @ToString, @NoArgsConstruvtor, @EqualsAndHashCode, @RequiedArgsConstructor

@Data
public class UserVo {
	private String userid;
	private String passwd;
	private String username;
	private String email;
	private int    upoint;
	private String indate;
}
