package com.listadecompras.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class JoinPurchaseProduct {
    @Id
    private Long id;
    private Long purchaseId;
    private Long productId;
    @Generated(hash = 1174724543)
    public JoinPurchaseProduct(Long id, Long purchaseId, Long productId) {
        this.id = id;
        this.purchaseId = purchaseId;
        this.productId = productId;
    }
    @Generated(hash = 221906108)
    public JoinPurchaseProduct() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getPurchaseId() {
        return this.purchaseId;
    }
    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }
    public Long getProductId() {
        return this.productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
