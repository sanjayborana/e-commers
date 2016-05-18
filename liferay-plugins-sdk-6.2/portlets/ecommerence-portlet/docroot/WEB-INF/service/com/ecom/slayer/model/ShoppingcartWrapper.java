/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ecom.slayer.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Shoppingcart}.
 * </p>
 *
 * @author Ecom
 * @see Shoppingcart
 * @generated
 */
public class ShoppingcartWrapper implements Shoppingcart,
	ModelWrapper<Shoppingcart> {
	public ShoppingcartWrapper(Shoppingcart shoppingcart) {
		_shoppingcart = shoppingcart;
	}

	@Override
	public Class<?> getModelClass() {
		return Shoppingcart.class;
	}

	@Override
	public String getModelClassName() {
		return Shoppingcart.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cartId", getCartId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("itemId", getItemId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cartId = (Long)attributes.get("cartId");

		if (cartId != null) {
			setCartId(cartId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}
	}

	/**
	* Returns the primary key of this shoppingcart.
	*
	* @return the primary key of this shoppingcart
	*/
	@Override
	public long getPrimaryKey() {
		return _shoppingcart.getPrimaryKey();
	}

	/**
	* Sets the primary key of this shoppingcart.
	*
	* @param primaryKey the primary key of this shoppingcart
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_shoppingcart.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cart ID of this shoppingcart.
	*
	* @return the cart ID of this shoppingcart
	*/
	@Override
	public long getCartId() {
		return _shoppingcart.getCartId();
	}

	/**
	* Sets the cart ID of this shoppingcart.
	*
	* @param cartId the cart ID of this shoppingcart
	*/
	@Override
	public void setCartId(long cartId) {
		_shoppingcart.setCartId(cartId);
	}

	/**
	* Returns the group ID of this shoppingcart.
	*
	* @return the group ID of this shoppingcart
	*/
	@Override
	public long getGroupId() {
		return _shoppingcart.getGroupId();
	}

	/**
	* Sets the group ID of this shoppingcart.
	*
	* @param groupId the group ID of this shoppingcart
	*/
	@Override
	public void setGroupId(long groupId) {
		_shoppingcart.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this shoppingcart.
	*
	* @return the company ID of this shoppingcart
	*/
	@Override
	public long getCompanyId() {
		return _shoppingcart.getCompanyId();
	}

	/**
	* Sets the company ID of this shoppingcart.
	*
	* @param companyId the company ID of this shoppingcart
	*/
	@Override
	public void setCompanyId(long companyId) {
		_shoppingcart.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this shoppingcart.
	*
	* @return the user ID of this shoppingcart
	*/
	@Override
	public long getUserId() {
		return _shoppingcart.getUserId();
	}

	/**
	* Sets the user ID of this shoppingcart.
	*
	* @param userId the user ID of this shoppingcart
	*/
	@Override
	public void setUserId(long userId) {
		_shoppingcart.setUserId(userId);
	}

	/**
	* Returns the user uuid of this shoppingcart.
	*
	* @return the user uuid of this shoppingcart
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcart.getUserUuid();
	}

	/**
	* Sets the user uuid of this shoppingcart.
	*
	* @param userUuid the user uuid of this shoppingcart
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_shoppingcart.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this shoppingcart.
	*
	* @return the user name of this shoppingcart
	*/
	@Override
	public java.lang.String getUserName() {
		return _shoppingcart.getUserName();
	}

	/**
	* Sets the user name of this shoppingcart.
	*
	* @param userName the user name of this shoppingcart
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_shoppingcart.setUserName(userName);
	}

	/**
	* Returns the create date of this shoppingcart.
	*
	* @return the create date of this shoppingcart
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _shoppingcart.getCreateDate();
	}

	/**
	* Sets the create date of this shoppingcart.
	*
	* @param createDate the create date of this shoppingcart
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_shoppingcart.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this shoppingcart.
	*
	* @return the modified date of this shoppingcart
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _shoppingcart.getModifiedDate();
	}

	/**
	* Sets the modified date of this shoppingcart.
	*
	* @param modifiedDate the modified date of this shoppingcart
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_shoppingcart.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the item ID of this shoppingcart.
	*
	* @return the item ID of this shoppingcart
	*/
	@Override
	public long getItemId() {
		return _shoppingcart.getItemId();
	}

	/**
	* Sets the item ID of this shoppingcart.
	*
	* @param itemId the item ID of this shoppingcart
	*/
	@Override
	public void setItemId(long itemId) {
		_shoppingcart.setItemId(itemId);
	}

	@Override
	public boolean isNew() {
		return _shoppingcart.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_shoppingcart.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _shoppingcart.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_shoppingcart.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _shoppingcart.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _shoppingcart.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_shoppingcart.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _shoppingcart.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_shoppingcart.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_shoppingcart.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_shoppingcart.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ShoppingcartWrapper((Shoppingcart)_shoppingcart.clone());
	}

	@Override
	public int compareTo(com.ecom.slayer.model.Shoppingcart shoppingcart) {
		return _shoppingcart.compareTo(shoppingcart);
	}

	@Override
	public int hashCode() {
		return _shoppingcart.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ecom.slayer.model.Shoppingcart> toCacheModel() {
		return _shoppingcart.toCacheModel();
	}

	@Override
	public com.ecom.slayer.model.Shoppingcart toEscapedModel() {
		return new ShoppingcartWrapper(_shoppingcart.toEscapedModel());
	}

	@Override
	public com.ecom.slayer.model.Shoppingcart toUnescapedModel() {
		return new ShoppingcartWrapper(_shoppingcart.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _shoppingcart.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _shoppingcart.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_shoppingcart.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ShoppingcartWrapper)) {
			return false;
		}

		ShoppingcartWrapper shoppingcartWrapper = (ShoppingcartWrapper)obj;

		if (Validator.equals(_shoppingcart, shoppingcartWrapper._shoppingcart)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Shoppingcart getWrappedShoppingcart() {
		return _shoppingcart;
	}

	@Override
	public Shoppingcart getWrappedModel() {
		return _shoppingcart;
	}

	@Override
	public void resetOriginalValues() {
		_shoppingcart.resetOriginalValues();
	}

	private Shoppingcart _shoppingcart;
}