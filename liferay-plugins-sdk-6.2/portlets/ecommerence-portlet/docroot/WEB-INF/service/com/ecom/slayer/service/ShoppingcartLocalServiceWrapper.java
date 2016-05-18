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

package com.ecom.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ShoppingcartLocalService}.
 *
 * @author Ecom
 * @see ShoppingcartLocalService
 * @generated
 */
public class ShoppingcartLocalServiceWrapper implements ShoppingcartLocalService,
	ServiceWrapper<ShoppingcartLocalService> {
	public ShoppingcartLocalServiceWrapper(
		ShoppingcartLocalService shoppingcartLocalService) {
		_shoppingcartLocalService = shoppingcartLocalService;
	}

	/**
	* Adds the shoppingcart to the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingcart the shoppingcart
	* @return the shoppingcart that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ecom.slayer.model.Shoppingcart addShoppingcart(
		com.ecom.slayer.model.Shoppingcart shoppingcart)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.addShoppingcart(shoppingcart);
	}

	/**
	* Creates a new shoppingcart with the primary key. Does not add the shoppingcart to the database.
	*
	* @param cartId the primary key for the new shoppingcart
	* @return the new shoppingcart
	*/
	@Override
	public com.ecom.slayer.model.Shoppingcart createShoppingcart(long cartId) {
		return _shoppingcartLocalService.createShoppingcart(cartId);
	}

	/**
	* Deletes the shoppingcart with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cartId the primary key of the shoppingcart
	* @return the shoppingcart that was removed
	* @throws PortalException if a shoppingcart with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ecom.slayer.model.Shoppingcart deleteShoppingcart(long cartId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.deleteShoppingcart(cartId);
	}

	/**
	* Deletes the shoppingcart from the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingcart the shoppingcart
	* @return the shoppingcart that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ecom.slayer.model.Shoppingcart deleteShoppingcart(
		com.ecom.slayer.model.Shoppingcart shoppingcart)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.deleteShoppingcart(shoppingcart);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shoppingcartLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ecom.slayer.model.impl.ShoppingcartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ecom.slayer.model.impl.ShoppingcartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ecom.slayer.model.Shoppingcart fetchShoppingcart(long cartId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.fetchShoppingcart(cartId);
	}

	/**
	* Returns the shoppingcart with the primary key.
	*
	* @param cartId the primary key of the shoppingcart
	* @return the shoppingcart
	* @throws PortalException if a shoppingcart with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ecom.slayer.model.Shoppingcart getShoppingcart(long cartId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.getShoppingcart(cartId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.ecom.slayer.model.Shoppingcart> getShoppingcarts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.getShoppingcarts(start, end);
	}

	/**
	* Returns the number of shoppingcarts.
	*
	* @return the number of shoppingcarts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getShoppingcartsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.getShoppingcartsCount();
	}

	/**
	* Updates the shoppingcart in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shoppingcart the shoppingcart
	* @return the shoppingcart that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ecom.slayer.model.Shoppingcart updateShoppingcart(
		com.ecom.slayer.model.Shoppingcart shoppingcart)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shoppingcartLocalService.updateShoppingcart(shoppingcart);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _shoppingcartLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_shoppingcartLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _shoppingcartLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ShoppingcartLocalService getWrappedShoppingcartLocalService() {
		return _shoppingcartLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedShoppingcartLocalService(
		ShoppingcartLocalService shoppingcartLocalService) {
		_shoppingcartLocalService = shoppingcartLocalService;
	}

	@Override
	public ShoppingcartLocalService getWrappedService() {
		return _shoppingcartLocalService;
	}

	@Override
	public void setWrappedService(
		ShoppingcartLocalService shoppingcartLocalService) {
		_shoppingcartLocalService = shoppingcartLocalService;
	}

	private ShoppingcartLocalService _shoppingcartLocalService;
}