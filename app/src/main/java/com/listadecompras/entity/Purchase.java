package com.listadecompras.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(nameInDb = "purchase")
public class Purchase {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "price")
    Float price;

    @Property(nameInDb = "date")
    String date;

    @Property(nameInDb = "measurement")
    Float measurement;

    @ToMany
    @JoinEntity(
            entity = JoinPurchaseProduct.class,
            sourceProperty = "purchaseId",
            targetProperty = "productId"
    )
    private List<Product> products;

    @ToMany
    @JoinEntity(
            entity = JoinPurchaseMarket.class,
            sourceProperty = "purchaseId",
            targetProperty = "marketId"
    )
    private List<Market> markets;

/** Used to resolve relations */
@Generated(hash = 2040040024)
private transient DaoSession daoSession;

/** Used for active entity operations. */
@Generated(hash = 1807587041)
private transient PurchaseDao myDao;

@Generated(hash = 1241217794)
public Purchase(Long id, Float price, String date, Float measurement) {
    this.id = id;
    this.price = price;
    this.date = date;
    this.measurement = measurement;
}

@Generated(hash = 1281646125)
public Purchase() {
}

public Long getId() {
    return this.id;
}

public void setId(Long id) {
    this.id = id;
}

public Float getPrice() {
    return this.price;
}

public void setPrice(Float price) {
    this.price = price;
}

public String getDate() {
    return this.date;
}

public void setDate(String date) {
    this.date = date;
}

public Float getMeasurement() {
    return this.measurement;
}

public void setMeasurement(Float measurement) {
    this.measurement = measurement;
}

/**
 * To-many relationship, resolved on first access (and after reset).
 * Changes to to-many relations are not persisted, make changes to the target entity.
 */
@Generated(hash = 1543680266)
public List<Product> getProducts() {
    if (products == null) {
        final DaoSession daoSession = this.daoSession;
        if (daoSession == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        ProductDao targetDao = daoSession.getProductDao();
        List<Product> productsNew = targetDao._queryPurchase_Products(id);
        synchronized (this) {
            if (products == null) {
                products = productsNew;
            }
        }
    }
    return products;
}

/** Resets a to-many relationship, making the next get call to query for a fresh result. */
@Generated(hash = 513498032)
public synchronized void resetProducts() {
    products = null;
}

/**
 * To-many relationship, resolved on first access (and after reset).
 * Changes to to-many relations are not persisted, make changes to the target entity.
 */
@Generated(hash = 1867457306)
public List<Market> getMarkets() {
    if (markets == null) {
        final DaoSession daoSession = this.daoSession;
        if (daoSession == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        MarketDao targetDao = daoSession.getMarketDao();
        List<Market> marketsNew = targetDao._queryPurchase_Markets(id);
        synchronized (this) {
            if (markets == null) {
                markets = marketsNew;
            }
        }
    }
    return markets;
}

/** Resets a to-many relationship, making the next get call to query for a fresh result. */
@Generated(hash = 784056354)
public synchronized void resetMarkets() {
    markets = null;
}

/**
 * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
 * Entity must attached to an entity context.
 */
@Generated(hash = 128553479)
public void delete() {
    if (myDao == null) {
        throw new DaoException("Entity is detached from DAO context");
    }
    myDao.delete(this);
}

/**
 * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
 * Entity must attached to an entity context.
 */
@Generated(hash = 1942392019)
public void refresh() {
    if (myDao == null) {
        throw new DaoException("Entity is detached from DAO context");
    }
    myDao.refresh(this);
}

/**
 * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
 * Entity must attached to an entity context.
 */
@Generated(hash = 713229351)
public void update() {
    if (myDao == null) {
        throw new DaoException("Entity is detached from DAO context");
    }
    myDao.update(this);
}

/** called by internal mechanisms, do not call yourself. */
@Generated(hash = 219300322)
public void __setDaoSession(DaoSession daoSession) {
    this.daoSession = daoSession;
    myDao = daoSession != null ? daoSession.getPurchaseDao() : null;
}
}
