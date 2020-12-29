package com.roy.mmback.service.impl;

import com.roy.mmback.beans.po.Members;
import com.roy.mmback.beans.vo.MembersVO;
import com.roy.mmback.dao.MembersDao;
import com.roy.mmback.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersServiceImpl implements MembersService {
    @Autowired
    private MembersDao membersDao;

    @Override
    public List<Members> getMembersList(Members members) {
        return membersDao.getMembersList(members);
    }

    @Override
    public boolean add(MembersVO members) {
        return membersDao.add(members)>0?true:false;
    }

    @Override
    public boolean del(int id) {
        return membersDao.del(id)>0?true:false;
    }
}
