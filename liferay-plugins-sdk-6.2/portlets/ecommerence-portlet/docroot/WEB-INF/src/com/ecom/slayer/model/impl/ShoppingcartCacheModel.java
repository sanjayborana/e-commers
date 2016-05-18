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

package com.ecom.slayer.model.impl;

import com.ecom.slayer.model.Shoppingcart;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Shoppingcart in entity cache.
 *
 * @author Ecom
 * @see Shoppingcart
 * @generated
 */
public class ShoppingcartCacheModel implements CacheModel<Shoppingcart>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{cartId=");
		sb.append(cartId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", itemId=");
		sb.append(itemId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Shoppingcart toEntityModel() {
		ShoppingcartImpl shoppingcartImpl = new ShoppingcartImpl();

		shoppingcartImpl.setCartId(cartId);
		shoppingcartImpl.setGroupId(groupId);
		shoppingcartImpl.setCompanyId(companyId);
		shoppingcartImpl.setUserId(userId);

		if (userName == null) {
			shoppingcartImpl.setUserName(StringPool.BLANK);
		}
		else {
			shoppingcartImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			shoppingcartImpl.setCreateDate(null);
		}
		else {
			shoppingcartImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			shoppingcartImpl.setModifiedDate(null);
		}
		else {
			shoppingcartImpl.setModifiedDate(new Date(modifiedDate));
		}

		shoppingcartImpl.setItemId(itemId);

		shoppingcartImpl.resetOriginalValues();

		return shoppingcartImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cartId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		itemId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cartId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(itemId);
	}

	public long cartId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long itemId;
}