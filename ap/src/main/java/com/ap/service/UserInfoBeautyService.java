package com.ap.service;

import com.ap.entity.vo.PaginationResultVO;
import com.ap.entity.po.UserInfoBeauty;
import com.ap.entity.query.UserInfoBeautyQuery;

import java.util.List;

/**
 * @Description:靓号表Service
 * @auther:kjy06123
 * @date:2024/12/27
 */
public interface UserInfoBeautyService{

	/**
	 * 根据条件查询列表
	 */
	List<UserInfoBeauty> findListByParam(UserInfoBeautyQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(UserInfoBeautyQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<UserInfoBeauty> findListByPage(UserInfoBeautyQuery query);

	/**
	 * 新增
	 */
	Integer add(UserInfoBeauty bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<UserInfoBeauty> listBean);

	/**
	 * 批量新增或修改
	 */
	Integer addOrUpdateBatch(List<UserInfoBeauty> listBean);

	/**
	 * 根据Id查询
	 */
	UserInfoBeauty getUserInfoBeautyById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateUserInfoBeautyById(UserInfoBeauty bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteUserInfoBeautyById(Integer id);

	/**
	 * 根据UserId查询
	 */
	UserInfoBeauty getUserInfoBeautyByUserId(String userId);

	/**
	 * 根据UserId更新
	 */
	Integer updateUserInfoBeautyByUserId(UserInfoBeauty bean, String userId);

	/**
	 * 根据UserId删除
	 */
	Integer deleteUserInfoBeautyByUserId(String userId);

	/**
	 * 根据Email查询
	 */
	UserInfoBeauty getUserInfoBeautyByEmail(String email);

	/**
	 * 根据Email更新
	 */
	Integer updateUserInfoBeautyByEmail(UserInfoBeauty bean, String email);

	/**
	 * 根据Email删除
	 */
	Integer deleteUserInfoBeautyByEmail(String email);

}