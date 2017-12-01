package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询基金产品收益率
 *
 * @author auto create
 * @since 1.0, 2017-09-04 12:04:47
 */
public class AlipayFinanceFundFundquotationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2196428845472939732L;

	/**
	 * 基金编号：基金产品编号
	 */
	@ApiField("fund_code")
	private String fundCode;

	public String getFundCode() {
		return this.fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

}
