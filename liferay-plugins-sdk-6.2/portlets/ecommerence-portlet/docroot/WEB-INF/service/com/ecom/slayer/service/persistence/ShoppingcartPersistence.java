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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the shoppingcart service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ecom
 * @see ShoppingcartPersistenceImpl
 * @see ShoppingcartUtil
 * @generated
 */
public interface ShoppingcartPersistence extends BasePersistence<Shoppingcart> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ShoppingcartUtil} to access the shoppingcart persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the shoppingcart in the entity cache if it is enabled.
	*
	* @param shoppingcart the shoppingcart
	*/
	public void cacheResult(com.ecom.slayer.model.Shoppingcart shoppingcart);

	/**
	* Caches the shoppingcarts in the entity cache if it is enabled.
	*
	* @param shoppingcarts the shoppingcarts
	*/
	public void cacheResult(
		java.util.List<com.ecom.slayer.model.Shoppingcart> shoppingcarts);

	/**
	* Creates a new shoppingcart with the primary key. Does not add the shoppingcart to the database.
	*
	* @param cartId the primary key for the new shoppingcart
	* @return the new shoppingcart
	*/
	public com.ecom.slayer.model.Shoppingcart create(long cartId);

	/**
	* Removes the shoppingcart with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cartId the primary key of the shoppingcart
	* @return the shoppingcart that was removed
	* @throws com.ecom.slayer.NoSuchShoppingcartException if a shoppingcart with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ecom.slayer.model.Shoppingcart remove(long cartId)
		throws com.ecom.slayer.NoSuchShoppingcartException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.ecom.slayer.model.Shoppingcart updateImpl(
		com.ecom.slayer.model.Shoppingcart shoppingcart)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the shoppingcart with the primary key or throws a {@link com.ecom.slayer.NoSuchShoppingcartException} if it could not be found.
	*
	* @param cartId the primary key of the shoppingcart
	* @return the shoppingcart
	* @throws com.ecom.slayer.NoSuchShoppingcartException if a shoppingcart with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ecom.slayer.model.Shoppingcart findByPrimaryKey(long cartId)
		throws com.ecom.slayer.NoSuchShoppingcartException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the shoppingcart with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cartId the primary key of the shoppingcart
	* @return the shoppingcart, or <code>null</code> if a shoppingcart with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ecom.slayer.model.Shoppingcart fetchByPrimaryKey(long cartId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the shoppingcarts.
	*
	* @return the shoppingcarts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ecom.slayer.model.Shoppingcart> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the shoppingcarts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ecom.slayer.model.impl.ShoppingcartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shoppingcarts
	* @param end the upper bound of the range of shoppingcarts (not inclusive)
	* @return the range of shoppingcarts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ecom.slayer.model.Shoppingcart> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the shoppingcarts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ecom.slayer.model.impl.ShoppingcartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shoppingcarts
	* @param end the upper bound of the range of shoppingcarts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of shoppingcarts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ecom.slayer.model.Shoppingcart> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the shoppingcarts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of shoppingcarts.
	*
	* @return the number of shoppingcarts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}