package com.pharmakeyring.hcm.hcmservice.dto;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * 药品出库明细
 */
@Data
public class DrugDeliveryDetailsDto {

    /**
     * 医院药品编码
     */
    private String goods;

    /**
     * 药品商品名称
     */
    private String name;

    /**
     * 药品通用名称
     */
    private String gName;

    /**
     * 药品规格
     */
    private String spec;

    /**
     * 生产厂家
     */
    private String producer;

    /**
     * 剂型
     */
    private String formName;

    /**
     * 包装单位
     */
    private String msUnitNo;

    /**
     * 最小包装单位
     */
    private String minMsUnitNo;

    /**
     * 包装数量
     */
    private String packNum;

    /**
     * 药品单价
     */
    private String prc;

    /**
     * 国产进口标志：国产、进口、合资
     */
    private String _import;

    /**
     * 批准文号
     */
    private String ratifier;

    /**
     * 药品医保编码
     */
    private String ybGoods;

    /**
     * 处方药类型：是、否
     */
    private String ybType;

    /**
     * OTC标志
     */
    private String otcType;

    /**
     * 品种类型：1：西药或中成药；2：中药饮片；3：器械；4：耗材；5：保健品
     */
    private String drugType;

    /**
     * 数量
     */
    private String qty;

    /**
     * 批号
     */
    private String lotNo;

    /**
     * 有效日期
     */
    private String endDate;

}
