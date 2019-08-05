package com.project.userdataflow;

import java.util.*;

public interface UserDetailsDAO {
    public int insertUser(UserDetails udata);
    public UserDetails getUserDetails(String userid, String passwd);
    public List<UserDetails> listAllUsers();
    public boolean deleteUser(UserDetails ud);
    public boolean updateUser(UserDetails ud); 
}
