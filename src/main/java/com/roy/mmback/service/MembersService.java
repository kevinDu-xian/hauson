package com.roy.mmback.service;

import com.roy.mmback.beans.po.Members;
import com.roy.mmback.beans.vo.MembersVO;

import java.util.List;

public interface MembersService {
    public List<Members> getMembersList(Members members);
    public boolean add(MembersVO members);
    public boolean del(int id);
}
