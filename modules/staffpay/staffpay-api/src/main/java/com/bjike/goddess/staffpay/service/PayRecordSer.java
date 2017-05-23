package com.bjike.goddess.staffpay.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.staffpay.bo.AreaCollectBO;
import com.bjike.goddess.staffpay.bo.DepartmentCollectBO;
import com.bjike.goddess.staffpay.bo.NameCollectBO;
import com.bjike.goddess.staffpay.bo.PayRecordBO;
import com.bjike.goddess.staffpay.dto.PayRecordDTO;
import com.bjike.goddess.staffpay.entity.PayRecord;

import java.util.List;

/**
 * 已付款记录业务接口
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-05-18 02:00 ]
 * @Description: [ 已付款记录业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface PayRecordSer extends Ser<PayRecord, PayRecordDTO> {

    /**
     * 已付款记录列表总条数
     */
    default Long countPayRecord(PayRecordDTO payRecordDTO) throws SerException {
        return null;
    }

    /**
     * 一个已付款记录
     *
     * @return class PayRecordBO
     */
    default PayRecordBO getOne(String id) throws SerException {
        return null;
    }

    /**
     * 已付款记录
     *
     * @param payRecordDTO 已付款记录dto
     * @return class PayRecordBO
     * @throws SerException
     */
    default List<PayRecordBO> findListPayRecord(PayRecordDTO payRecordDTO) throws SerException {
        return null;
    }
    /**
     * 根据id删除已付款记录
     *
     * @param id
     * @throws SerException
     */
    default void removePayRecord(String id) throws SerException {

    }
    /**
     * 汇总
     *
     * @param areas areas
     * @return class AreaCollectBO
     * @throws SerException
     */

    default List<AreaCollectBO> collectArea(String[] areas) throws SerException {
        return null;
    }

    /**
     * 获取地区
     *
     * @return class String
     */
    default List<String> getAreas() throws SerException {
        return null;
    }
    /**
     * 汇总
     *
     * @param departments departments
     * @return class DepartmentCollectBO
     * @throws SerException
     */
    default List<DepartmentCollectBO> collectDepartment(String[] departments) throws SerException {
        return null;
    }

    /**
     * 获取部门
     *
     * @return class String
     */
    default List<String> getDepartments() throws SerException {
        return null;
    }
    /**
     * 汇总
     *
     * @param names names
     * @return class NameCollectBO
     * @throws SerException
     */
    default List<NameCollectBO> collectName(String[] names) throws SerException {
        return null;
    }

    /**
     * 获取个人
     *
     * @return class String
     */
    default List<String> getNames() throws SerException {
        return null;
    }

}