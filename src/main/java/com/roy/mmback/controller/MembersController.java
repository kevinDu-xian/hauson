package com.roy.mmback.controller;

import com.roy.mmback.beans.po.Members;
import com.roy.mmback.beans.vo.MembersVO;
import com.roy.mmback.beans.vo.ResultVO;
import com.roy.mmback.service.MembersService;
import com.roy.mmback.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/members",produces = "text/html;charset=utf-8")
public class MembersController {
    @Autowired
    private MembersService membersService;

    /**
     * 查询会员信息
     * @param members
     * @return
     */
    @GetMapping("getMembersList")
    public String getMembersList(Members members){
        ResultVO<Members> resultVO =new ResultVO<Members>("4001","查询失败");

        List<Members> membersList=membersService.getMembersList(members);

        if(membersList !=null && membersList.size()>0){
            resultVO.setCode("2001");
            resultVO.setMsg("查询成功");
            resultVO.setData(membersList);
        }

        return JsonUtil.toJsonString(resultVO);
    }

    @PostMapping("add")
    public String add(MembersVO members){
        ResultVO resultVO =new ResultVO("4001","新增失败");

        if(membersService.add(members)){
            resultVO.setCode("2001");
            resultVO.setMsg("新增成功");
        }

        return JsonUtil.toJsonString(resultVO);
    }

    @GetMapping("del")
    public String del(int id){
        ResultVO resultVO =new ResultVO("4001","删除失败");

        if(membersService.del(id)){
            resultVO.setCode("2001");
            resultVO.setMsg("删除成功");
        }

        return JsonUtil.toJsonString(resultVO);
    }
}
