package com.pharmakeyring.hcm.hcmservice.dto;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.util.List;

/**
 * 药品出库信息
 */
@Data
public class DrugDeliveryInfoDto {

    /**
     * 安全标识
     */
    private String appKey;

    /**
     * 安全密钥
     */
    private String appSecret;

    /**
     * 医院编码
     */
    private String hosCode;

    /**
     * 医院名称
     */
    private String hosName;

    /**
     * 出库医院药房编码
     */
    private String storageCode;

    /**
     * 出库医院药房名称
     */
    private String storageName;

    /**
     * 配送商编码
     */
    private String supplierCode;

    /**
     * 配送商名称
     */
    private String supplierName;

    /**
     * 出库日期
     */
    private String statiDate;

    /**
     * 出库明细List
     */
    private List<DrugDeliveryDetailsDto> drugDeliveryDetailsDtoList;
}
