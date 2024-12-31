package com.ap.service;

import com.ap.entity.vo.PaginationResultVO;
import com.ap.entity.po.ProductInfo;
import com.ap.entity.query.ProductInfoQuery;

import java.util.List;

/**
 * @Description:商品信息Service
 * @auther:kjy06123
 * @date:2024/12/27
 */
public interface ProductInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<ProductInfo> findListByParam(ProductInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(ProductInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<ProductInfo> findListByPage(ProductInfoQuery query);

	/**
	 * 新增
	 */
	Integer add(ProductInfo bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<ProductInfo> listBean);

	/**
	 * 批量新增或修改
	 */
	Integer addOrUpdateBatch(List<ProductInfo> listBean);

	/**
	 * 根据Id查询
	 */
	ProductInfo getProductInfoById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateProductInfoById(ProductInfo bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteProductInfoById(Integer id);

	/**
	 * 根据Code查询
	 */
	ProductInfo getProductInfoByCode(String code);

	/**
	 * 根据Code更新
	 */
	Integer updateProductInfoByCode(ProductInfo bean, String code);

	/**
	 * 根据Code删除
	 */
	Integer deleteProductInfoByCode(String code);

	/**
	 * 根据SkuTypeAndColorType查询
	 */
	ProductInfo getProductInfoBySkuTypeAndColorType(Integer skuType, Integer colorType);

	/**
	 * 根据SkuTypeAndColorType更新
	 */
	Integer updateProductInfoBySkuTypeAndColorType(ProductInfo bean, Integer skuType, Integer colorType);

	/**
	 * 根据SkuTypeAndColorType删除
	 */
	Integer deleteProductInfoBySkuTypeAndColorType(Integer skuType, Integer colorType);

}