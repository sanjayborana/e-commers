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

package com.ecom.slayer.service.persistence;

import com.ecom.slayer.model.Shoppingcart;
import com.ecom.slayer.service.ShoppingcartLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Ecom
 * @generated
 */
public abstract class ShoppingcartActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ShoppingcartActionableDynamicQuery() throws SystemException {
		setBaseLocalService(ShoppingcartLocalServiceUtil.getService());
		setClass(Shoppingcart.class);

		setClassLoader(com.ecom.slayer.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("cartId");
	}
}