package cn.comelo.ehrsp.service.impl;

import cn.comelo.ehrsp.mapper.EhrAdminMapper;
import cn.comelo.ehrsp.service.EhrAdminService;
import cn.comelo.pojo.EhrAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EhrAdminServiceImpl implements EhrAdminService {

    @Autowired
    private EhrAdminMapper ehrAdminMapper;

    @Override
    @Transactional(transactionManager="primaryTransactionManager")
    public EhrAdmin queryAdminInfo(String username) {

        EhrAdmin ehrAdmin = new EhrAdmin();
        ehrAdmin.setUsername(username);
        return ehrAdminMapper.selectOne(ehrAdmin);
    }
}
