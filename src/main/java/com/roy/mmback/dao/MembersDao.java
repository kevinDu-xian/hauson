package com.roy.mmback.dao;

import com.roy.mmback.beans.po.Members;
import com.roy.mmback.beans.vo.MembersVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembersDao {
    /**
     * 查询所有会员列表
     * @param members
     * @return
     */
    public List<Members> getMembersList(Members members);

    /**
     * 新增会员
     * @param members
     * @return
     */
    public int add(MembersVO members);

    /**
     * 删除会员
     * @param id
     * @return
     */
    public int del(int id);
}
