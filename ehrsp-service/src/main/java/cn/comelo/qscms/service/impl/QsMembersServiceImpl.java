package cn.comelo.qscms.service.impl;

import cn.comelo.pojo.QsMembers;
import cn.comelo.qscms.mapper.QsMembersMapper;
import cn.comelo.qscms.service.QsMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QsMembersServiceImpl implements QsMembersService {

    @Autowired
    private QsMembersMapper qsMembersMapper;

    @Override
    @Transactional(transactionManager="secondTransactionManager")
    public QsMembers queryUserInfo(String username) {
        QsMembers qsMembersCon = new QsMembers();
        qsMembersCon.setUsername(username);
        return qsMembersMapper.selectOne(qsMembersCon);
    }
}
