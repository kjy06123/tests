package com.ap.service.impl;

import com.ap.entity.po.UserInfoBeauty;
import com.ap.entity.query.UserInfoBeautyQuery;
import com.ap.entity.query.SimplePage;
import com.ap.entity.vo.PaginationResultVO;
import com.ap.enums.PageSize;
import com.ap.mappers.UserInfoBeautyMapper;
import com.ap.service.UserInfoBeautyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:靓号表Service
 * @auther:kjy06123
 * @date:2024/12/27
 */
@Service("userInfoBeautyService")
public class UserInfoBeautyServiceImpl implements UserInfoBeautyService {

	@Resource
	private UserInfoBeautyMapper<UserInfoBeauty, UserInfoBeautyQuery> userInfoBeautyMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<UserInfoBeauty> findListByParam(UserInfoBeautyQuery query) {
		return this.userInfoBeautyMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 */
	public Integer findCountByParam(UserInfoBeautyQuery query) {
		return this.userInfoBeautyMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 */
	public PaginationResultVO<UserInfoBeauty> findListByPage(UserInfoBeautyQuery query) {
		Integer count = this.findCountByParam(query);
		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<UserInfoBeauty> list = this.findListByParam(query);
		PaginationResultVO<UserInfoBeauty> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(),list);
		return result;
	}

	/**
	 * 新增
	 */
	public Integer add(UserInfoBeauty bean) {
		return this.userInfoBeautyMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<UserInfoBeauty> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userInfoBeautyMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或修改
	 */
	public Integer addOrUpdateBatch(List<UserInfoBeauty> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userInfoBeautyMapper.insertOrUpdateBatch(listBean);	}

	/**
	 * 根据Id查询
	 */
	public UserInfoBeauty getUserInfoBeautyById(Integer id) {
		return this.userInfoBeautyMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	public Integer updateUserInfoBeautyById(UserInfoBeauty bean, Integer id) {
		return this.userInfoBeautyMapper.updateById(bean, id);
	}

	/**
	 * 根据Id删除
	 */
	public Integer deleteUserInfoBeautyById(Integer id) {
		return this.userInfoBeautyMapper.deleteById(id);
	}

	/**
	 * 根据UserId查询
	 */
	public UserInfoBeauty getUserInfoBeautyByUserId(String userId) {
		return this.userInfoBeautyMapper.selectByUserId(userId);
	}

	/**
	 * 根据UserId更新
	 */
	public Integer updateUserInfoBeautyByUserId(UserInfoBeauty bean, String userId) {
		return this.userInfoBeautyMapper.updateByUserId(bean, userId);
	}

	/**
	 * 根据UserId删除
	 */
	public Integer deleteUserInfoBeautyByUserId(String userId) {
		return this.userInfoBeautyMapper.deleteByUserId(userId);
	}

	/**
	 * 根据Email查询
	 */
	public UserInfoBeauty getUserInfoBeautyByEmail(String email) {
		return this.userInfoBeautyMapper.selectByEmail(email);
	}

	/**
	 * 根据Email更新
	 */
	public Integer updateUserInfoBeautyByEmail(UserInfoBeauty bean, String email) {
		return this.userInfoBeautyMapper.updateByEmail(bean, email);
	}

	/**
	 * 根据Email删除
	 */
	public Integer deleteUserInfoBeautyByEmail(String email) {
		return this.userInfoBeautyMapper.deleteByEmail(email);
	}


}