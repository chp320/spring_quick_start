package com.springbook.biz.user;

import org.h2.engine.User;

public interface UserService {

    // CRUD 기능의 메서드 구현
    // 회원 등록
    public UserVO getUser(UserVO vo);
}
