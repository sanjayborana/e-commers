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

import com.ecom.slayer.NoSuchShoppingcartException;
import com.ecom.slayer.model.Shoppingcart;
import com.ecom.slayer.model.impl.ShoppingcartImpl;
import com.ecom.slayer.model.impl.ShoppingcartModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the shoppingcart service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ecom
 * @see ShoppingcartPersistence
 * @see ShoppingcartUtil
 * @generated
 */
public class ShoppingcartPersistenceImpl extends BasePersistenceImpl<Shoppingcart>
	implements ShoppingcartPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ShoppingcartUtil} to access the shoppingcart persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ShoppingcartImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
			ShoppingcartModelImpl.FINDER_CACHE_ENABLED, ShoppingcartImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
			ShoppingcartModelImpl.FINDER_CACHE_ENABLED, ShoppingcartImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
			ShoppingcartModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ShoppingcartPersistenceImpl() {
		setModelClass(Shoppingcart.class);
	}

	/**
	 * Caches the shoppingcart in the entity cache if it is enabled.
	 *
	 * @param shoppingcart the shoppingcart
	 */
	@Override
	public void cacheResult(Shoppingcart shoppingcart) {
		EntityCacheUtil.putResult(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
			ShoppingcartImpl.class, shoppingcart.getPrimaryKey(), shoppingcart);

		shoppingcart.resetOriginalValues();
	}

	/**
	 * Caches the shoppingcarts in the entity cache if it is enabled.
	 *
	 * @param shoppingcarts the shoppingcarts
	 */
	@Override
	public void cacheResult(List<Shoppingcart> shoppingcarts) {
		for (Shoppingcart shoppingcart : shoppingcarts) {
			if (EntityCacheUtil.getResult(
						ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
						ShoppingcartImpl.class, shoppingcart.getPrimaryKey()) == null) {
				cacheResult(shoppingcart);
			}
			else {
				shoppingcart.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all shoppingcarts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ShoppingcartImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ShoppingcartImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the shoppingcart.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Shoppingcart shoppingcart) {
		EntityCacheUtil.removeResult(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
			ShoppingcartImpl.class, shoppingcart.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Shoppingcart> shoppingcarts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Shoppingcart shoppingcart : shoppingcarts) {
			EntityCacheUtil.removeResult(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
				ShoppingcartImpl.class, shoppingcart.getPrimaryKey());
		}
	}

	/**
	 * Creates a new shoppingcart with the primary key. Does not add the shoppingcart to the database.
	 *
	 * @param cartId the primary key for the new shoppingcart
	 * @return the new shoppingcart
	 */
	@Override
	public Shoppingcart create(long cartId) {
		Shoppingcart shoppingcart = new ShoppingcartImpl();

		shoppingcart.setNew(true);
		shoppingcart.setPrimaryKey(cartId);

		return shoppingcart;
	}

	/**
	 * Removes the shoppingcart with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cartId the primary key of the shoppingcart
	 * @return the shoppingcart that was removed
	 * @throws com.ecom.slayer.NoSuchShoppingcartException if a shoppingcart with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Shoppingcart remove(long cartId)
		throws NoSuchShoppingcartException, SystemException {
		return remove((Serializable)cartId);
	}

	/**
	 * Removes the shoppingcart with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the shoppingcart
	 * @return the shoppingcart that was removed
	 * @throws com.ecom.slayer.NoSuchShoppingcartException if a shoppingcart with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Shoppingcart remove(Serializable primaryKey)
		throws NoSuchShoppingcartException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Shoppingcart shoppingcart = (Shoppingcart)session.get(ShoppingcartImpl.class,
					primaryKey);

			if (shoppingcart == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchShoppingcartException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(shoppingcart);
		}
		catch (NoSuchShoppingcartException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Shoppingcart removeImpl(Shoppingcart shoppingcart)
		throws SystemException {
		shoppingcart = toUnwrappedModel(shoppingcart);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shoppingcart)) {
				shoppingcart = (Shoppingcart)session.get(ShoppingcartImpl.class,
						shoppingcart.getPrimaryKeyObj());
			}

			if (shoppingcart != null) {
				session.delete(shoppingcart);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (shoppingcart != null) {
			clearCache(shoppingcart);
		}

		return shoppingcart;
	}

	@Override
	public Shoppingcart updateImpl(
		com.ecom.slayer.model.Shoppingcart shoppingcart)
		throws SystemException {
		shoppingcart = toUnwrappedModel(shoppingcart);

		boolean isNew = shoppingcart.isNew();

		Session session = null;

		try {
			session = openSession();

			if (shoppingcart.isNew()) {
				session.save(shoppingcart);

				shoppingcart.setNew(false);
			}
			else {
				session.merge(shoppingcart);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
			ShoppingcartImpl.class, shoppingcart.getPrimaryKey(), shoppingcart);

		return shoppingcart;
	}

	protected Shoppingcart toUnwrappedModel(Shoppingcart shoppingcart) {
		if (shoppingcart instanceof ShoppingcartImpl) {
			return shoppingcart;
		}

		ShoppingcartImpl shoppingcartImpl = new ShoppingcartImpl();

		shoppingcartImpl.setNew(shoppingcart.isNew());
		shoppingcartImpl.setPrimaryKey(shoppingcart.getPrimaryKey());

		shoppingcartImpl.setCartId(shoppingcart.getCartId());
		shoppingcartImpl.setGroupId(shoppingcart.getGroupId());
		shoppingcartImpl.setCompanyId(shoppingcart.getCompanyId());
		shoppingcartImpl.setUserId(shoppingcart.getUserId());
		shoppingcartImpl.setUserName(shoppingcart.getUserName());
		shoppingcartImpl.setCreateDate(shoppingcart.getCreateDate());
		shoppingcartImpl.setModifiedDate(shoppingcart.getModifiedDate());
		shoppingcartImpl.setItemId(shoppingcart.getItemId());

		return shoppingcartImpl;
	}

	/**
	 * Returns the shoppingcart with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the shoppingcart
	 * @return the shoppingcart
	 * @throws com.ecom.slayer.NoSuchShoppingcartException if a shoppingcart with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Shoppingcart findByPrimaryKey(Serializable primaryKey)
		throws NoSuchShoppingcartException, SystemException {
		Shoppingcart shoppingcart = fetchByPrimaryKey(primaryKey);

		if (shoppingcart == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchShoppingcartException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return shoppingcart;
	}

	/**
	 * Returns the shoppingcart with the primary key or throws a {@link com.ecom.slayer.NoSuchShoppingcartException} if it could not be found.
	 *
	 * @param cartId the primary key of the shoppingcart
	 * @return the shoppingcart
	 * @throws com.ecom.slayer.NoSuchShoppingcartException if a shoppingcart with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Shoppingcart findByPrimaryKey(long cartId)
		throws NoSuchShoppingcartException, SystemException {
		return findByPrimaryKey((Serializable)cartId);
	}

	/**
	 * Returns the shoppingcart with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the shoppingcart
	 * @return the shoppingcart, or <code>null</code> if a shoppingcart with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Shoppingcart fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Shoppingcart shoppingcart = (Shoppingcart)EntityCacheUtil.getResult(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
				ShoppingcartImpl.class, primaryKey);

		if (shoppingcart == _nullShoppingcart) {
			return null;
		}

		if (shoppingcart == null) {
			Session session = null;

			try {
				session = openSession();

				shoppingcart = (Shoppingcart)session.get(ShoppingcartImpl.class,
						primaryKey);

				if (shoppingcart != null) {
					cacheResult(shoppingcart);
				}
				else {
					EntityCacheUtil.putResult(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
						ShoppingcartImpl.class, primaryKey, _nullShoppingcart);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ShoppingcartModelImpl.ENTITY_CACHE_ENABLED,
					ShoppingcartImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return shoppingcart;
	}

	/**
	 * Returns the shoppingcart with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cartId the primary key of the shoppingcart
	 * @return the shoppingcart, or <code>null</code> if a shoppingcart with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Shoppingcart fetchByPrimaryKey(long cartId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)cartId);
	}

	/**
	 * Returns all the shoppingcarts.
	 *
	 * @return the shoppingcarts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Shoppingcart> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Shoppingcart> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Shoppingcart> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Shoppingcart> list = (List<Shoppingcart>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SHOPPINGCART);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SHOPPINGCART;

				if (pagination) {
					sql = sql.concat(ShoppingcartModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Shoppingcart>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Shoppingcart>(list);
				}
				else {
					list = (List<Shoppingcart>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the shoppingcarts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Shoppingcart shoppingcart : findAll()) {
			remove(shoppingcart);
		}
	}

	/**
	 * Returns the number of shoppingcarts.
	 *
	 * @return the number of shoppingcarts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SHOPPINGCART);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the shoppingcart persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ecom.slayer.model.Shoppingcart")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Shoppingcart>> listenersList = new ArrayList<ModelListener<Shoppingcart>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Shoppingcart>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ShoppingcartImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SHOPPINGCART = "SELECT shoppingcart FROM Shoppingcart shoppingcart";
	private static final String _SQL_COUNT_SHOPPINGCART = "SELECT COUNT(shoppingcart) FROM Shoppingcart shoppingcart";
	private static final String _ORDER_BY_ENTITY_ALIAS = "shoppingcart.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Shoppingcart exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ShoppingcartPersistenceImpl.class);
	private static Shoppingcart _nullShoppingcart = new ShoppingcartImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Shoppingcart> toCacheModel() {
				return _nullShoppingcartCacheModel;
			}
		};

	private static CacheModel<Shoppingcart> _nullShoppingcartCacheModel = new CacheModel<Shoppingcart>() {
			@Override
			public Shoppingcart toEntityModel() {
				return _nullShoppingcart;
			}
		};
}