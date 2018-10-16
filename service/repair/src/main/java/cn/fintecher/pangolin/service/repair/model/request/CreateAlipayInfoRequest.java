package cn.fintecher.pangolin.service.repair.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author : hanwannan
 * @Description : 新增支付宝信息
 * @Date : 2018/8/27.
 */
@Data
public class CreateAlipayInfoRequest {

    @ApiModelProperty(notes = "姓名")
    private String name;

    @ApiModelProperty("身份证号")
    private String idNo;

    @ApiModelProperty("银行")
    private String bank;

    @ApiModelProperty("申调地区")
    private String applyTransferArea;

    @ApiModelProperty("申调时间")
    private Date applyTransferTime;

    @ApiModelProperty("座机")
    private String landLinePhone;

    @ApiModelProperty("手机")
    private String mobile;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("备注")
    private String remark;
}
