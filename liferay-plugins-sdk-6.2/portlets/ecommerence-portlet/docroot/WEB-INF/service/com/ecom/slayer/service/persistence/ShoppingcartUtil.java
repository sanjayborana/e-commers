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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the shoppingcart service. This utility wraps {@link ShoppingcartPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ecom
 * @see ShoppingcartPersistence
 * @see ShoppingcartPersistenceImpl
 * @generated
 */
public class ShoppingcartUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Shoppingcart shoppingcart) {
		getPersistence().clearCache(shoppingcart);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Shoppingcart> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Shoppingcart> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Shoppingcart> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Shoppingcart update(Shoppingcart shoppingcart)
		throws SystemException {
		return getPersistence().update(shoppingcart);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Shoppingcart update(Shoppingcart shoppingcart,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(shoppingcart, serviceContext);
	}

	/**
	* Caches the shoppingcart in the entity cache if it is enabled.
	*
	* @param shoppingcart the shoppingcart
	*/
	public static void cacheResult(
		com.ecom.slayer.model.Shoppingcart shoppingcart) {
		getPersistence().cacheResult(shoppingcart);
	}

	/**
	* Caches the shoppingcarts in the entity cache if it is enabled.
	*
	* @param shoppingcarts the shoppingcarts
	*/
	public static void cacheResult(
		java.util.List<com.ecom.slayer.model.Shoppingcart> shoppingcarts) {
		getPersistence().cacheResult(shoppingcarts);
	}

	/**
	* Creates a new shoppingcart with the primary key. Does not add the shoppingcart to the database.
	*
	* @param cartId the primary key for the new shoppingcart
	* @return the new shoppingcart
	*/
	public static com.ecom.slayer.model.Shoppingcart create(long cartId) {
		return getPersistence().create(cartId);
	}

	/**
	* Removes the shoppingcart with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cartId the primary key of the shoppingcart
	* @return the shoppingcart that was removed
	* @throws com.ecom.slayer.NoSuchShoppingcartException if a shoppingcart with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ecom.slayer.model.Shoppingcart remove(long cartId)
		throws com.ecom.slayer.NoSuchShoppingcartException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cartId);
	}

	public static com.ecom.slayer.model.Shoppingcart updateImpl(
		com.ecom.slayer.model.Shoppingcart shoppingcart)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(shoppingcart);
	}

	/**
	* Returns the shoppingcart with the primary key or throws a {@link com.ecom.slayer.NoSuchShoppingcartException} if it could not be found.
	*
	* @param cartId the primary key of the shoppingcart
	* @return the shoppingcart
	* @throws com.ecom.slayer.NoSuchShoppingcartException if a shoppingcart with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ecom.slayer.model.Shoppingcart findByPrimaryKey(
		long cartId)
		throws com.ecom.slayer.NoSuchShoppingcartException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cartId);
	}

	/**
	* Returns the shoppingcart with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cartId the primary key of the shoppingcart
	* @return the shoppingcart, or <code>null</code> if a shoppingcart with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ecom.slayer.model.Shoppingcart fetchByPrimaryKey(
		long cartId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cartId);
	}

	/**
	* Returns all the shoppingcarts.
	*
	* @return the shoppingcarts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ecom.slayer.model.Shoppingcart> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ecom.slayer.model.Shoppingcart> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ecom.slayer.model.Shoppingcart> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the shoppingcarts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of shoppingcarts.
	*
	* @return the number of shoppingcarts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ShoppingcartPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ShoppingcartPersistence)PortletBeanLocatorUtil.locate(com.ecom.slayer.service.ClpSerializer.getServletContextName(),
					ShoppingcartPersistence.class.getName());

			ReferenceRegistry.registerReference(ShoppingcartUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ShoppingcartPersistence persistence) {
	}

	private static ShoppingcartPersistence _persistence;
}