package com.bjike.goddess.staffwelfaremanage.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.staffwelfaremanage.bo.PersonalFestivalWishBO;
import com.bjike.goddess.staffwelfaremanage.dto.PersonalFestivalWishDTO;

import java.util.List;

/**
 * 节日祝福语业务接口
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-04-07 03:08 ]
 * @Description: [ 节日祝福语业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface PersonalFestivalWishAPI {

    /**
     * 分页查询个人节日祝福
     *
     * @param dto 分页条件
     * @return 个人节日祝福结果集
     */
    List<PersonalFestivalWishBO> pageList(PersonalFestivalWishDTO dto) throws SerException;
}