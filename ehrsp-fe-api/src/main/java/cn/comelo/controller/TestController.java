package cn.comelo.controller;

import cn.comelo.ehrsp.service.EhrAdminService;
import cn.comelo.pojo.EhrAdmin;
import cn.comelo.pojo.QsMembers;
import cn.comelo.qscms.service.QsMembersService;
import cn.comelo.utils.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api("Test Controller")
@RestController
public class TestController {

    @Autowired
    private QsMembersService qsMembersService;

    @Autowired
    private EhrAdminService ehrAdminService;

    @ApiOperation("更新用户")
    @ApiImplicitParam(name = "qsMembers", value = "单个用户信息", dataType = "QsMembers")
    @PostMapping("/test")
    public JsonResponse login(@RequestBody QsMembers qsMembers) {
        String username = qsMembers.getUsername();
        String password = qsMembers.getPassword();

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return JsonResponse.errorMsg("Username and password is required.");
        }

        QsMembers qsMembersDB = qsMembersService.queryUserInfo(username);
        if (qsMembersDB == null) {
            return JsonResponse.errorMsg("User is not exist.");
        }

        String passInDB = qsMembersDB.getPassword();
        if (password.equals(passInDB)) {
            return JsonResponse.ok();
        }

        return JsonResponse.errorMsg("Password is incorrect.");
    }

    @ApiOperation("测试ehrsp")
    @ApiImplicitParam(name = "qsMembers", value = "单个用户信息", dataType = "QsMembers")
    @PostMapping("/test1")
    public JsonResponse admin(@RequestBody EhrAdmin ehrAdmin) {
        String username = ehrAdmin.getUsername();
        String password = ehrAdmin.getPassword();

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return JsonResponse.errorMsg("Username and password is required.");
        }

        EhrAdmin ehrAdminDB = ehrAdminService.queryAdminInfo(username);
        if (ehrAdminDB == null) {
            return JsonResponse.errorMsg("User is not exist.");
        }

        String passInDB = ehrAdminDB.getPassword();
        if (password.equals(passInDB)) {
            return JsonResponse.ok();
        }

        return JsonResponse.errorMsg("Password is incorrect.");
    }
}
