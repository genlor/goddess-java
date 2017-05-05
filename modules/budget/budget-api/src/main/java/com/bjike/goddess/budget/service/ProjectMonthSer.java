package com.bjike.goddess.budget.service;

import com.bjike.goddess.budget.bo.ProjectMonthBO;
import com.bjike.goddess.budget.bo.ProjectMonthCountBO;
import com.bjike.goddess.budget.dto.ProjectMonthDTO;
import com.bjike.goddess.budget.entity.ProjectMonth;
import com.bjike.goddess.budget.to.ProjectMonthTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;

import java.util.List;

/**
 * 项目收入月业务接口
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-05-02 03:59 ]
 * @Description: [ 项目收入月业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ProjectMonthSer extends Ser<ProjectMonth, ProjectMonthDTO> {
    /**
     * 添加
     *
     * @param to 项目收入月信息
     * @return class ProjectMonthBO
     * @throws SerException
     */
    default ProjectMonthBO save(ProjectMonthTO to) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param to 项目收入月信息
     * @throws SerException
     */
    default void edit(ProjectMonthTO to) throws SerException {
    }

    /**
     * 删除全部
     *
     * @throws SerException
     */
    default void deleteAll() throws SerException {

    }

    /**
     * 查找
     *
     * @param dto 项目收入月分页信息
     * @return class ProjectMonthBO
     * @throws SerException
     */
    default List<ProjectMonthBO> list(ProjectMonthDTO dto) throws SerException {
        return null;
    }

    /**
     * 通过id查找
     *
     * @param id 项目收入月id
     * @return class ProjectMonthBO
     * @throws SerException
     */
    default ProjectMonthBO findByID(String id) throws SerException {
        return null;
    }

    /**
     * 汇总
     *
     * @return class ProjectMonthCountBO
     * @throws SerException
     */
    default List<ProjectMonthCountBO> count() throws SerException {
        return null;
    }

    /**
     * 分项目汇总
     *
     * @param projects 项目数组
     * @return class ProjectMonthCountBO
     * @throws SerException
     */
    default List<ProjectMonthCountBO> conditionsCount(String[] projects) throws SerException {
        return null;
    }
}